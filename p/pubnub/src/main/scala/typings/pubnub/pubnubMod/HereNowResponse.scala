package typings.pubnub.pubnubMod

import org.scalablytyped.runtime.StringDictionary
import typings.pubnub.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HereNowResponse extends js.Object {
  var channels: StringDictionary[Anon_Name]
  var totalChannels: Double
  var totalOccupancy: Double
}

object HereNowResponse {
  @scala.inline
  def apply(channels: StringDictionary[Anon_Name], totalChannels: Double, totalOccupancy: Double): HereNowResponse = {
    val __obj = js.Dynamic.literal(channels = channels, totalChannels = totalChannels, totalOccupancy = totalOccupancy)
  
    __obj.asInstanceOf[HereNowResponse]
  }
}

