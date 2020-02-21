package typings.seleniumWebdriver.loggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/lib/logging", "LogManager")
@js.native
class LogManager () extends js.Object {
  /**
    * Creates a new logger.
    *
    * @param {string} name the logger's name.
    * @param {!Logger} parent the logger's parent.
    * @return {!Logger} the new logger.
    * @private
    */
  def createLogger_(name: String, parent: Logger): Logger = js.native
  /**
    * Retrieves a named logger, creating it in the process. This function will
    * implicitly create the requested logger, and any of its parents, if they
    * do not yet exist.
    *
    * @param {string} name the logger's name.
    * @return {!Logger} the requested logger.
    */
  def getLogger(): Logger = js.native
  def getLogger(name: String): Logger = js.native
}

