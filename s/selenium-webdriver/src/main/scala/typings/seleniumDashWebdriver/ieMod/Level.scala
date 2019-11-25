package typings.seleniumDashWebdriver.ieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.seleniumDashWebdriver.seleniumDashWebdriverStrings.FATAL
  - typings.seleniumDashWebdriver.seleniumDashWebdriverStrings.ERROR
  - typings.seleniumDashWebdriver.seleniumDashWebdriverStrings.WARN
  - typings.seleniumDashWebdriver.seleniumDashWebdriverStrings.INFO
  - typings.seleniumDashWebdriver.seleniumDashWebdriverStrings.DEBUG
  - typings.seleniumDashWebdriver.seleniumDashWebdriverStrings.TRACE
*/
trait Level extends js.Object

object Level {
  @scala.inline
  def DEBUG: typings.seleniumDashWebdriver.seleniumDashWebdriverStrings.DEBUG = this.cast("DEBUG")
  @scala.inline
  def ERROR: typings.seleniumDashWebdriver.seleniumDashWebdriverStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def FATAL: typings.seleniumDashWebdriver.seleniumDashWebdriverStrings.FATAL = this.cast("FATAL")
  @scala.inline
  def INFO: typings.seleniumDashWebdriver.seleniumDashWebdriverStrings.INFO = this.cast("INFO")
  @scala.inline
  def TRACE: typings.seleniumDashWebdriver.seleniumDashWebdriverStrings.TRACE = this.cast("TRACE")
  @scala.inline
  def WARN: typings.seleniumDashWebdriver.seleniumDashWebdriverStrings.WARN = this.cast("WARN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

