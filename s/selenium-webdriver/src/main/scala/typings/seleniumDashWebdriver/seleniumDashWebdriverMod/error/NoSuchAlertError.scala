package typings.seleniumDashWebdriver.seleniumDashWebdriverMod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An attempt was made to operate on a modal dialog when one was not open.
  */
@JSImport("selenium-webdriver", "error.NoSuchAlertError")
@js.native
class NoSuchAlertError () extends WebDriverError {
  def this(message: String) = this()
}

