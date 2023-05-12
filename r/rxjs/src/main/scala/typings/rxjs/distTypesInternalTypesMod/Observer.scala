package typings.rxjs.distTypesInternalTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Observer[T] extends StObject {
  
  /**
    * A callback function that gets called by the producer if and when it has no more
    * values to provide (by calling `next` callback function). This means that no error
    * has happened. This callback can't be called more than one time, it can't be called
    * if the `error` callback function have been called previously, nor it can't be called
    * if the consumer has unsubscribed.
    *
    * For more info, please refer to {@link guide/glossary-and-semantics#complete this guide}.
    */
  def complete(): Unit
  
  /**
    * A callback function that gets called by the producer if and when it encountered a
    * problem of any kind. The errored value will be provided through the `err` parameter.
    * This callback can't be called more than one time, it can't be called if the
    * `complete` callback function have been called previously, nor it can't be called if
    * the consumer has unsubscribed.
    *
    * For more info, please refer to {@link guide/glossary-and-semantics#error this guide}.
    */
  def error(err: Any): Unit
  
  /**
    * A callback function that gets called by the producer during the subscription when
    * the producer "has" the `value`. It won't be called if `error` or `complete` callback
    * functions have been called, nor after the consumer has unsubscribed.
    *
    * For more info, please refer to {@link guide/glossary-and-semantics#next this guide}.
    */
  def next(value: T): Unit
}
object Observer {
  
  inline def apply[T](complete: () => Unit, error: Any => Unit, next: T => Unit): Observer[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[Observer[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Observer[?], T] (val x: Self & Observer[T]) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setError(value: Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
  }
}
