package typings.reactReduxToastr

import typings.reactReduxToastr.mod.iconType
import typings.reactReduxToastr.mod.positionType
import typings.reactReduxToastr.mod.toastType
import typings.reactReduxToastr.mod.transitionInType
import typings.reactReduxToastr.mod.transitionOutType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactReduxToastrStrings {
  
  @js.native
  sealed trait `bottom-center` extends positionType
  @scala.inline
  def `bottom-center`: `bottom-center` = "bottom-center".asInstanceOf[`bottom-center`]
  
  @js.native
  sealed trait `bottom-left` extends positionType
  @scala.inline
  def `bottom-left`: `bottom-left` = "bottom-left".asInstanceOf[`bottom-left`]
  
  @js.native
  sealed trait `bottom-right` extends positionType
  @scala.inline
  def `bottom-right`: `bottom-right` = "bottom-right".asInstanceOf[`bottom-right`]
  
  @js.native
  sealed trait bounceIn extends transitionInType
  @scala.inline
  def bounceIn: bounceIn = "bounceIn".asInstanceOf[bounceIn]
  
  @js.native
  sealed trait bounceInDown extends transitionInType
  @scala.inline
  def bounceInDown: bounceInDown = "bounceInDown".asInstanceOf[bounceInDown]
  
  @js.native
  sealed trait bounceOut extends transitionOutType
  @scala.inline
  def bounceOut: bounceOut = "bounceOut".asInstanceOf[bounceOut]
  
  @js.native
  sealed trait bounceOutUp extends transitionOutType
  @scala.inline
  def bounceOutUp: bounceOutUp = "bounceOutUp".asInstanceOf[bounceOutUp]
  
  @js.native
  sealed trait confirm extends toastType
  @scala.inline
  def confirm: confirm = "confirm".asInstanceOf[confirm]
  
  @js.native
  sealed trait error
    extends iconType
       with toastType
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fadeIn extends transitionInType
  @scala.inline
  def fadeIn: fadeIn = "fadeIn".asInstanceOf[fadeIn]
  
  @js.native
  sealed trait fadeOut extends transitionOutType
  @scala.inline
  def fadeOut: fadeOut = "fadeOut".asInstanceOf[fadeOut]
  
  @js.native
  sealed trait info
    extends iconType
       with toastType
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait light extends toastType
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait message extends toastType
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait success
    extends iconType
       with toastType
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait `top-center` extends positionType
  @scala.inline
  def `top-center`: `top-center` = "top-center".asInstanceOf[`top-center`]
  
  @js.native
  sealed trait `top-left` extends positionType
  @scala.inline
  def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  
  @js.native
  sealed trait `top-right` extends positionType
  @scala.inline
  def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  
  @js.native
  sealed trait warning
    extends iconType
       with toastType
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}
