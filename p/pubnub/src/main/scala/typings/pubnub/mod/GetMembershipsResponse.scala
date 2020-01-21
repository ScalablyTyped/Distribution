package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMembershipsResponse extends js.Object {
  var data: js.Array[ObjectData]
  var next: js.UndefOr[String] = js.undefined
  var prev: js.UndefOr[String] = js.undefined
  var status: Double
}

object GetMembershipsResponse {
  @scala.inline
  def apply(data: js.Array[ObjectData], status: Double, next: String = null, prev: String = null): GetMembershipsResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembershipsResponse]
  }
}

