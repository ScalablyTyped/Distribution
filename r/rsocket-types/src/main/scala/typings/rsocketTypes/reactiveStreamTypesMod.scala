package typings.rsocketTypes

import typings.std.Error
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactiveStreamTypesMod {
  
  @js.native
  trait IPublisher[T] extends StObject {
    
    def map[R](fn: js.Function1[/* data */ T, R]): IPublisher[R] = js.native
    
    def subscribe(): Unit = js.native
    def subscribe(subscriber: Partial[ISubscriber[T]]): Unit = js.native
  }
  
  trait ISubject[T] extends StObject {
    
    def onComplete(): Unit
    
    def onError(error: Error): Unit
    
    def onNext(value: T): Unit
  }
  object ISubject {
    
    inline def apply[T](onComplete: () => Unit, onError: Error => Unit, onNext: T => Unit): ISubject[T] = {
      val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext))
      __obj.asInstanceOf[ISubject[T]]
    }
    
    extension [Self <: ISubject[?], T](x: Self & ISubject[T]) {
      
      inline def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      inline def setOnError(value: Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnNext(value: T => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
    }
  }
  
  trait ISubscriber[T] extends StObject {
    
    def onComplete(): Unit
    
    def onError(error: Error): Unit
    
    def onNext(value: T): Unit
    
    def onSubscribe(subscription: ISubscription): Unit
  }
  object ISubscriber {
    
    inline def apply[T](
      onComplete: () => Unit,
      onError: Error => Unit,
      onNext: T => Unit,
      onSubscribe: ISubscription => Unit
    ): ISubscriber[T] = {
      val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onSubscribe = js.Any.fromFunction1(onSubscribe))
      __obj.asInstanceOf[ISubscriber[T]]
    }
    
    extension [Self <: ISubscriber[?], T](x: Self & ISubscriber[T]) {
      
      inline def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      inline def setOnError(value: Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnNext(value: T => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
      
      inline def setOnSubscribe(value: ISubscription => Unit): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction1(value))
    }
  }
  
  trait ISubscription extends StObject {
    
    def cancel(): Unit
    
    def request(n: Double): Unit
  }
  object ISubscription {
    
    inline def apply(cancel: () => Unit, request: Double => Unit): ISubscription = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), request = js.Any.fromFunction1(request))
      __obj.asInstanceOf[ISubscription]
    }
    
    extension [Self <: ISubscription](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setRequest(value: Double => Unit): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    }
  }
}
