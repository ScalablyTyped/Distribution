package typings.recoil.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// loadable.d.ts
trait BaseLoadable[T] extends StObject {
  
  def errorOrThrow(): Any
  
  def getValue(): T
  
  def is(other: Loadable[Any]): Boolean
  
  def map[S](map: js.Function1[/* from */ T, Loadable[S] | js.Promise[S] | S]): Loadable[S]
  
  def promiseOrThrow(): js.Promise[T]
  
  def toPromise(): js.Promise[T]
  
  def valueOrThrow(): T
}
object BaseLoadable {
  
  inline def apply[T](
    errorOrThrow: () => Any,
    getValue: () => T,
    is: Loadable[Any] => Boolean,
    map: js.Function1[/* from */ T, Loadable[Any] | js.Promise[Any] | Any] => Loadable[Any],
    promiseOrThrow: () => js.Promise[T],
    toPromise: () => js.Promise[T],
    valueOrThrow: () => T
  ): BaseLoadable[T] = {
    val __obj = js.Dynamic.literal(errorOrThrow = js.Any.fromFunction0(errorOrThrow), getValue = js.Any.fromFunction0(getValue), is = js.Any.fromFunction1(is), map = js.Any.fromFunction1(map), promiseOrThrow = js.Any.fromFunction0(promiseOrThrow), toPromise = js.Any.fromFunction0(toPromise), valueOrThrow = js.Any.fromFunction0(valueOrThrow))
    __obj.asInstanceOf[BaseLoadable[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseLoadable[?], T] (val x: Self & BaseLoadable[T]) extends AnyVal {
    
    inline def setErrorOrThrow(value: () => Any): Self = StObject.set(x, "errorOrThrow", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: () => T): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setIs(value: Loadable[Any] => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
    
    inline def setMap(value: js.Function1[/* from */ T, Loadable[Any] | js.Promise[Any] | Any] => Loadable[Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setPromiseOrThrow(value: () => js.Promise[T]): Self = StObject.set(x, "promiseOrThrow", js.Any.fromFunction0(value))
    
    inline def setToPromise(value: () => js.Promise[T]): Self = StObject.set(x, "toPromise", js.Any.fromFunction0(value))
    
    inline def setValueOrThrow(value: () => T): Self = StObject.set(x, "valueOrThrow", js.Any.fromFunction0(value))
  }
}
