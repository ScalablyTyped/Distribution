package typings.ravenDashJs

import typings.ravenDashJs.ravenDashJsMod.BreadcrumbType
import typings.ravenDashJs.ravenDashJsMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ravenDashJsStrings {
  @js.native
  sealed trait critical extends LogLevel
  
  @js.native
  sealed trait debug extends LogLevel
  
  @js.native
  sealed trait error extends LogLevel
  
  @js.native
  sealed trait fatal extends LogLevel
  
  @js.native
  sealed trait http extends BreadcrumbType
  
  @js.native
  sealed trait info extends LogLevel
  
  @js.native
  sealed trait log extends LogLevel
  
  @js.native
  sealed trait navigation extends BreadcrumbType
  
  @js.native
  sealed trait warn extends LogLevel
  
  @js.native
  sealed trait warning extends LogLevel
  
  @scala.inline
  def critical: critical = "critical".asInstanceOf[critical]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  @scala.inline
  def navigation: navigation = "navigation".asInstanceOf[navigation]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}

