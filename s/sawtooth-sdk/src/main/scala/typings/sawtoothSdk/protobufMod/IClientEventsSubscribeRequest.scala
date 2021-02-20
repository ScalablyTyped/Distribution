package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientEventsSubscribeRequest extends StObject {
  
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
  implicit class IClientEventsSubscribeRequestMutableBuilder[Self <: IClientEventsSubscribeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastKnownBlockIds(value: js.Array[String]): Self = StObject.set(x, "lastKnownBlockIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastKnownBlockIdsNull: Self = StObject.set(x, "lastKnownBlockIds", null)
    
    @scala.inline
    def setLastKnownBlockIdsUndefined: Self = StObject.set(x, "lastKnownBlockIds", js.undefined)
    
    @scala.inline
    def setLastKnownBlockIdsVarargs(value: String*): Self = StObject.set(x, "lastKnownBlockIds", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptions(value: js.Array[IEventSubscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsNull: Self = StObject.set(x, "subscriptions", null)
    
    @scala.inline
    def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    @scala.inline
    def setSubscriptionsVarargs(value: IEventSubscription*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
  }
}
