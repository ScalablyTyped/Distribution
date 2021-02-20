package typings.reactNotificationSystemRedux

import typings.reactNotificationSystemRedux.mod.NotificationLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNotificationSystemReduxStrings {
  
  @js.native
  sealed trait error extends NotificationLevel
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info extends NotificationLevel
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait success extends NotificationLevel
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait warning extends NotificationLevel
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}
