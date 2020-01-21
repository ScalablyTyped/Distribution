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
    endCursor: String = null,
    startCursor: String = null
  ): PageInfo = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPreviousPage = hasPreviousPage.asInstanceOf[js.Any])
    if (endCursor != null) __obj.updateDynamic("endCursor")(endCursor.asInstanceOf[js.Any])
    if (startCursor != null) __obj.updateDynamic("startCursor")(startCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
}

