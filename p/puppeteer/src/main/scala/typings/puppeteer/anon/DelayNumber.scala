package typings.puppeteer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelayNumber extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
}

object DelayNumber {
  @scala.inline
  def apply(delay: js.UndefOr[Double] = js.undefined): DelayNumber = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelayNumber]
  }
}

