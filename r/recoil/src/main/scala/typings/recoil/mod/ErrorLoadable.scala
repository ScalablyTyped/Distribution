package typings.recoil.mod

import typings.recoil.recoilStrings.hasError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorLoadable[T]
  extends StObject
     with BaseLoadable[T]
     with Loadable[T] {
  
  var contents: Any
  
  def errorMaybe(): Any
  
  def promiseMaybe(): Unit
  
  var state: hasError
  
  def valueMaybe(): Unit
}
object ErrorLoadable {
  
  inline def apply[T](
    contents: Any,
    errorMaybe: () => Any,
    errorOrThrow: () => Any,
    getValue: () => T,
    is: Loadable[Any] => Boolean,
    map: js.Function1[T, Loadable[Any] | js.Promise[Any] | Any] => Loadable[Any],
    promiseMaybe: () => Unit,
    promiseOrThrow: () => js.Promise[T],
    toPromise: () => js.Promise[T],
    valueMaybe: () => Unit,
    valueOrThrow: () => T
  ): ErrorLoadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], errorMaybe = js.Any.fromFunction0(errorMaybe), errorOrThrow = js.Any.fromFunction0(errorOrThrow), getValue = js.Any.fromFunction0(getValue), is = js.Any.fromFunction1(is), map = js.Any.fromFunction1(map), promiseMaybe = js.Any.fromFunction0(promiseMaybe), promiseOrThrow = js.Any.fromFunction0(promiseOrThrow), state = "hasError", toPromise = js.Any.fromFunction0(toPromise), valueMaybe = js.Any.fromFunction0(valueMaybe), valueOrThrow = js.Any.fromFunction0(valueOrThrow))
    __obj.asInstanceOf[ErrorLoadable[T]]
  }
  
  extension [Self <: ErrorLoadable[?], T](x: Self & ErrorLoadable[T]) {
    
    inline def setContents(value: Any): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setErrorMaybe(value: () => Any): Self = StObject.set(x, "errorMaybe", js.Any.fromFunction0(value))
    
    inline def setPromiseMaybe(value: () => Unit): Self = StObject.set(x, "promiseMaybe", js.Any.fromFunction0(value))
    
    inline def setState(value: hasError): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setValueMaybe(value: () => Unit): Self = StObject.set(x, "valueMaybe", js.Any.fromFunction0(value))
  }
}
