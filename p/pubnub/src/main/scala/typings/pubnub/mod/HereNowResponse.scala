package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pubnub.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HereNowResponse extends js.Object {
  var channels: StringDictionary[AnonName]
  var totalChannels: Double
  var totalOccupancy: Double
}

object HereNowResponse {
  @scala.inline
  def apply(channels: StringDictionary[AnonName], totalChannels: Double, totalOccupancy: Double): HereNowResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], totalChannels = totalChannels.asInstanceOf[js.Any], totalOccupancy = totalOccupancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HereNowResponse]
  }
}

