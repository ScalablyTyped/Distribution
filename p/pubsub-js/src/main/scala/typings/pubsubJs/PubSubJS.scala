package typings.pubsubJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PubSubJS {
  
  @js.native
  trait Base[T, M]
    extends StObject
       with CountSubscriptions
       with ClearAllSubscriptions
       with GetSubscriptions
       with Publish[T, M]
       with Subscribe[T, M]
       with Unsubscribe[T] {
    
    var name: String = js.native
    
    var version: String = js.native
  }
  
  @js.native
  trait ClearAllSubscriptions extends StObject {
    
    def clearAllSubscriptions(): Unit = js.native
    def clearAllSubscriptions(token: Token): Unit = js.native
  }
  
  trait CountSubscriptions extends StObject {
    
    def countSubscriptions(token: Token): Double
  }
  object CountSubscriptions {
    
    inline def apply(countSubscriptions: Token => Double): CountSubscriptions = {
      val __obj = js.Dynamic.literal(countSubscriptions = js.Any.fromFunction1(countSubscriptions))
      __obj.asInstanceOf[CountSubscriptions]
    }
    
    extension [Self <: CountSubscriptions](x: Self) {
      
      inline def setCountSubscriptions(value: Token => Double): Self = StObject.set(x, "countSubscriptions", js.Any.fromFunction1(value))
    }
  }
  
  trait GetSubscriptions extends StObject {
    
    def getSubscriptions(token: Token): js.Array[Message]
  }
  object GetSubscriptions {
    
    inline def apply(getSubscriptions: Token => js.Array[Message]): GetSubscriptions = {
      val __obj = js.Dynamic.literal(getSubscriptions = js.Any.fromFunction1(getSubscriptions))
      __obj.asInstanceOf[GetSubscriptions]
    }
    
    extension [Self <: GetSubscriptions](x: Self) {
      
      inline def setGetSubscriptions(value: Token => js.Array[Message]): Self = StObject.set(x, "getSubscriptions", js.Any.fromFunction1(value))
    }
  }
  
  type Message = String | js.Symbol
  
  @js.native
  trait Publish[T, M] extends StObject {
    
    def publish(message: M): Boolean = js.native
    def publish(message: M, data: T): Boolean = js.native
    
    def publishSync(message: M): Boolean = js.native
    def publishSync(message: M, data: T): Boolean = js.native
  }
  
  trait Subscribe[T, M] extends StObject {
    
    def subscribe(message: M, func: SubscriptionListener[T]): Token
    
    def subscribeOnce(message: M, func: SubscriptionListener[T]): Base[T, M]
  }
  object Subscribe {
    
    inline def apply[T, M](
      subscribe: (M, SubscriptionListener[T]) => Token,
      subscribeOnce: (M, SubscriptionListener[T]) => Base[T, M]
    ): Subscribe[T, M] = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe), subscribeOnce = js.Any.fromFunction2(subscribeOnce))
      __obj.asInstanceOf[Subscribe[T, M]]
    }
    
    extension [Self <: Subscribe[?, ?], T, M](x: Self & (Subscribe[T, M])) {
      
      inline def setSubscribe(value: (M, SubscriptionListener[T]) => Token): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
      
      inline def setSubscribeOnce(value: (M, SubscriptionListener[T]) => Base[T, M]): Self = StObject.set(x, "subscribeOnce", js.Any.fromFunction2(value))
    }
  }
  
  type SubscriptionListener[T] = js.Function2[/* message */ String, /* data */ js.UndefOr[T], Unit]
  
  type Token = String
  
  @js.native
  trait Unsubscribe[T] extends StObject {
    
    def unsubscribe(tokenOrFunction: SubscriptionListener[T]): Token | Boolean = js.native
    def unsubscribe(tokenOrFunction: Token): Token | Boolean = js.native
  }
}
