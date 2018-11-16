package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LaunchOptions extends Timeoutable {
  /**
     * Whether to open chrome in appMode.
     * @default false
     */
  var appMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Additional arguments to pass to the Chromium instance. List of Chromium
     * flags can be found here.
     */
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
     * Sets a consistent viewport for each page. Defaults to an 800x600 viewport. null disables the default viewport.
     */
  var defaultViewport: js.UndefOr[puppeteerLib.Anon_IsMobile] = js.undefined
  /**
     * Whether to auto-open DevTools panel for each tab. If this option is true, the headless option will be set false.
     */
  var devtools: js.UndefOr[scala.Boolean] = js.undefined
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
    ScalablyTyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double]
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
     * Whether to run Chromium in headless mode.
     * @default true
     */
  var headless: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Do not use `puppeteer.defaultArgs()` for launching Chromium.
     * @default false
     */
  var ignoreDefaultArgs: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  /**
     * Whether to ignore HTTPS errors during navigation.
     * @default false
     */
  var ignoreHTTPSErrors: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Connects to the browser over a pipe instead of a WebSocket.
     * @default false
     */
  var pipe: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Slows down Puppeteer operations by the specified amount of milliseconds.
     * Useful so that you can see what is going on.
     */
  var slowMo: js.UndefOr[scala.Double] = js.undefined
  /** Path to a User Data Directory. */
  var userDataDir: js.UndefOr[java.lang.String] = js.undefined
}

