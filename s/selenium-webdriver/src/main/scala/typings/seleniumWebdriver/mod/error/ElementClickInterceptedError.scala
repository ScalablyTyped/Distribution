package typings.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indicates a {@linkplain ./webdriver.WebElement#click click command} could
  * not completed because the click target is obscured by other elements on the
  * page.
  */
@JSImport("selenium-webdriver", "error.ElementClickInterceptedError")
@js.native
class ElementClickInterceptedError () extends WebDriverError {
  def this(message: String) = this()
}
