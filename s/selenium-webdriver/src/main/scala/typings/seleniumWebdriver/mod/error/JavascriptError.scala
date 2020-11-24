package typings.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error occurred while executing JavaScript supplied by the user.
  */
@JSImport("selenium-webdriver", "error.JavascriptError")
@js.native
class JavascriptError () extends WebDriverError {
  def this(message: String) = this()
}
