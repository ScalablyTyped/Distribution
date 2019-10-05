package typings.seleniumDashWebdriver.seleniumDashWebdriverMod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Occurs when a command is directed to a session that does not exist.
  */
@JSImport("selenium-webdriver", "error.NoSuchSessionError")
@js.native
class NoSuchSessionError () extends WebDriverError {
  def this(message: String) = this()
}

