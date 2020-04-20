package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSpaceResponse extends js.Object {
  var data: SpaceData
  var status: Double
}

object GetSpaceResponse {
  @scala.inline
  def apply(data: SpaceData, status: Double): GetSpaceResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpaceResponse]
  }
}

