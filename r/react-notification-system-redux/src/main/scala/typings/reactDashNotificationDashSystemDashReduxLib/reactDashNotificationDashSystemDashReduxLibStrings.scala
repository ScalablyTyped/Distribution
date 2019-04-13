package typings
package reactDashNotificationDashSystemDashReduxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashNotificationDashSystemDashReduxLibStrings {
  @js.native
  sealed trait error
    extends reactDashNotificationDashSystemDashReduxLib.reactDashNotificationDashSystemDashReduxMod.NotificationLevel
  
  @js.native
  sealed trait info
    extends reactDashNotificationDashSystemDashReduxLib.reactDashNotificationDashSystemDashReduxMod.NotificationLevel
  
  @js.native
  sealed trait success
    extends reactDashNotificationDashSystemDashReduxLib.reactDashNotificationDashSystemDashReduxMod.NotificationLevel
  
  @js.native
  sealed trait warning
    extends reactDashNotificationDashSystemDashReduxLib.reactDashNotificationDashSystemDashReduxMod.NotificationLevel
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}

