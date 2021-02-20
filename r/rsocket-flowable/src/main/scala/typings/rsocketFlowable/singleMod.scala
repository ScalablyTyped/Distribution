package typings.rsocketFlowable

import typings.std.Error
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleMod {
  
  @JSImport("rsocket-flowable/Single", JSImport.Default)
  @js.native
  class default[T] protected () extends Single[T] {
    def this(source: Source[T]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rsocket-flowable/Single", "default.error")
    @js.native
    def error(error: Error): Single[scala.Nothing] = js.native
    
    @JSImport("rsocket-flowable/Single", "default.never")
    @js.native
    def never(): Single[scala.Nothing] = js.native
    
    @JSImport("rsocket-flowable/Single", "default.of")
    @js.native
    def of[U](value: U): Single[U] = js.native
  }
  
  type CancelCallback = js.Function0[Unit]
  
  @js.native
  trait IFutureSubject[T] extends StObject {
    
    def onComplete(value: T): Unit = js.native
    
    def onError(error: Error): Unit = js.native
    
    def onSubscribe(): Unit = js.native
    def onSubscribe(cancel: CancelCallback): Unit = js.native
  }
  
  @js.native
  trait IFutureSubscriber[T] extends StObject {
    
    def onComplete(value: T): Unit = js.native
    
    def onError(error: Error): Unit = js.native
    
    def onSubscribe(cancel: CancelCallback): Unit = js.native
  }
  object IFutureSubscriber {
    
    @scala.inline
    def apply[T](onComplete: T => Unit, onError: Error => Unit, onSubscribe: CancelCallback => Unit): IFutureSubscriber[T] = {
      val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete), onError = js.Any.fromFunction1(onError), onSubscribe = js.Any.fromFunction1(onSubscribe))
      __obj.asInstanceOf[IFutureSubscriber[T]]
    }
    
    @scala.inline
    implicit class IFutureSubscriberMutableBuilder[Self <: IFutureSubscriber[_], T] (val x: Self with IFutureSubscriber[T]) extends AnyVal {
      
      @scala.inline
      def setOnComplete(value: T => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnError(value: Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubscribe(value: CancelCallback => Unit): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Single[T] extends StObject {
    
    def flatMap[R](fn: js.Function1[/* data */ T, Single[R]]): Single[R] = js.native
    
    /**
      * Return a new Single that resolves to the value of this Single applied to
      * the given mapping function.
      */
    def map[R](fn: js.Function1[/* data */ T, R]): Single[R] = js.native
    
    def subscribe(): Unit = js.native
    def subscribe(partialSubscriber: Partial[IFutureSubscriber[T]]): Unit = js.native
    
    def `then`(): Unit = js.native
    def `then`(successFn: js.UndefOr[scala.Nothing], errorFn: js.Function1[/* error */ Error, Unit]): Unit = js.native
    def `then`(successFn: js.Function1[/* data */ T, Unit]): Unit = js.native
    def `then`(successFn: js.Function1[/* data */ T, Unit], errorFn: js.Function1[/* error */ Error, Unit]): Unit = js.native
  }
  
  type Source[T] = js.Function1[/* subject */ IFutureSubject[T], Unit]
}
