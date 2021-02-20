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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("react-toastify/dist/components", "Bounce")
  @js.native
  def Bounce(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = js.native
  
  @JSImport("react-toastify/dist/components", "CloseButton")
  @js.native
  def CloseButton(hasCloseToastTypeAriaLabel: CloseButtonProps): Element = js.native
  
  @JSImport("react-toastify/dist/components", "Flip")
  @js.native
  def Flip(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = js.native
  
  object ProgressBar {
    
    @JSImport("react-toastify/dist/components", "ProgressBar")
    @js.native
    def apply(
      hasDelayIsRunningCloseToastTypeHideClassNameStyleControlledProgressProgressRtlIsIn: ProgressBarProps
    ): Element = js.native
    
    object defaultProps {
      
      @JSImport("react-toastify/dist/components", "ProgressBar.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-toastify/dist/components", "ProgressBar.defaultProps.hide")
      @js.native
      def hide: Boolean = js.native
      @scala.inline
      def hide_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hide")(x.asInstanceOf[js.Any])
      
      @JSImport("react-toastify/dist/components", "ProgressBar.defaultProps.type")
      @js.native
      val `type`: TypeOptions = js.native
    }
  }
  
  @JSImport("react-toastify/dist/components", "Slide")
  @js.native
  def Slide(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = js.native
  
  @JSImport("react-toastify/dist/components", "Toast")
  @js.native
  val Toast: FC[ToastProps] = js.native
  
  @JSImport("react-toastify/dist/components", "ToastContainer")
  @js.native
  val ToastContainer: FC[ToastContainerProps] = js.native
  
  @JSImport("react-toastify/dist/components", "Zoom")
  @js.native
  def Zoom(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = js.native
}
