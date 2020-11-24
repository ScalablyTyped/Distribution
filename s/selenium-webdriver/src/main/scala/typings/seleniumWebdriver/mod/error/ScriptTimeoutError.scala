package typings.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A script did not complete before its timeout expired.
  */
@JSImport("selenium-webdriver", "error.ScriptTimeoutError")
@js.native
class ScriptTimeoutError () extends WebDriverError {
  def this(message: String) = this()
}
