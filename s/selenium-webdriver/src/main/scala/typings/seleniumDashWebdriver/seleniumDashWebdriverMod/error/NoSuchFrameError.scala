package typings.seleniumDashWebdriver.seleniumDashWebdriverMod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to switch to a frame could not be satisfied because the frame
  * could not be found.
  */
@JSImport("selenium-webdriver", "error.NoSuchFrameError")
@js.native
class NoSuchFrameError () extends WebDriverError {
  def this(message: String) = this()
}

