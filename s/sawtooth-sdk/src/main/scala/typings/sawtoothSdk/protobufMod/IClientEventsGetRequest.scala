package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientEventsGetRequest extends js.Object {
  
  /** ClientEventsGetRequest blockIds */
  var blockIds: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** ClientEventsGetRequest subscriptions */
  var subscriptions: js.UndefOr[js.Array[IEventSubscription] | Null] = js.native
}
object IClientEventsGetRequest {
  
  @scala.inline
  def apply(): IClientEventsGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientEventsGetRequest]
  }
  
  @scala.inline
  implicit class IClientEventsGetRequestOps[Self <: IClientEventsGetRequest] (val x: Self) extends AnyVal {
    
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
    def setBlockIdsVarargs(value: String*): Self = this.set("blockIds", js.Array(value :_*))
    
    @scala.inline
    def setBlockIds(value: js.Array[String]): Self = this.set("blockIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockIds: Self = this.set("blockIds", js.undefined)
    
    @scala.inline
    def setBlockIdsNull: Self = this.set("blockIds", null)
    
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
