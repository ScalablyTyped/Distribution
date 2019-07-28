package typings.seleniumDashWebdriver.edgeMod

import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/edge", "Options")
@js.native
class Options () extends Capabilities {
  /**
    * Sets the page load strategy for Edge.
    * Supported values are 'normal', 'eager', and 'none';
    *
    * @param {string} pageLoadStrategy The page load strategy to use.
    * @return {!Options} A self reference.
    */
  def setPageLoadStrategy(pageLoadStrategy: String): Options = js.native
}

