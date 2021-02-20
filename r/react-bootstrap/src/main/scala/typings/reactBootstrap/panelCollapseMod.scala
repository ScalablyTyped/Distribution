package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelCollapseMod {
  
  @JSImport("react-bootstrap/lib/PanelCollapse", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PanelCollapseProps, js.Object, js.Any]
  
  @js.native
  trait PanelCollapse
    extends Component[PanelCollapseProps, js.Object, js.Any]
  
  @js.native
  trait PanelCollapseProps extends HTMLProps[PanelCollapse] {
    
    var bsClass: js.UndefOr[String] = js.native
    
    var onEnter: js.UndefOr[js.Function] = js.native
    
    var onEntered: js.UndefOr[js.Function] = js.native
    
    var onEntering: js.UndefOr[js.Function] = js.native
    
    var onExit: js.UndefOr[js.Function] = js.native
    
    var onExited: js.UndefOr[js.Function] = js.native
    
    var onExiting: js.UndefOr[js.Function] = js.native
  }
  object PanelCollapseProps {
    
    @scala.inline
    def apply(): PanelCollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelCollapseProps]
    }
    
    @scala.inline
    implicit class PanelCollapsePropsMutableBuilder[Self <: PanelCollapseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setOnEnter(value: js.Function): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnEntered(value: js.Function): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      @scala.inline
      def setOnEntering(value: js.Function): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      @scala.inline
      def setOnExit(value: js.Function): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnExited(value: js.Function): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      @scala.inline
      def setOnExiting(value: js.Function): Self = StObject.set(x, "onExiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
    }
  }
}
