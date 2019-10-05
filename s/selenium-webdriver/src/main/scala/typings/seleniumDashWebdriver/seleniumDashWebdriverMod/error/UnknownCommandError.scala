package typings.seleniumDashWebdriver.seleniumDashWebdriverMod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command could not be executed because the remote end is not aware of it.
  */
@JSImport("selenium-webdriver", "error.UnknownCommandError")
@js.native
class UnknownCommandError () extends WebDriverError {
  def this(message: String) = this()
}

