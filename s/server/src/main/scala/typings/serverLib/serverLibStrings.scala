package typings
package serverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object serverLibStrings {
  @js.native
  sealed trait Context extends js.Object
  
  @js.native
  sealed trait alert
    extends serverLib.typingsCommonMod.LogLevel
  
  @js.native
  sealed trait critical
    extends serverLib.typingsCommonMod.LogLevel
  
  @js.native
  sealed trait debug
    extends serverLib.typingsCommonMod.LogLevel
  
  @js.native
  sealed trait emergency
    extends serverLib.typingsCommonMod.LogLevel
  
  @js.native
  sealed trait error
    extends serverLib.typingsCommonMod.LogLevel
  
  @js.native
  sealed trait info
    extends serverLib.typingsCommonMod.LogLevel
  
  @js.native
  sealed trait notice
    extends serverLib.typingsCommonMod.LogLevel
  
  @js.native
  sealed trait warning
    extends serverLib.typingsCommonMod.LogLevel
  
  @scala.inline
  def Context: Context = "Context".asInstanceOf[Context]
  @scala.inline
  def alert: alert = "alert".asInstanceOf[alert]
  @scala.inline
  def critical: critical = "critical".asInstanceOf[critical]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def emergency: emergency = "emergency".asInstanceOf[emergency]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def notice: notice = "notice".asInstanceOf[notice]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}

