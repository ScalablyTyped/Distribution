package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientEventsSubscribeRequest extends StObject {
  
  /** ClientEventsSubscribeRequest lastKnownBlockIds */
  var lastKnownBlockIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** ClientEventsSubscribeRequest subscriptions */
  var subscriptions: js.UndefOr[js.Array[IEventSubscription] | Null] = js.undefined
}
object IClientEventsSubscribeRequest {
  
  inline def apply(): IClientEventsSubscribeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientEventsSubscribeRequest]
  }
  
  extension [Self <: IClientEventsSubscribeRequest](x: Self) {
    
    inline def setLastKnownBlockIds(value: js.Array[String]): Self = StObject.set(x, "lastKnownBlockIds", value.asInstanceOf[js.Any])
    
    inline def setLastKnownBlockIdsNull: Self = StObject.set(x, "lastKnownBlockIds", null)
    
    inline def setLastKnownBlockIdsUndefined: Self = StObject.set(x, "lastKnownBlockIds", js.undefined)
    
    inline def setLastKnownBlockIdsVarargs(value: String*): Self = StObject.set(x, "lastKnownBlockIds", js.Array(value*))
    
    inline def setSubscriptions(value: js.Array[IEventSubscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsNull: Self = StObject.set(x, "subscriptions", null)
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    inline def setSubscriptionsVarargs(value: IEventSubscription*): Self = StObject.set(x, "subscriptions", js.Array(value*))
  }
}
