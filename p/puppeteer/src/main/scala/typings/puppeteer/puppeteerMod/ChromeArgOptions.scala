package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeArgOptions extends js.Object {
  /**
    * Additional arguments to pass to the browser instance.
    * The list of Chromium flags can be found here.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Whether to auto-open a DevTools panel for each tab.
    * If this option is true, the headless option will be set false.
    */
  var devtools: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to run browser in headless mode.
    * @default true unless the devtools option is true.
    */
  var headless: js.UndefOr[Boolean] = js.undefined
  /**
    * Path to a User Data Directory.
    */
  var userDataDir: js.UndefOr[String] = js.undefined
}

object ChromeArgOptions {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    devtools: js.UndefOr[Boolean] = js.undefined,
    headless: js.UndefOr[Boolean] = js.undefined,
    userDataDir: String = null
  ): ChromeArgOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(devtools)) __obj.updateDynamic("devtools")(devtools.asInstanceOf[js.Any])
    if (!js.isUndefined(headless)) __obj.updateDynamic("headless")(headless.asInstanceOf[js.Any])
    if (userDataDir != null) __obj.updateDynamic("userDataDir")(userDataDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeArgOptions]
  }
}

