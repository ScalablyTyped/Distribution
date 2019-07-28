package typings.puppeteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelayNumber extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
}

object Anon_DelayNumber {
  @scala.inline
  def apply(delay: Int | Double = null): Anon_DelayNumber = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DelayNumber]
  }
}

