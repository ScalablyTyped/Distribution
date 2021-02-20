package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelHeadingMod {
  
  @JSImport("react-bootstrap/lib/PanelHeading", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PanelHeadingProps, js.Object, js.Any]
  
  @js.native
  trait PanelHeading
    extends Component[PanelHeadingProps, js.Object, js.Any]
  
  @js.native
  trait PanelHeadingProps extends HTMLProps[PanelHeading] {
    
    var bsClass: js.UndefOr[String] = js.native
    
    var componentClass: js.UndefOr[String] = js.native
  }
  object PanelHeadingProps {
    
    @scala.inline
    def apply(): PanelHeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelHeadingProps]
    }
    
    @scala.inline
    implicit class PanelHeadingPropsMutableBuilder[Self <: PanelHeadingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setComponentClass(value: String): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
