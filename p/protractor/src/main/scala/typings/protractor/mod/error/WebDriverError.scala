package typings.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base WebDriver error type. This error type is only used directly when a
  * more appropriate category is not defined for the offending error.
  */
@JSImport("protractor", "error.WebDriverError")
@js.native
class WebDriverError ()
  extends typings.seleniumWebdriver.mod.error.WebDriverError {
  def this(message: String) = this()
}
