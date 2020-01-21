package typings.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element command could not be completed because the element is in an
  * invalid state, e.g. attempting to click an element that is no longer
  * attached to the document.
  */
@JSImport("selenium-webdriver", "error.InvalidElementStateError")
@js.native
class InvalidElementStateError () extends WebDriverError {
  def this(message: String) = this()
}

