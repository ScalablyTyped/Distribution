package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationOptions extends Timeoutable {
  /**
    * When to consider navigation succeeded.
    * @default load Navigation is consider when the `load` event is fired.
    */
  var waitUntil: js.UndefOr[LoadEvent | js.Array[LoadEvent]] = js.undefined
}

object NavigationOptions {
  @scala.inline
  def apply(timeout: Int | Double = null, waitUntil: LoadEvent | js.Array[LoadEvent] = null): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (waitUntil != null) __obj.updateDynamic("waitUntil")(waitUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOptions]
  }
}

