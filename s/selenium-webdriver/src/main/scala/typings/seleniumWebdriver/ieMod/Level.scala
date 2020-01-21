package typings.seleniumWebdriver.ieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.seleniumWebdriver.seleniumWebdriverStrings.FATAL
  - typings.seleniumWebdriver.seleniumWebdriverStrings.ERROR
  - typings.seleniumWebdriver.seleniumWebdriverStrings.WARN
  - typings.seleniumWebdriver.seleniumWebdriverStrings.INFO
  - typings.seleniumWebdriver.seleniumWebdriverStrings.DEBUG
  - typings.seleniumWebdriver.seleniumWebdriverStrings.TRACE
*/
trait Level extends js.Object

object Level {
  @scala.inline
  def DEBUG: typings.seleniumWebdriver.seleniumWebdriverStrings.DEBUG = this.cast("DEBUG")
  @scala.inline
  def ERROR: typings.seleniumWebdriver.seleniumWebdriverStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def FATAL: typings.seleniumWebdriver.seleniumWebdriverStrings.FATAL = this.cast("FATAL")
  @scala.inline
  def INFO: typings.seleniumWebdriver.seleniumWebdriverStrings.INFO = this.cast("INFO")
  @scala.inline
  def TRACE: typings.seleniumWebdriver.seleniumWebdriverStrings.TRACE = this.cast("TRACE")
  @scala.inline
  def WARN: typings.seleniumWebdriver.seleniumWebdriverStrings.WARN = this.cast("WARN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

