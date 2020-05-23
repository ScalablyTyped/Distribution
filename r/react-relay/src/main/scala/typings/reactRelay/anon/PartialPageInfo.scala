package typings.reactRelay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<relay-runtime.relay-runtime.PageInfo> */
trait PartialPageInfo extends js.Object {
  var endCursor: js.UndefOr[String] = js.undefined
  var hasNextPage: js.UndefOr[Boolean] = js.undefined
  var hasPreviousPage: js.UndefOr[Boolean] = js.undefined
  var startCursor: js.UndefOr[String] = js.undefined
}

object PartialPageInfo {
  @scala.inline
  def apply(
    endCursor: String = null,
    hasNextPage: js.UndefOr[Boolean] = js.undefined,
    hasPreviousPage: js.UndefOr[Boolean] = js.undefined,
    startCursor: String = null
  ): PartialPageInfo = {
    val __obj = js.Dynamic.literal()
    if (endCursor != null) __obj.updateDynamic("endCursor")(endCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(hasNextPage)) __obj.updateDynamic("hasNextPage")(hasNextPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasPreviousPage)) __obj.updateDynamic("hasPreviousPage")(hasPreviousPage.get.asInstanceOf[js.Any])
    if (startCursor != null) __obj.updateDynamic("startCursor")(startCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPageInfo]
  }
}

