package typings.sipJs.userAgentOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sipJs.sipJsStrings.debug
  - typings.sipJs.sipJsStrings.log
  - typings.sipJs.sipJsStrings.warn
  - typings.sipJs.sipJsStrings.error
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.sipJs.sipJsStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.sipJs.sipJsStrings.error = this.cast("error")
  @scala.inline
  def log: typings.sipJs.sipJsStrings.log = this.cast("log")
  @scala.inline
  def warn: typings.sipJs.sipJsStrings.warn = this.cast("warn")
}

