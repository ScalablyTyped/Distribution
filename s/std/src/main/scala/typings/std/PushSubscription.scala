package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Push API interface provides a subcription's URL endpoint and allows unsubscription from a push service. */
trait PushSubscription extends StObject {
  
  val endpoint: java.lang.String
  
  val expirationTime: Double | Null
  
  def getKey(name: PushEncryptionKeyName): ArrayBuffer | Null
  
  val options: PushSubscriptionOptions
  
  def toJSON(): PushSubscriptionJSON
  
  def unsubscribe(): js.Promise[scala.Boolean]
}
object PushSubscription {
  
  @scala.inline
  def apply(
    endpoint: java.lang.String,
    getKey: PushEncryptionKeyName => ArrayBuffer | Null,
    options: PushSubscriptionOptions,
    toJSON: () => PushSubscriptionJSON,
    unsubscribe: () => js.Promise[scala.Boolean]
  ): PushSubscription = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], getKey = js.Any.fromFunction1(getKey), options = options.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), unsubscribe = js.Any.fromFunction0(unsubscribe), expirationTime = null)
    __obj.asInstanceOf[PushSubscription]
  }
  
  @scala.inline
  implicit class PushSubscriptionMutableBuilder[Self <: PushSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: java.lang.String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTime(value: Double): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeNull: Self = StObject.set(x, "expirationTime", null)
    
    @scala.inline
    def setGetKey(value: PushEncryptionKeyName => ArrayBuffer | Null): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(value: PushSubscriptionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => PushSubscriptionJSON): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnsubscribe(value: () => js.Promise[scala.Boolean]): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
  }
}
