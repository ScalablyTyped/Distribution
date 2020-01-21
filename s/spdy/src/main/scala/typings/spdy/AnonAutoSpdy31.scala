package typings.spdy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoSpdy31 extends js.Object {
  var autoSpdy31: js.UndefOr[Boolean] = js.undefined
  var windowSize: js.UndefOr[Double] = js.undefined
}

object AnonAutoSpdy31 {
  @scala.inline
  def apply(autoSpdy31: js.UndefOr[Boolean] = js.undefined, windowSize: Int | Double = null): AnonAutoSpdy31 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSpdy31)) __obj.updateDynamic("autoSpdy31")(autoSpdy31.asInstanceOf[js.Any])
    if (windowSize != null) __obj.updateDynamic("windowSize")(windowSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoSpdy31]
  }
}

