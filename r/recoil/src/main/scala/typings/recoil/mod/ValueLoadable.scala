package typings.recoil.mod

import typings.recoil.recoilStrings.hasValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueLoadable[T]
  extends StObject
     with BaseLoadable[T]
     with Loadable[T] {
  
  var contents: T
  
  def errorMaybe(): Unit
  
  def promiseMaybe(): Unit
  
  var state: hasValue
  
  def valueMaybe(): T
}
object ValueLoadable {
  
  inline def apply[T](
    contents: T,
    errorMaybe: () => Unit,
    errorOrThrow: () => Any,
    getValue: () => T,
    is: Loadable[Any] => Boolean,
    map: js.Function1[T, Loadable[Any] | js.Promise[Any] | Any] => Loadable[Any],
    promiseMaybe: () => Unit,
    promiseOrThrow: () => js.Promise[T],
    toPromise: () => js.Promise[T],
    valueMaybe: () => T,
    valueOrThrow: () => T
  ): ValueLoadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], errorMaybe = js.Any.fromFunction0(errorMaybe), errorOrThrow = js.Any.fromFunction0(errorOrThrow), getValue = js.Any.fromFunction0(getValue), is = js.Any.fromFunction1(is), map = js.Any.fromFunction1(map), promiseMaybe = js.Any.fromFunction0(promiseMaybe), promiseOrThrow = js.Any.fromFunction0(promiseOrThrow), state = "hasValue", toPromise = js.Any.fromFunction0(toPromise), valueMaybe = js.Any.fromFunction0(valueMaybe), valueOrThrow = js.Any.fromFunction0(valueOrThrow))
    __obj.asInstanceOf[ValueLoadable[T]]
  }
  
  extension [Self <: ValueLoadable[?], T](x: Self & ValueLoadable[T]) {
    
    inline def setContents(value: T): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setErrorMaybe(value: () => Unit): Self = StObject.set(x, "errorMaybe", js.Any.fromFunction0(value))
    
    inline def setPromiseMaybe(value: () => Unit): Self = StObject.set(x, "promiseMaybe", js.Any.fromFunction0(value))
    
    inline def setState(value: hasValue): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setValueMaybe(value: () => T): Self = StObject.set(x, "valueMaybe", js.Any.fromFunction0(value))
  }
}
