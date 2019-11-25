package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickOptions extends js.Object {
  /** @default MouseButtons.Left */
  var button: js.UndefOr[MouseButtons] = js.undefined
  /** @default 1 */
  var clickCount: js.UndefOr[Double] = js.undefined
  /**
    * Time to wait between mousedown and mouseup in milliseconds.
    * @default 0
    */
  var delay: js.UndefOr[Double] = js.undefined
}

object ClickOptions {
  @scala.inline
  def apply(button: MouseButtons = null, clickCount: Int | Double = null, delay: Int | Double = null): ClickOptions = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (clickCount != null) __obj.updateDynamic("clickCount")(clickCount.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickOptions]
  }
}

