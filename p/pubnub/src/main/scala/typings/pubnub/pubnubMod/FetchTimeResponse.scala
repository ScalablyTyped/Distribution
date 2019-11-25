package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// fetch time
trait FetchTimeResponse extends js.Object {
  var timetoken: Double
}

object FetchTimeResponse {
  @scala.inline
  def apply(timetoken: Double): FetchTimeResponse = {
    val __obj = js.Dynamic.literal(timetoken = timetoken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FetchTimeResponse]
  }
}

