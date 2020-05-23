package typings.relayRuntime.connectionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInfo extends js.Object {
  var endCursor: js.UndefOr[String | Null] = js.undefined
  var hasNextPage: Boolean
  var hasPreviousPage: Boolean
  var startCursor: js.UndefOr[String | Null] = js.undefined
}

object PageInfo {
  @scala.inline
  def apply(
    hasNextPage: Boolean,
    hasPreviousPage: Boolean,
    endCursor: js.UndefOr[Null | String] = js.undefined,
    startCursor: js.UndefOr[Null | String] = js.undefined
  ): PageInfo = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPreviousPage = hasPreviousPage.asInstanceOf[js.Any])
    if (!js.isUndefined(endCursor)) __obj.updateDynamic("endCursor")(endCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(startCursor)) __obj.updateDynamic("startCursor")(startCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
}

