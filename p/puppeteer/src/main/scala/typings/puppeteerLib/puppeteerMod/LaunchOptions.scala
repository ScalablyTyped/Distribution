package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchOptions
  extends ChromeArgOptions
     with BrowserOptions
     with Timeoutable {
  /**
    * Whether to pipe browser process stdout and stderr into process.stdout and
    * process.stderr.
    * @default false
    */
  var dumpio: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify environment variables that will be visible to Chromium.
    * @default `process.env`.
    */
  var env: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double]
  ] = js.undefined
  /**
    * Path to a Chromium executable to run instead of bundled Chromium. If
    * executablePath is a relative path, then it is resolved relative to current
    * working directory.
    */
  var executablePath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Close chrome process on SIGHUP.
    * @default true
    */
  var handleSIGHUP: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Close chrome process on Ctrl-C.
    * @default true
    */
  var handleSIGINT: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Close chrome process on SIGTERM.
    * @default true
    */
  var handleSIGTERM: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Do not use `puppeteer.defaultArgs()` for launching Chromium.
    * @default false
    */
  var ignoreDefaultArgs: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  /**
    * Connects to the browser over a pipe instead of a WebSocket.
    * @default false
    */
  var pipe: js.UndefOr[scala.Boolean] = js.undefined
}

object LaunchOptions {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String] = null,
    defaultViewport: puppeteerLib.Anon_DeviceScaleFactor = null,
    devtools: js.UndefOr[scala.Boolean] = js.undefined,
    dumpio: js.UndefOr[scala.Boolean] = js.undefined,
    env: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double] = null,
    executablePath: java.lang.String = null,
    handleSIGHUP: js.UndefOr[scala.Boolean] = js.undefined,
    handleSIGINT: js.UndefOr[scala.Boolean] = js.undefined,
    handleSIGTERM: js.UndefOr[scala.Boolean] = js.undefined,
    headless: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDefaultArgs: scala.Boolean | js.Array[java.lang.String] = null,
    ignoreHTTPSErrors: js.UndefOr[scala.Boolean] = js.undefined,
    pipe: js.UndefOr[scala.Boolean] = js.undefined,
    slowMo: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    userDataDir: java.lang.String = null
  ): LaunchOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (defaultViewport != null) __obj.updateDynamic("defaultViewport")(defaultViewport)
    if (!js.isUndefined(devtools)) __obj.updateDynamic("devtools")(devtools)
    if (!js.isUndefined(dumpio)) __obj.updateDynamic("dumpio")(dumpio)
    if (env != null) __obj.updateDynamic("env")(env)
    if (executablePath != null) __obj.updateDynamic("executablePath")(executablePath)
    if (!js.isUndefined(handleSIGHUP)) __obj.updateDynamic("handleSIGHUP")(handleSIGHUP)
    if (!js.isUndefined(handleSIGINT)) __obj.updateDynamic("handleSIGINT")(handleSIGINT)
    if (!js.isUndefined(handleSIGTERM)) __obj.updateDynamic("handleSIGTERM")(handleSIGTERM)
    if (!js.isUndefined(headless)) __obj.updateDynamic("headless")(headless)
    if (ignoreDefaultArgs != null) __obj.updateDynamic("ignoreDefaultArgs")(ignoreDefaultArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreHTTPSErrors)) __obj.updateDynamic("ignoreHTTPSErrors")(ignoreHTTPSErrors)
    if (!js.isUndefined(pipe)) __obj.updateDynamic("pipe")(pipe)
    if (slowMo != null) __obj.updateDynamic("slowMo")(slowMo.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (userDataDir != null) __obj.updateDynamic("userDataDir")(userDataDir)
    __obj.asInstanceOf[LaunchOptions]
  }
}

