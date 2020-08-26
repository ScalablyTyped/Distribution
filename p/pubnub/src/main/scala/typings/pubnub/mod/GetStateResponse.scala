package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStateResponse extends js.Object {
  var channels: StringDictionary[js.Any] = js.native
}

object GetStateResponse {
  @scala.inline
  def apply(channels: StringDictionary[js.Any]): GetStateResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStateResponse]
  }
  @scala.inline
  implicit class GetStateResponseOps[Self <: GetStateResponse] (val x: Self) extends AnyVal {
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
    def setChannels(value: StringDictionary[js.Any]): Self = this.set("channels", value.asInstanceOf[js.Any])
  }
  
}

