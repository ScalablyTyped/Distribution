package typings.server

import typings.server.typingsCommonMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverStrings {
  
  @js.native
  sealed trait alert
    extends StObject
       with LogLevel
  inline def alert: alert = "alert".asInstanceOf[alert]
  
  @js.native
  sealed trait critical
    extends StObject
       with LogLevel
  inline def critical: critical = "critical".asInstanceOf[critical]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait emergency
    extends StObject
       with LogLevel
  inline def emergency: emergency = "emergency".asInstanceOf[emergency]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait notice
    extends StObject
       with LogLevel
  inline def notice: notice = "notice".asInstanceOf[notice]
  
  @js.native
  sealed trait warning
    extends StObject
       with LogLevel
  inline def warning: warning = "warning".asInstanceOf[warning]
}
