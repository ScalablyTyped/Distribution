package typings.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QBookmarkId extends js.Object {
  var qBookmarkId: js.UndefOr[String] = js.undefined
  var qExpires: js.UndefOr[Double] = js.undefined
}

object QBookmarkId {
  @scala.inline
  def apply(qBookmarkId: String = null, qExpires: js.UndefOr[Double] = js.undefined): QBookmarkId = {
    val __obj = js.Dynamic.literal()
    if (qBookmarkId != null) __obj.updateDynamic("qBookmarkId")(qBookmarkId.asInstanceOf[js.Any])
    if (!js.isUndefined(qExpires)) __obj.updateDynamic("qExpires")(qExpires.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QBookmarkId]
  }
}

