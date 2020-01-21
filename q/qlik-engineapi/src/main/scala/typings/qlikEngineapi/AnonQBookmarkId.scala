package typings.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQBookmarkId extends js.Object {
  var qBookmarkId: js.UndefOr[String] = js.undefined
  var qExpires: js.UndefOr[Double] = js.undefined
}

object AnonQBookmarkId {
  @scala.inline
  def apply(qBookmarkId: String = null, qExpires: Int | Double = null): AnonQBookmarkId = {
    val __obj = js.Dynamic.literal()
    if (qBookmarkId != null) __obj.updateDynamic("qBookmarkId")(qBookmarkId.asInstanceOf[js.Any])
    if (qExpires != null) __obj.updateDynamic("qExpires")(qExpires.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQBookmarkId]
  }
}

