package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSpacesResponse extends js.Object {
  var data: js.Array[SpaceData]
  var next: js.UndefOr[String] = js.undefined
  var prev: js.UndefOr[String] = js.undefined
  var status: Double
}

object GetSpacesResponse {
  @scala.inline
  def apply(data: js.Array[SpaceData], status: Double, next: String = null, prev: String = null): GetSpacesResponse = {
    val __obj = js.Dynamic.literal(data = data, status = status)
    if (next != null) __obj.updateDynamic("next")(next)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[GetSpacesResponse]
  }
}

