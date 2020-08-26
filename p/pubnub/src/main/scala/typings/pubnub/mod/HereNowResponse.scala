package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pubnub.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HereNowResponse extends js.Object {
  var channels: StringDictionary[Name] = js.native
  var totalChannels: Double = js.native
  var totalOccupancy: Double = js.native
}

object HereNowResponse {
  @scala.inline
  def apply(channels: StringDictionary[Name], totalChannels: Double, totalOccupancy: Double): HereNowResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], totalChannels = totalChannels.asInstanceOf[js.Any], totalOccupancy = totalOccupancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HereNowResponse]
  }
  @scala.inline
  implicit class HereNowResponseOps[Self <: HereNowResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChannels(value: StringDictionary[Name]): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalChannels(value: Double): Self = this.set("totalChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalOccupancy(value: Double): Self = this.set("totalOccupancy", value.asInstanceOf[js.Any])
  }
  
}

