package typings.spdy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSpdy31 extends js.Object {
  var autoSpdy31: js.UndefOr[Boolean] = js.undefined
  var windowSize: js.UndefOr[Double] = js.undefined
}

object AutoSpdy31 {
  @scala.inline
  def apply(autoSpdy31: js.UndefOr[Boolean] = js.undefined, windowSize: js.UndefOr[Double] = js.undefined): AutoSpdy31 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSpdy31)) __obj.updateDynamic("autoSpdy31")(autoSpdy31.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowSize)) __obj.updateDynamic("windowSize")(windowSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoSpdy31]
  }
}

