package typings.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An element could not be located on the page using the given search
  * parameters.
  */
@JSImport("selenium-webdriver", "error.NoSuchElementError")
@js.native
class NoSuchElementError () extends WebDriverError {
  def this(message: String) = this()
}
