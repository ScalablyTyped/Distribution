package typings.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base WebDriver error type. This error type is only used directly when a
  * more appropriate category is not defined for the offending error.
  */
@JSImport("selenium-webdriver", "error.WebDriverError")
@js.native
class WebDriverError () extends IError {
  def this(message: String) = this()
  
  var remoteStacktrace: js.UndefOr[String] = js.native
}
