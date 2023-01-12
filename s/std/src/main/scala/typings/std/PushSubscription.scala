package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Push API interface provides a subcription's URL endpoint and allows unsubscription from a push service.
  * Available only in secure contexts.
  */
trait PushSubscription extends StObject {
  
  /* standard dom */
  val endpoint: java.lang.String
  
  /* standard dom */
  val expirationTime: EpochTimeStamp | Null
  
  /* standard dom */
  def getKey(name: PushEncryptionKeyName): js.typedarray.ArrayBuffer | Null
  
  /* standard dom */
  val options: PushSubscriptionOptions
  
  /* standard dom */
  def toJSON(): PushSubscriptionJSON
  
  /* standard dom */
  def unsubscribe(): js.Promise[scala.Boolean]
}
object PushSubscription {
  
  inline def apply(
    endpoint: java.lang.String,
    getKey: PushEncryptionKeyName => js.typedarray.ArrayBuffer | Null,
    options: PushSubscriptionOptions,
    toJSON: () => PushSubscriptionJSON,
    unsubscribe: () => js.Promise[scala.Boolean]
  ): PushSubscription = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], getKey = js.Any.fromFunction1(getKey), options = options.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), unsubscribe = js.Any.fromFunction0(unsubscribe), expirationTime = null)
    __obj.asInstanceOf[PushSubscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PushSubscription] (val x: Self) extends AnyVal {
    
    inline def setEndpoint(value: java.lang.String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setExpirationTime(value: EpochTimeStamp): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeNull: Self = StObject.set(x, "expirationTime", null)
    
    inline def setGetKey(value: PushEncryptionKeyName => js.typedarray.ArrayBuffer | Null): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    inline def setOptions(value: PushSubscriptionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => PushSubscriptionJSON): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setUnsubscribe(value: () => js.Promise[scala.Boolean]): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
  }
}
