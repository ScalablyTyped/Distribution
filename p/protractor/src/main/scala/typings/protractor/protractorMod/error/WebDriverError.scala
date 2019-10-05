package typings.protractor.protractorMod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base WebDriver error type. This error type is only used directly when a
  * more appropriate category is not defined for the offending error.
  */
@JSImport("protractor", "error.WebDriverError")
@js.native
class WebDriverError ()
  extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.error.WebDriverError {
  def this(message: String) = this()
}

