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
  def apply[X](expires: Int | Double = null, meta: X = null, refresh: Int | Double = null): InternalItemData[X] = {
    val __obj = js.Dynamic.literal()
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalItemData[X]]
  }
}

