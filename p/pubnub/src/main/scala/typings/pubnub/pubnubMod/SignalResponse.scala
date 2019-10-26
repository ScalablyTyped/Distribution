package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalResponse extends js.Object {
  var timetoken: Double
}

object SignalResponse {
  @scala.inline
  def apply(timetoken: Double): SignalResponse = {
    val __obj = js.Dynamic.literal(timetoken = timetoken)
  
    __obj.asInstanceOf[SignalResponse]
  }
}

