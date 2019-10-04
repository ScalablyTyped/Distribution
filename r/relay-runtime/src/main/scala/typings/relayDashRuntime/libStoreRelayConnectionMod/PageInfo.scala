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
    val __obj = js.Dynamic.literal(endCursor = endCursor, hasNextPage = hasNextPage, hasPrevPage = hasPrevPage, startCursor = startCursor)
  
    __obj.asInstanceOf[PageInfo]
  }
}

