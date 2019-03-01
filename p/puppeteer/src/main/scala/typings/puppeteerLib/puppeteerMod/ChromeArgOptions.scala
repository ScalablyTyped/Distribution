package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeArgOptions extends js.Object {
  /**
    * Additional arguments to pass to the browser instance.
    * The list of Chromium flags can be found here.
    */
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Whether to auto-open a DevTools panel for each tab.
    * If this option is true, the headless option will be set false.
    */
  var devtools: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to run browser in headless mode.
    * @default true unless the devtools option is true.
    */
  var headless: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Path to a User Data Directory.
    */
  var userDataDir: js.UndefOr[java.lang.String] = js.undefined
}

object ChromeArgOptions {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String] = null,
    devtools: js.UndefOr[scala.Boolean] = js.undefined,
    headless: js.UndefOr[scala.Boolean] = js.undefined,
    userDataDir: java.lang.String = null
  ): ChromeArgOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (!js.isUndefined(devtools)) __obj.updateDynamic("devtools")(devtools)
    if (!js.isUndefined(headless)) __obj.updateDynamic("headless")(headless)
    if (userDataDir != null) __obj.updateDynamic("userDataDir")(userDataDir)
    __obj.asInstanceOf[ChromeArgOptions]
  }
}

