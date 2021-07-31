package typings.storybookUi

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.NamedExoticComponent
import typings.react.mod.ReactElement
import typings.storybookUi.anon.Absolute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelMod extends Shortcut {
  
  @JSImport("@storybook/ui/dist/components/panel/panel", JSImport.Default)
  @js.native
  val default: NamedExoticComponent[Absolute] = js.native
  
  trait SafeTabProps extends StObject {
    
    var children: ReactElement
    
    var id: String
    
    var title: js.Function0[String] | String
  }
  object SafeTabProps {
    
    @scala.inline
    def apply(children: ReactElement, id: String, title: js.Function0[String] | String): SafeTabProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SafeTabProps]
    }
    
    @scala.inline
    implicit class SafeTabPropsMutableBuilder[Self <: SafeTabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: js.Function0[String] | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction0(value: () => String): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
    }
  }
  
  type _To = NamedExoticComponent[Absolute]
  
  /* This means you don't have to write `default`, but can instead just say `panelMod.foo` */
  override def _to: NamedExoticComponent[Absolute] = default
}
