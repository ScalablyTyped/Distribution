package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientEventsSubscribeRequest extends js.Object {
  
  /** ClientEventsSubscribeRequest lastKnownBlockIds */
  var lastKnownBlockIds: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** ClientEventsSubscribeRequest subscriptions */
  var subscriptions: js.UndefOr[js.Array[IEventSubscription] | Null] = js.native
}
object IClientEventsSubscribeRequest {
  
  @scala.inline
  def apply(): IClientEventsSubscribeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientEventsSubscribeRequest]
  }
  
  @scala.inline
  implicit class IClientEventsSubscribeRequestOps[Self <: IClientEventsSubscribeRequest] (val x: Self) extends AnyVal {
    
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
    def setLastKnownBlockIdsVarargs(value: String*): Self = this.set("lastKnownBlockIds", js.Array(value :_*))
    
    @scala.inline
    def setLastKnownBlockIds(value: js.Array[String]): Self = this.set("lastKnownBlockIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastKnownBlockIds: Self = this.set("lastKnownBlockIds", js.undefined)
    
    @scala.inline
    def setLastKnownBlockIdsNull: Self = this.set("lastKnownBlockIds", null)
    
    @scala.inline
    def setSubscriptionsVarargs(value: IEventSubscription*): Self = this.set("subscriptions", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptions(value: js.Array[IEventSubscription]): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptions: Self = this.set("subscriptions", js.undefined)
    
    @scala.inline
    def setSubscriptionsNull: Self = this.set("subscriptions", null)
  }
}
