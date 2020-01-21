package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetcherOptions extends js.Object {
  /** A download host to be used. Defaults to `https://storage.googleapis.com`. */
  var host: js.UndefOr[String] = js.undefined
  /** A path for the downloads folder. Defaults to `<root>/.local-chromium`, where `<root>` is puppeteer's package root. */
  var path: js.UndefOr[String] = js.undefined
  /** Possible values are: `mac`, `win32`, `win64`, `linux`. Defaults to the current platform. */
  var platform: js.UndefOr[Platform] = js.undefined
}

object FetcherOptions {
  @scala.inline
  def apply(host: String = null, path: String = null, platform: Platform = null): FetcherOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetcherOptions]
  }
}

