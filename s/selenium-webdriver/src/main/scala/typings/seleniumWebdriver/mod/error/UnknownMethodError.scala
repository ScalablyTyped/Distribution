package typings.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The requested command matched a known URL but did not match an method for
  * that URL.
  */
@JSImport("selenium-webdriver", "error.UnknownMethodError")
@js.native
class UnknownMethodError () extends WebDriverError {
  def this(message: String) = this()
}
