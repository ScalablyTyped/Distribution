package typings.receptacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalItemData[X] extends js.Object {
  var expires: js.UndefOr[Double] = js.undefined
  var meta: js.UndefOr[X] = js.undefined
  var refresh: js.UndefOr[Double] = js.undefined
}

object InternalItemData {
  @scala.inline
  def apply[X](
    expires: js.UndefOr[Double] = js.undefined,
    meta: X = null,
    refresh: js.UndefOr[Double] = js.undefined
  ): InternalItemData[X] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalItemData[X]]
  }
}

