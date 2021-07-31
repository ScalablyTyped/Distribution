package typings.pubsubJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PubSubJS {
  
  @js.native
  trait Base
    extends StObject
       with CountSubscriptions
       with ClearAllSubscriptions
       with GetSubscriptions
       with Publish
       with Subscribe
       with Unsubscribe {
    
    var name: String = js.native
    
    var version: String = js.native
  }
  
  @js.native
  trait ClearAllSubscriptions extends StObject {
    
    def clearAllSubscriptions(): Unit = js.native
    def clearAllSubscriptions(token: js.Any): Unit = js.native
  }
  
  trait CountSubscriptions extends StObject {
    
    def countSubscriptions(token: js.Any): Double
  }
  object CountSubscriptions {
    
    @scala.inline
    def apply(countSubscriptions: js.Any => Double): CountSubscriptions = {
      val __obj = js.Dynamic.literal(countSubscriptions = js.Any.fromFunction1(countSubscriptions))
      __obj.asInstanceOf[CountSubscriptions]
    }
    
    @scala.inline
    implicit class CountSubscriptionsMutableBuilder[Self <: CountSubscriptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountSubscriptions(value: js.Any => Double): Self = StObject.set(x, "countSubscriptions", js.Any.fromFunction1(value))
    }
  }
  
  trait GetSubscriptions extends StObject {
    
    def getSubscriptions(token: js.Any): js.Array[js.Any]
  }
  object GetSubscriptions {
    
    @scala.inline
    def apply(getSubscriptions: js.Any => js.Array[js.Any]): GetSubscriptions = {
      val __obj = js.Dynamic.literal(getSubscriptions = js.Any.fromFunction1(getSubscriptions))
      __obj.asInstanceOf[GetSubscriptions]
    }
    
    @scala.inline
    implicit class GetSubscriptionsMutableBuilder[Self <: GetSubscriptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetSubscriptions(value: js.Any => js.Array[js.Any]): Self = StObject.set(x, "getSubscriptions", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Publish extends StObject {
    
    def publish(message: String): Boolean = js.native
    def publish(message: String, data: js.Any): Boolean = js.native
    
    def publishSync(message: String): Boolean = js.native
    def publishSync(message: String, data: js.Any): Boolean = js.native
  }
  
  trait Subscribe extends StObject {
    
    def subscribe(message: String, func: js.Function): String
    
    def subscribeOnce(message: String, func: js.Function): js.Any
  }
  object Subscribe {
    
    @scala.inline
    def apply(subscribe: (String, js.Function) => String, subscribeOnce: (String, js.Function) => js.Any): Subscribe = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe), subscribeOnce = js.Any.fromFunction2(subscribeOnce))
      __obj.asInstanceOf[Subscribe]
    }
    
    @scala.inline
    implicit class SubscribeMutableBuilder[Self <: Subscribe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubscribe(value: (String, js.Function) => String): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSubscribeOnce(value: (String, js.Function) => js.Any): Self = StObject.set(x, "subscribeOnce", js.Any.fromFunction2(value))
    }
  }
  
  trait Unsubscribe extends StObject {
    
    def unsubscribe(tokenOrFunction: js.Any): js.Any
  }
  object Unsubscribe {
    
    @scala.inline
    def apply(unsubscribe: js.Any => js.Any): Unsubscribe = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction1(unsubscribe))
      __obj.asInstanceOf[Unsubscribe]
    }
    
    @scala.inline
    implicit class UnsubscribeMutableBuilder[Self <: Unsubscribe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnsubscribe(value: js.Any => js.Any): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1(value))
    }
  }
}
