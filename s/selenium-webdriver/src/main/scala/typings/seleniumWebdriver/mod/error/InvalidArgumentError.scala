package typings.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The arguments passed to a command are either invalid or malformed.
  */
@JSImport("selenium-webdriver", "error.InvalidArgumentError")
@js.native
class InvalidArgumentError () extends WebDriverError {
  def this(message: String) = this()
}
