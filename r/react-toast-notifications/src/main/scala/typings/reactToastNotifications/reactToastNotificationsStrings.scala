package typings.reactToastNotifications

import typings.reactToastNotifications.mod.AppearanceTypes
import typings.reactToastNotifications.mod.Placement
import typings.reactToastNotifications.mod.TransitionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactToastNotificationsStrings {
  @js.native
  sealed trait `bottom-center` extends Placement
  
  @js.native
  sealed trait `bottom-left` extends Placement
  
  @js.native
  sealed trait `bottom-right` extends Placement
  
  @js.native
  sealed trait entered extends TransitionState
  
  @js.native
  sealed trait entering extends TransitionState
  
  @js.native
  sealed trait error extends AppearanceTypes
  
  @js.native
  sealed trait exited extends TransitionState
  
  @js.native
  sealed trait exiting extends TransitionState
  
  @js.native
  sealed trait info extends AppearanceTypes
  
  @js.native
  sealed trait success extends AppearanceTypes
  
  @js.native
  sealed trait `top-center` extends Placement
  
  @js.native
  sealed trait `top-left` extends Placement
  
  @js.native
  sealed trait `top-right` extends Placement
  
  @js.native
  sealed trait warning extends AppearanceTypes
  
  @scala.inline
  def `bottom-center`: `bottom-center` = "bottom-center".asInstanceOf[`bottom-center`]
  @scala.inline
  def `bottom-left`: `bottom-left` = "bottom-left".asInstanceOf[`bottom-left`]
  @scala.inline
  def `bottom-right`: `bottom-right` = "bottom-right".asInstanceOf[`bottom-right`]
  @scala.inline
  def entered: entered = "entered".asInstanceOf[entered]
  @scala.inline
  def entering: entering = "entering".asInstanceOf[entering]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def exited: exited = "exited".asInstanceOf[exited]
  @scala.inline
  def exiting: exiting = "exiting".asInstanceOf[exiting]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
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
}

