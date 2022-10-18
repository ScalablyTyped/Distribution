package typings.seleniumWebdriver.mod

import typings.seleniumWebdriver.libLoggingMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "Logs")
@js.native
open class Logs protected () extends StObject {
  // region Constructors
  /**
    * @param {!WebDriver} driver The parent driver.
    * @constructor
    */
  def this(driver: WebDriver) = this()
  
  // endregion
  // region
  /**
    * Fetches available log entries for the given type.
    *
    * <p/>Note that log buffers are reset after each call, meaning that
    * available log entries correspond to those entries not yet returned for a
    * given log type. In practice, this means that this call will return the
    * available log entries since the last call, or from the start of the
    * session.
    *
    * @param {!logging.Type} type The desired log type.
    * @return {!Promise.<!Array.<!logging.Entry>>} A
    *   promise that will resolve to a list of log entries for the specified
    *   type.
    */
  def get(`type`: String): js.Promise[js.Array[Entry]] = js.native
  
  /**
    * Retrieves the log types available to this driver.
    * @return {!Promise.<!Array.<!logging.Type>>} A
    *     promise that will resolve to a list of available log types.
    */
  def getAvailableLogTypes(): js.Promise[js.Array[String]] = js.native
}
