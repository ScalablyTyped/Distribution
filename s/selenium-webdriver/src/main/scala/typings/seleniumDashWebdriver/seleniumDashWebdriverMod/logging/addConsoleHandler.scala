package typings.seleniumDashWebdriver.seleniumDashWebdriverMod.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "logging.addConsoleHandler")
@js.native
object addConsoleHandler extends js.Object {
  /**
    * Adds the console handler to the given logger. The console handler will log
    * all messages using the JavaScript Console API.
    *
    * @param {Logger=} opt_logger The logger to add the handler to; defaults
    *     to the root logger.
    */
  def apply(): Unit = js.native
  def apply(opt_logger: Logger): Unit = js.native
}

