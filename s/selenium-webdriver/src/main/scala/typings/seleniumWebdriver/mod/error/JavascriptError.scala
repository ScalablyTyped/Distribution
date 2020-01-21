package typings.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error occurred while executing JavaScript supplied by the user.
  */
@JSImport("selenium-webdriver", "error.JavascriptError")
@js.native
class JavascriptError () extends WebDriverError {
  def this(message: String) = this()
}

