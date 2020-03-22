package typings.server

import typings.server.commonMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object serverStrings {
  @js.native
  sealed trait alert extends LogLevel
  
  @js.native
  sealed trait critical extends LogLevel
  
  @js.native
  sealed trait debug extends LogLevel
  
  @js.native
  sealed trait emergency extends LogLevel
  
  @js.native
  sealed trait error extends LogLevel
  
  @js.native
  sealed trait info extends LogLevel
  
  @js.native
  sealed trait notice extends LogLevel
  
  @js.native
  sealed trait warning extends LogLevel
  
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

