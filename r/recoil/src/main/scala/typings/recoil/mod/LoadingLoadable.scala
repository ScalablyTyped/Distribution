package typings.recoil.mod

import typings.recoil.recoilStrings.loading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingLoadable[T]
  extends StObject
     with BaseLoadable[T]
     with Loadable[T] {
  
  var contents: js.Promise[T]
  
  def errorMaybe(): Unit
  
  def promiseMaybe(): js.Promise[T]
  
  var state: loading
  
  def valueMaybe(): Unit
}
object LoadingLoadable {
  
  inline def apply[T](
    contents: js.Promise[T],
    errorMaybe: () => Unit,
    errorOrThrow: () => Any,
    getValue: () => T,
    is: Loadable[Any] => Boolean,
    map: js.Function1[T, Loadable[Any] | js.Promise[Any] | Any] => Loadable[Any],
    promiseMaybe: () => js.Promise[T],
    promiseOrThrow: () => js.Promise[T],
    toPromise: () => js.Promise[T],
    valueMaybe: () => Unit,
    valueOrThrow: () => T
  ): LoadingLoadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], errorMaybe = js.Any.fromFunction0(errorMaybe), errorOrThrow = js.Any.fromFunction0(errorOrThrow), getValue = js.Any.fromFunction0(getValue), is = js.Any.fromFunction1(is), map = js.Any.fromFunction1(map), promiseMaybe = js.Any.fromFunction0(promiseMaybe), promiseOrThrow = js.Any.fromFunction0(promiseOrThrow), state = "loading", toPromise = js.Any.fromFunction0(toPromise), valueMaybe = js.Any.fromFunction0(valueMaybe), valueOrThrow = js.Any.fromFunction0(valueOrThrow))
    __obj.asInstanceOf[LoadingLoadable[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadingLoadable[?], T] (val x: Self & LoadingLoadable[T]) extends AnyVal {
    
    inline def setContents(value: js.Promise[T]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setErrorMaybe(value: () => Unit): Self = StObject.set(x, "errorMaybe", js.Any.fromFunction0(value))
    
    inline def setPromiseMaybe(value: () => js.Promise[T]): Self = StObject.set(x, "promiseMaybe", js.Any.fromFunction0(value))
    
    inline def setState(value: loading): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setValueMaybe(value: () => Unit): Self = StObject.set(x, "valueMaybe", js.Any.fromFunction0(value))
  }
}
