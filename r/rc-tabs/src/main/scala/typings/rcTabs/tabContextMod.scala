package typings.rcTabs

import org.scalablytyped.runtime.Shortcut
import typings.rcTabs.interfaceMod.Tab
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabContextMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabContext", JSImport.Default)
  @js.native
  val default: Context[TabContextProps] = js.native
  
  @js.native
  trait TabContextProps extends StObject {
    
    var prefixCls: String = js.native
    
    var tabs: js.Array[Tab] = js.native
  }
  object TabContextProps {
    
    @scala.inline
    def apply(prefixCls: String, tabs: js.Array[Tab]): TabContextProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabContextProps]
    }
    
    @scala.inline
    implicit class TabContextPropsMutableBuilder[Self <: TabContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabs(value: js.Array[Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsVarargs(value: Tab*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    }
  }
  
  type _To = Context[TabContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `tabContextMod.foo` */
  override def _to: Context[TabContextProps] = default
}
