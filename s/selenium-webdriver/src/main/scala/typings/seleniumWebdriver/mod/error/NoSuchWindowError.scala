package typings.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to switch to a window could not be satisfied because the window
  * could not be found.
  */
@JSImport("selenium-webdriver", "error.NoSuchWindowError")
@js.native
class NoSuchWindowError () extends WebDriverError {
  def this(message: String) = this()
}
