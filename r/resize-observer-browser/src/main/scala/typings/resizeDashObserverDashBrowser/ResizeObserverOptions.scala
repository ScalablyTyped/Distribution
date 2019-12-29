package typings.resizeDashObserverDashBrowser

import typings.resizeDashObserverDashBrowser.resizeDashObserverDashBrowserStrings.`border-box`
import typings.resizeDashObserverDashBrowser.resizeDashObserverDashBrowserStrings.`content-box`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeObserverOptions extends js.Object {
  /**
    * Sets which box model the observer will observe changes to. Possible values
    * are `content-box` (the default), and `border-box`.
    *
    * @default 'content-box'
    */
  var box: js.UndefOr[`content-box` | `border-box`] = js.undefined
}

object ResizeObserverOptions {
  @scala.inline
  def apply(box: `content-box` | `border-box` = null): ResizeObserverOptions = {
    val __obj = js.Dynamic.literal()
    if (box != null) __obj.updateDynamic("box")(box.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverOptions]
  }
}

