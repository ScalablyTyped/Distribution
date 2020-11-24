package typings.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An operation did not completErrorCodee before its timeout expired.
  */
@JSImport("selenium-webdriver", "error.TimeoutError")
@js.native
class TimeoutError () extends WebDriverError {
  def this(message: String) = this()
}
