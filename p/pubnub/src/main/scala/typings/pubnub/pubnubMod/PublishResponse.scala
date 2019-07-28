package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishResponse extends js.Object {
  var timetoken: Double
}

object PublishResponse {
  @scala.inline
  def apply(timetoken: Double): PublishResponse = {
    val __obj = js.Dynamic.literal(timetoken = timetoken)
  
    __obj.asInstanceOf[PublishResponse]
  }
}

