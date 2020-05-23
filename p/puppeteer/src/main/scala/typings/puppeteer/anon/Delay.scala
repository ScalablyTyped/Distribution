package typings.puppeteer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delay extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Delay {
  @scala.inline
  def apply(delay: js.UndefOr[Double] = js.undefined, text: String = null): Delay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
}

