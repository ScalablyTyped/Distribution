package typings.pubnub.pubnubMod

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
    val __obj = js.Dynamic.literal(data = data, status = status)
  
    __obj.asInstanceOf[GetSpaceResponse]
  }
}

