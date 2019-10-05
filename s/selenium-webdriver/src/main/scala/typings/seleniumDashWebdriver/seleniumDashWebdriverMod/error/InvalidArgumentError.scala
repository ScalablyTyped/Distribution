package typings.seleniumDashWebdriver.seleniumDashWebdriverMod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments passed to a command are either invalid or malformed.
  */
@JSImport("selenium-webdriver", "error.InvalidArgumentError")
@js.native
class InvalidArgumentError () extends WebDriverError {
  def this(message: String) = this()
}

