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

