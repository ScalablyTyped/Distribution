package typings.reactDashAlert

import typings.reactDashAlert.reactDashAlertMod.AlertPosition
import typings.reactDashAlert.reactDashAlertMod.AlertTransition
import typings.reactDashAlert.reactDashAlertMod.AlertType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashAlertStrings {
  @js.native
  sealed trait alert extends js.Object
  
  @js.native
  sealed trait `bottom center` extends AlertPosition
  
  @js.native
  sealed trait `bottom left` extends AlertPosition
  
  @js.native
  sealed trait `bottom right` extends AlertPosition
  
  @js.native
  sealed trait error extends AlertType
  
  @js.native
  sealed trait fade extends AlertTransition
  
  @js.native
  sealed trait info extends AlertType
  
  @js.native
  sealed trait middle extends AlertPosition
  
  @js.native
  sealed trait `middle left` extends AlertPosition
  
  @js.native
  sealed trait `middle right` extends AlertPosition
  
  @js.native
  sealed trait scale extends AlertTransition
  
  @js.native
  sealed trait success extends AlertType
  
  @js.native
  sealed trait `top center` extends AlertPosition
  
  @js.native
  sealed trait `top left` extends AlertPosition
  
  @js.native
  sealed trait `top right` extends AlertPosition
  
  @scala.inline
  def alert: alert = "alert".asInstanceOf[alert]
  @scala.inline
  def `bottom center`: `bottom center` = "bottom center".asInstanceOf[`bottom center`]
  @scala.inline
  def `bottom left`: `bottom left` = "bottom left".asInstanceOf[`bottom left`]
  @scala.inline
  def `bottom right`: `bottom right` = "bottom right".asInstanceOf[`bottom right`]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def fade: fade = "fade".asInstanceOf[fade]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  @scala.inline
  def `middle left`: `middle left` = "middle left".asInstanceOf[`middle left`]
  @scala.inline
  def `middle right`: `middle right` = "middle right".asInstanceOf[`middle right`]
  @scala.inline
  def scale: scale = "scale".asInstanceOf[scale]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def `top center`: `top center` = "top center".asInstanceOf[`top center`]
  @scala.inline
  def `top left`: `top left` = "top left".asInstanceOf[`top left`]
  @scala.inline
  def `top right`: `top right` = "top right".asInstanceOf[`top right`]
}

