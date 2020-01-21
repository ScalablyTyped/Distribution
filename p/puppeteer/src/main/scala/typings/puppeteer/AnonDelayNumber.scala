package typings.puppeteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelayNumber extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
}

object AnonDelayNumber {
  @scala.inline
  def apply(delay: Int | Double = null): AnonDelayNumber = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelayNumber]
  }
}

