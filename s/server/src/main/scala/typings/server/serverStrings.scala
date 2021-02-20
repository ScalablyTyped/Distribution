package typings.server

import typings.server.commonMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverStrings {
  
  @js.native
  sealed trait alert extends LogLevel
  @scala.inline
  def alert: alert = "alert".asInstanceOf[alert]
  
  @js.native
  sealed trait critical extends LogLevel
  @scala.inline
  def critical: critical = "critical".asInstanceOf[critical]
  
  @js.native
  sealed trait debug extends LogLevel
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait emergency extends LogLevel
  @scala.inline
  def emergency: emergency = "emergency".asInstanceOf[emergency]
  
  @js.native
  sealed trait error extends LogLevel
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info extends LogLevel
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait notice extends LogLevel
  @scala.inline
  def notice: notice = "notice".asInstanceOf[notice]
  
  @js.native
  sealed trait warning extends LogLevel
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}
