package typings.ravenDashJs.ravenDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event/Breadcrumb Severity. `critical` is for Breadcrumbs only and `fatal` is for Events only. */
/* Rewritten from type alias, can be one of: 
  - typings.ravenDashJs.ravenDashJsStrings.critical
  - typings.ravenDashJs.ravenDashJsStrings.fatal
  - typings.ravenDashJs.ravenDashJsStrings.error
  - typings.ravenDashJs.ravenDashJsStrings.warning
  - typings.ravenDashJs.ravenDashJsStrings.info
  - typings.ravenDashJs.ravenDashJsStrings.debug
  - typings.ravenDashJs.ravenDashJsStrings.warn
  - typings.ravenDashJs.ravenDashJsStrings.log
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def critical: typings.ravenDashJs.ravenDashJsStrings.critical = this.cast("critical")
  @scala.inline
  def debug: typings.ravenDashJs.ravenDashJsStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.ravenDashJs.ravenDashJsStrings.error = this.cast("error")
  @scala.inline
  def fatal: typings.ravenDashJs.ravenDashJsStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typings.ravenDashJs.ravenDashJsStrings.info = this.cast("info")
  @scala.inline
  def log: typings.ravenDashJs.ravenDashJsStrings.log = this.cast("log")
  @scala.inline
  def warn: typings.ravenDashJs.ravenDashJsStrings.warn = this.cast("warn")
  @scala.inline
  def warning: typings.ravenDashJs.ravenDashJsStrings.warning = this.cast("warning")
}

