package typings.relayDashRuntime.libStoreRelayConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInfo extends js.Object {
  var endCursor: String
  var hasNextPage: Boolean
  var hasPrevPage: Boolean
  var startCursor: String
}

object PageInfo {
  @scala.inline
  def apply(endCursor: String, hasNextPage: Boolean, hasPrevPage: Boolean, startCursor: String): PageInfo = {
    val __obj = js.Dynamic.literal(endCursor = endCursor.asInstanceOf[js.Any], hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPrevPage = hasPrevPage.asInstanceOf[js.Any], startCursor = startCursor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PageInfo]
  }
}

