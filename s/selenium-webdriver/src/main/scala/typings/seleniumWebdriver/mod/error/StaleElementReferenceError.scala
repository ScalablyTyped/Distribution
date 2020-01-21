package typings.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element command failed because the referenced element is no longer
  * attached to the DOM.
  */
@JSImport("selenium-webdriver", "error.StaleElementReferenceError")
@js.native
class StaleElementReferenceError () extends WebDriverError {
  def this(message: String) = this()
}

