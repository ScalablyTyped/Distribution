package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelToggleMod {
  
  @JSImport("react-bootstrap/lib/PanelToggle", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PanelToggleProps, js.Object, js.Any]
  
  @js.native
  trait PanelToggle
    extends Component[PanelToggleProps, js.Object, js.Any]
  
  @js.native
  trait PanelToggleProps extends HTMLProps[PanelToggle] {
    
    var componentClass: js.UndefOr[String] = js.native
  }
  object PanelToggleProps {
    
    @scala.inline
    def apply(): PanelToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelToggleProps]
    }
    
    @scala.inline
    implicit class PanelTogglePropsMutableBuilder[Self <: PanelToggleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentClass(value: String): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
