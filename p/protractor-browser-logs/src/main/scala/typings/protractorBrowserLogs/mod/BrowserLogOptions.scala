package typings.protractorBrowserLogs.mod

import typings.seleniumWebdriver.mod.logging.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserLogOptions extends js.Object {
  var reporters: js.UndefOr[js.Array[js.Function1[/* entries */ js.Array[Entry], Unit]]] = js.undefined
}

object BrowserLogOptions {
  @scala.inline
  def apply(reporters: js.Array[js.Function1[/* entries */ js.Array[Entry], Unit]] = null): BrowserLogOptions = {
    val __obj = js.Dynamic.literal()
    if (reporters != null) __obj.updateDynamic("reporters")(reporters.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserLogOptions]
  }
}

