package typings.reactFloater.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZIndex extends js.Object {
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ZIndex {
  @scala.inline
  def apply(zIndex: js.UndefOr[Double] = js.undefined): ZIndex = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZIndex]
  }
}

