package typings.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An attempt was made to select an element that cannot be selected.
  */
@JSImport("selenium-webdriver", "error.ElementNotSelectableError")
@js.native
class ElementNotSelectableError () extends WebDriverError {
  def this(message: String) = this()
}

