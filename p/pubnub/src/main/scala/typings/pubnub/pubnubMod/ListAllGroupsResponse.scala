package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAllGroupsResponse extends js.Object {
  var groups: js.Array[String]
}

object ListAllGroupsResponse {
  @scala.inline
  def apply(groups: js.Array[String]): ListAllGroupsResponse = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListAllGroupsResponse]
  }
}

