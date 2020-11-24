package typings.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Occurs when a command is directed to a session that does not exist.
  */
@JSImport("selenium-webdriver", "error.NoSuchSessionError")
@js.native
class NoSuchSessionError () extends WebDriverError {
  def this(message: String) = this()
}
