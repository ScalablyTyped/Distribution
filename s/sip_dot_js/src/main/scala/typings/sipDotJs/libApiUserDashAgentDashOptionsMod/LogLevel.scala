package typings.sipDotJs.libApiUserDashAgentDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sipDotJs.sipDotJsStrings.debug
  - typings.sipDotJs.sipDotJsStrings.log
  - typings.sipDotJs.sipDotJsStrings.warn
  - typings.sipDotJs.sipDotJsStrings.error
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.sipDotJs.sipDotJsStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.sipDotJs.sipDotJsStrings.error = this.cast("error")
  @scala.inline
  def log: typings.sipDotJs.sipDotJsStrings.log = this.cast("log")
  @scala.inline
  def warn: typings.sipDotJs.sipDotJsStrings.warn = this.cast("warn")
}

