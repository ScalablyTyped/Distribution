package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSpaceResponse extends js.Object {
  var status: Double
}

object DeleteSpaceResponse {
  @scala.inline
  def apply(status: Double): DeleteSpaceResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSpaceResponse]
  }
}

