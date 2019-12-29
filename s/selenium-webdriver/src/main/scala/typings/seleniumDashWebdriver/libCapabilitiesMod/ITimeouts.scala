package typings.seleniumDashWebdriver.libCapabilitiesMod

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
  def apply(`implicit`: Int | Double = null, pageLoad: Int | Double = null, script: Int | Double = null): ITimeouts = {
    val __obj = js.Dynamic.literal()
    if (`implicit` != null) __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    if (pageLoad != null) __obj.updateDynamic("pageLoad")(pageLoad.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeouts]
  }
}

