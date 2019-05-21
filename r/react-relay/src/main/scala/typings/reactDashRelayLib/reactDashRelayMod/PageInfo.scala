package typings
package reactDashRelayLib.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInfo extends js.Object {
  var endCursor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var hasNextPage: scala.Boolean
  var hasPreviousPage: scala.Boolean
  var startCursor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object PageInfo {
  @scala.inline
  def apply(
    hasNextPage: scala.Boolean,
    hasPreviousPage: scala.Boolean,
    endCursor: java.lang.String = null,
    startCursor: java.lang.String = null
  ): PageInfo = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage, hasPreviousPage = hasPreviousPage)
    if (endCursor != null) __obj.updateDynamic("endCursor")(endCursor)
    if (startCursor != null) __obj.updateDynamic("startCursor")(startCursor)
    __obj.asInstanceOf[PageInfo]
  }
}

