package typings.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indicates a {@linkplain ./webdriver.WebElement#click click command} could
  * not completed because the click target is obscured by other elements on the
  * page.
  */
@JSImport("protractor", "error.ElementClickInterceptedError")
@js.native
class ElementClickInterceptedError ()
  extends typings.seleniumWebdriver.mod.error.ElementClickInterceptedError {
  def this(message: String) = this()
}
