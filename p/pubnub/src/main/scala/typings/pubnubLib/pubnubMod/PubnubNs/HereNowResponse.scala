package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HereNowResponse extends js.Object {
  var channels: org.scalablytyped.runtime.StringDictionary[pubnubLib.Anon_Name]
  var totalChannels: scala.Double
  var totalOccupancy: scala.Double
}

object HereNowResponse {
  @scala.inline
  def apply(
    channels: org.scalablytyped.runtime.StringDictionary[pubnubLib.Anon_Name],
    totalChannels: scala.Double,
    totalOccupancy: scala.Double
  ): HereNowResponse = {
    val __obj = js.Dynamic.literal(channels = channels, totalChannels = totalChannels, totalOccupancy = totalOccupancy)
  
    __obj.asInstanceOf[HereNowResponse]
  }
}

