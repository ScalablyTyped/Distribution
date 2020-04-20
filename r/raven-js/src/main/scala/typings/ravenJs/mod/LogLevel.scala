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
  def critical: typings.ravenJs.ravenJsStrings.critical = "critical".asInstanceOf[typings.ravenJs.ravenJsStrings.critical]
  @scala.inline
  def debug: typings.ravenJs.ravenJsStrings.debug = "debug".asInstanceOf[typings.ravenJs.ravenJsStrings.debug]
  @scala.inline
  def error: typings.ravenJs.ravenJsStrings.error = "error".asInstanceOf[typings.ravenJs.ravenJsStrings.error]
  @scala.inline
  def fatal: typings.ravenJs.ravenJsStrings.fatal = "fatal".asInstanceOf[typings.ravenJs.ravenJsStrings.fatal]
  @scala.inline
  def info: typings.ravenJs.ravenJsStrings.info = "info".asInstanceOf[typings.ravenJs.ravenJsStrings.info]
  @scala.inline
  def log: typings.ravenJs.ravenJsStrings.log = "log".asInstanceOf[typings.ravenJs.ravenJsStrings.log]
  @scala.inline
  def warn: typings.ravenJs.ravenJsStrings.warn = "warn".asInstanceOf[typings.ravenJs.ravenJsStrings.warn]
  @scala.inline
  def warning: typings.ravenJs.ravenJsStrings.warning = "warning".asInstanceOf[typings.ravenJs.ravenJsStrings.warning]
}

