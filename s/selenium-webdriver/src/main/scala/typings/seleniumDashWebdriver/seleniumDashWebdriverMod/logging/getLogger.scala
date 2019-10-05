package typings.seleniumDashWebdriver.seleniumDashWebdriverMod.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "logging.getLogger")
@js.native
object getLogger extends js.Object {
  /**
    * Retrieves a named logger, creating it in the process. This function will
    * implicitly create the requested logger, and any of its parents, if they
    * do not yet exist.
    *
    * @param {string} name the logger's name.
    * @return {!Logger} the requested logger.
    */
  def apply(): Logger = js.native
  def apply(name: String): Logger = js.native
}

