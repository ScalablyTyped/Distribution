package typings.reactMdOverlay

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import typings.reactMdTransition.typesMod.OverridableCSSTransitionProps
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("@react-md/overlay/types/Overlay", "Overlay")
  @js.native
  val Overlay: ForwardRefExoticComponent[OverlayProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait OverlayProps
    extends StObject
       with OverridableCSSTransitionProps
       with RenderConditionalPortalProps
       with HTMLAttributes[HTMLSpanElement] {
    
    /**
      * Boolean if the overlay should gain the pointer cursor while it's visible.
      * You normally want this enabled by default except when used as a modal's
      * overlay.
      */
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that should change the `visible` prop to `false`. This is used
      * so that clicking the overlay can hide the overlay.
      */
    def onRequestClose(): Unit
    
    /**
      * Boolean if the overlay is currently visible. When this prop changes, the
      * overlay will enter/exit with an opacity transition.
      */
    var visible: Boolean
  }
  object OverlayProps {
    
    inline def apply(onRequestClose: () => Unit, visible: Boolean): OverlayProps = {
      val __obj = js.Dynamic.literal(onRequestClose = js.Any.fromFunction0(onRequestClose), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayProps]
    }
    
    extension [Self <: OverlayProps](x: Self) {
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setOnRequestClose(value: () => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
