package typings.seleniumWebdriver.mod.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "logging.getLevel")
@js.native
object getLevel extends js.Object {
  /**
    * Converts a level name or value to a {@link logging.Level} value.
    * If the name/value is not recognized, {@link logging.Level.ALL}
    * will be returned.
    * @param {(number|string)} nameOrValue The log level name, or value, to
    *     convert .
    * @return {!logging.Level} The converted level.
    */
  def apply(nameOrValue: String): Level = js.native
  def apply(nameOrValue: Double): Level = js.native
}

