package typings.ravenJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event/Breadcrumb Severity. `critical` is for Breadcrumbs only and `fatal` is for Events only. */
/* Rewritten from type alias, can be one of: 
  - typings.ravenJs.ravenJsStrings.critical
  - typings.ravenJs.ravenJsStrings.fatal
  - typings.ravenJs.ravenJsStrings.error
  - typings.ravenJs.ravenJsStrings.warning
  - typings.ravenJs.ravenJsStrings.info
  - typings.ravenJs.ravenJsStrings.debug
  - typings.ravenJs.ravenJsStrings.warn
  - typings.ravenJs.ravenJsStrings.log
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def critical: typings.ravenJs.ravenJsStrings.critical = this.cast("critical")
  @scala.inline
  def debug: typings.ravenJs.ravenJsStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.ravenJs.ravenJsStrings.error = this.cast("error")
  @scala.inline
  def fatal: typings.ravenJs.ravenJsStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typings.ravenJs.ravenJsStrings.info = this.cast("info")
  @scala.inline
  def log: typings.ravenJs.ravenJsStrings.log = this.cast("log")
  @scala.inline
  def warn: typings.ravenJs.ravenJsStrings.warn = this.cast("warn")
  @scala.inline
  def warning: typings.ravenJs.ravenJsStrings.warning = this.cast("warning")
}

