package typings
package serverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object serverLibStrings {
  @js.native
  sealed trait alert extends js.Object
  
  @js.native
  sealed trait critical extends js.Object
  
  @js.native
  sealed trait debug extends js.Object
  
  @js.native
  sealed trait emergency extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait info extends js.Object
  
  @js.native
  sealed trait notice extends js.Object
  
  @js.native
  sealed trait warning extends js.Object
  
  def alert: alert = "alert".asInstanceOf[alert]
  def critical: critical = "critical".asInstanceOf[critical]
  def debug: debug = "debug".asInstanceOf[debug]
  def emergency: emergency = "emergency".asInstanceOf[emergency]
  def error: error = "error".asInstanceOf[error]
  def info: info = "info".asInstanceOf[info]
  def notice: notice = "notice".asInstanceOf[notice]
  def warning: warning = "warning".asInstanceOf[warning]
}

