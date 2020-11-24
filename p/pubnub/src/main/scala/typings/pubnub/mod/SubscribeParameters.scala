package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// subscribe
@js.native
trait SubscribeParameters extends js.Object {
  
  var channelGroups: js.UndefOr[js.Array[String]] = js.native
  
  var channels: js.UndefOr[js.Array[String]] = js.native
  
  var timetoken: js.UndefOr[Double] = js.native
  
  var withPresence: js.UndefOr[Boolean] = js.native
}
object SubscribeParameters {
  
  @scala.inline
  def apply(): SubscribeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeParameters]
  }
  
  @scala.inline
  implicit class SubscribeParametersOps[Self <: SubscribeParameters] (val x: Self) extends AnyVal {
    
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
    def setChannelGroupsVarargs(value: String*): Self = this.set("channelGroups", js.Array(value :_*))
    
    @scala.inline
    def setChannelGroups(value: js.Array[String]): Self = this.set("channelGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelGroups: Self = this.set("channelGroups", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: String*): Self = this.set("channels", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    
    @scala.inline
    def setTimetoken(value: Double): Self = this.set("timetoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimetoken: Self = this.set("timetoken", js.undefined)
    
    @scala.inline
    def setWithPresence(value: Boolean): Self = this.set("withPresence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithPresence: Self = this.set("withPresence", js.undefined)
  }
}
