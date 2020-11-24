package typings.reactNotificationSystemRedux

import typings.reactNotificationSystemRedux.mod.NotificationLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNotificationSystemReduxStrings {
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait error extends NotificationLevel
  
  @js.native
  sealed trait info extends NotificationLevel
  
  @js.native
  sealed trait success extends NotificationLevel
  
  @js.native
  sealed trait warning extends NotificationLevel
}
