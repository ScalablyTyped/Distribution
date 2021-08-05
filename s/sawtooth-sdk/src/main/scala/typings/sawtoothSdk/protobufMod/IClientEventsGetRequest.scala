package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientEventsGetRequest extends StObject {
  
  /** ClientEventsGetRequest blockIds */
  var blockIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** ClientEventsGetRequest subscriptions */
  var subscriptions: js.UndefOr[js.Array[IEventSubscription] | Null] = js.undefined
}
object IClientEventsGetRequest {
  
  inline def apply(): IClientEventsGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientEventsGetRequest]
  }
  
  extension [Self <: IClientEventsGetRequest](x: Self) {
    
    inline def setBlockIds(value: js.Array[String]): Self = StObject.set(x, "blockIds", value.asInstanceOf[js.Any])
    
    inline def setBlockIdsNull: Self = StObject.set(x, "blockIds", null)
    
    inline def setBlockIdsUndefined: Self = StObject.set(x, "blockIds", js.undefined)
    
    inline def setBlockIdsVarargs(value: String*): Self = StObject.set(x, "blockIds", js.Array(value :_*))
    
    inline def setSubscriptions(value: js.Array[IEventSubscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsNull: Self = StObject.set(x, "subscriptions", null)
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    inline def setSubscriptionsVarargs(value: IEventSubscription*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
  }
}
