package typings.reactToastify

import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import typings.reactToastify.closeButtonMod.CloseButtonProps
import typings.reactToastify.progressBarMod.ProgressBarProps
import typings.reactToastify.typesMod.ToastContainerProps
import typings.reactToastify.typesMod.ToastProps
import typings.reactToastify.typesMod.ToastTransitionProps
import typings.reactToastify.typesMod.TypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("react-toastify/dist/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Bounce(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Bounce")(hasChildrenPositionPreventExitTransitionDoneProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def CloseButton(hasCloseToastTypeAriaLabel: CloseButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CloseButton")(hasCloseToastTypeAriaLabel.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Flip(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Flip")(hasChildrenPositionPreventExitTransitionDoneProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object ProgressBar {
    
    inline def apply(
      hasDelayIsRunningCloseToastTypeHideClassNameUserStyleControlledProgressProgressRtlIsIn: ProgressBarProps
    ): Element = ^.asInstanceOf[js.Dynamic].apply(hasDelayIsRunningCloseToastTypeHideClassNameUserStyleControlledProgressProgressRtlIsIn.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-toastify/dist/components", "ProgressBar")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("react-toastify/dist/components", "ProgressBar.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-toastify/dist/components", "ProgressBar.defaultProps.hide")
      @js.native
      def hide: Boolean = js.native
      inline def hide_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hide")(x.asInstanceOf[js.Any])
      
      @JSImport("react-toastify/dist/components", "ProgressBar.defaultProps.type")
      @js.native
      val `type`: TypeOptions = js.native
    }
  }
  
  inline def Slide(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Slide")(hasChildrenPositionPreventExitTransitionDoneProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-toastify/dist/components", "Toast")
  @js.native
  val Toast: FC[ToastProps] = js.native
  
  @JSImport("react-toastify/dist/components", "ToastContainer")
  @js.native
  val ToastContainer: FC[ToastContainerProps] = js.native
  
  inline def Zoom(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Zoom")(hasChildrenPositionPreventExitTransitionDoneProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
