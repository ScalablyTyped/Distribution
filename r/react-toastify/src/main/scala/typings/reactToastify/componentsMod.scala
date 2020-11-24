package typings.reactToastify

import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import typings.reactToastify.closeButtonMod.CloseButtonProps
import typings.reactToastify.progressBarMod.ProgressBarProps
import typings.reactToastify.typesMod.ToastContainerProps
import typings.reactToastify.typesMod.ToastProps
import typings.reactToastify.typesMod.ToastTransitionProps
import typings.reactToastify.typesMod.TypeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-toastify/dist/components", JSImport.Namespace)
@js.native
object componentsMod extends js.Object {
  
  def Bounce(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = js.native
  
  def CloseButton(hasCloseToastTypeAriaLabel: CloseButtonProps): Element = js.native
  
  def Flip(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = js.native
  
  def Slide(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = js.native
  
  val Toast: FC[ToastProps] = js.native
  
  val ToastContainer: FC[ToastContainerProps] = js.native
  
  def Zoom(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = js.native
  
  @js.native
  object ProgressBar extends js.Object {
    
    def apply(
      hasDelayIsRunningCloseToastTypeHideClassNameStyleControlledProgressProgressRtlIsIn: ProgressBarProps
    ): Element = js.native
    
    @js.native
    object defaultProps extends js.Object {
      
      var hide: Boolean = js.native
      
      var `type`: TypeOptions = js.native
    }
  }
}
