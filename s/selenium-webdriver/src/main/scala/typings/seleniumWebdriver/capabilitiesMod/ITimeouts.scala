package typings.seleniumWebdriver.capabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeouts extends js.Object {
  /**
    * The maximum amount of time, in milliseconds, to spend attempting to
    * {@linkplain ./webdriver.IWebDriver#findElement locate} an element on the
    * current page.
    */
  var `implicit`: js.UndefOr[Double] = js.undefined
  /**
    * The timeout, in milliseconds, to apply to navigation events along with the
    * {@link PageLoadStrategy}.
    */
  var pageLoad: js.UndefOr[Double] = js.undefined
  /**
    * Defines when, in milliseconds, to interrupt a script that is being
    * {@linkplain ./webdriver.IWebDriver#executeScript evaluated}.
    */
  var script: js.UndefOr[Double] = js.undefined
}

object ITimeouts {
  @scala.inline
  def apply(
    `implicit`: js.UndefOr[Double] = js.undefined,
    pageLoad: js.UndefOr[Double] = js.undefined,
    script: js.UndefOr[Double] = js.undefined
  ): ITimeouts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`implicit`)) __obj.updateDynamic("implicit")(`implicit`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageLoad)) __obj.updateDynamic("pageLoad")(pageLoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(script)) __obj.updateDynamic("script")(script.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeouts]
  }
}

