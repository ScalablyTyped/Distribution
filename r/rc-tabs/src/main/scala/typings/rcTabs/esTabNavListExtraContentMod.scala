package typings.rcTabs

import org.scalablytyped.runtime.Shortcut
import typings.rcTabs.esInterfaceMod.TabBarExtraContent
import typings.rcTabs.esInterfaceMod.TabBarExtraPosition
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabNavListExtraContentMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabNavList/ExtraContent", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ExtraContentProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait ExtraContentProps extends StObject {
    
    var extra: js.UndefOr[TabBarExtraContent] = js.undefined
    
    var position: TabBarExtraPosition
    
    var prefixCls: String
  }
  object ExtraContentProps {
    
    inline def apply(position: TabBarExtraPosition, prefixCls: String): ExtraContentProps = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtraContentProps]
    }
    
    extension [Self <: ExtraContentProps](x: Self) {
      
      inline def setExtra(value: TabBarExtraContent): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setPosition(value: TabBarExtraPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[ExtraContentProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esTabNavListExtraContentMod.foo` */
  override def _to: ForwardRefExoticComponent[ExtraContentProps & RefAttributes[HTMLDivElement]] = default
}
