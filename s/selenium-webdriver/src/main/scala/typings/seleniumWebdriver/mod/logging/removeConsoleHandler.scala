package typings.seleniumWebdriver.mod.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "logging.removeConsoleHandler")
@js.native
object removeConsoleHandler extends js.Object {
  /**
    * Removes the console log handler from the given logger.
    *
    * @param {Logger=} opt_logger The logger to remove the handler from; defaults
    *     to the root logger.
    * @see exports.addConsoleHandler
    */
  def apply(): Unit = js.native
  def apply(opt_logger: Logger): Unit = js.native
}

