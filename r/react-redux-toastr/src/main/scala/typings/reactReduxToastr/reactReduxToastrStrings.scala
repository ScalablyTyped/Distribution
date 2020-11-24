package typings.reactReduxToastr

import typings.reactReduxToastr.mod.iconType
import typings.reactReduxToastr.mod.positionType
import typings.reactReduxToastr.mod.toastType
import typings.reactReduxToastr.mod.transitionInType
import typings.reactReduxToastr.mod.transitionOutType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactReduxToastrStrings {
  
  @scala.inline
  def `bottom-center`: `bottom-center` = "bottom-center".asInstanceOf[`bottom-center`]
  
  @scala.inline
  def `bottom-left`: `bottom-left` = "bottom-left".asInstanceOf[`bottom-left`]
  
  @scala.inline
  def `bottom-right`: `bottom-right` = "bottom-right".asInstanceOf[`bottom-right`]
  
  @scala.inline
  def bounceIn: bounceIn = "bounceIn".asInstanceOf[bounceIn]
  
  @scala.inline
  def bounceInDown: bounceInDown = "bounceInDown".asInstanceOf[bounceInDown]
  
  @scala.inline
  def bounceOut: bounceOut = "bounceOut".asInstanceOf[bounceOut]
  
  @scala.inline
  def bounceOutUp: bounceOutUp = "bounceOutUp".asInstanceOf[bounceOutUp]
  
  @scala.inline
  def confirm: confirm = "confirm".asInstanceOf[confirm]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def fadeIn: fadeIn = "fadeIn".asInstanceOf[fadeIn]
  
  @scala.inline
  def fadeOut: fadeOut = "fadeOut".asInstanceOf[fadeOut]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @scala.inline
  def `top-center`: `top-center` = "top-center".asInstanceOf[`top-center`]
  
  @scala.inline
  def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  
  @scala.inline
  def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait `bottom-center` extends positionType
  
  @js.native
  sealed trait `bottom-left` extends positionType
  
  @js.native
  sealed trait `bottom-right` extends positionType
  
  @js.native
  sealed trait bounceIn extends transitionInType
  
  @js.native
  sealed trait bounceInDown extends transitionInType
  
  @js.native
  sealed trait bounceOut extends transitionOutType
  
  @js.native
  sealed trait bounceOutUp extends transitionOutType
  
  @js.native
  sealed trait confirm extends toastType
  
  @js.native
  sealed trait error
    extends iconType
       with toastType
  
  @js.native
  sealed trait fadeIn extends transitionInType
  
  @js.native
  sealed trait fadeOut extends transitionOutType
  
  @js.native
  sealed trait info
    extends iconType
       with toastType
  
  @js.native
  sealed trait light extends toastType
  
  @js.native
  sealed trait message extends toastType
  
  @js.native
  sealed trait success
    extends iconType
       with toastType
  
  @js.native
  sealed trait `top-center` extends positionType
  
  @js.native
  sealed trait `top-left` extends positionType
  
  @js.native
  sealed trait `top-right` extends positionType
  
  @js.native
  sealed trait warning
    extends iconType
       with toastType
}
