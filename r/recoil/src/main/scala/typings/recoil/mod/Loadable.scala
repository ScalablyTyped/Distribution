package typings.recoil.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.recoil.mod.ValueLoadable[T]
  - typings.recoil.mod.LoadingLoadable[T]
  - typings.recoil.mod.ErrorLoadable[T]
*/
trait Loadable[T] extends StObject
object Loadable {
  
  inline def ErrorLoadable[T](
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
  ): typings.recoil.mod.ErrorLoadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], errorMaybe = js.Any.fromFunction0(errorMaybe), errorOrThrow = js.Any.fromFunction0(errorOrThrow), getValue = js.Any.fromFunction0(getValue), is = js.Any.fromFunction1(is), map = js.Any.fromFunction1(map), promiseMaybe = js.Any.fromFunction0(promiseMaybe), promiseOrThrow = js.Any.fromFunction0(promiseOrThrow), state = "hasError", toPromise = js.Any.fromFunction0(toPromise), valueMaybe = js.Any.fromFunction0(valueMaybe), valueOrThrow = js.Any.fromFunction0(valueOrThrow))
    __obj.asInstanceOf[typings.recoil.mod.ErrorLoadable[T]]
  }
  
  inline def LoadingLoadable[T](
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
  ): typings.recoil.mod.LoadingLoadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], errorMaybe = js.Any.fromFunction0(errorMaybe), errorOrThrow = js.Any.fromFunction0(errorOrThrow), getValue = js.Any.fromFunction0(getValue), is = js.Any.fromFunction1(is), map = js.Any.fromFunction1(map), promiseMaybe = js.Any.fromFunction0(promiseMaybe), promiseOrThrow = js.Any.fromFunction0(promiseOrThrow), state = "loading", toPromise = js.Any.fromFunction0(toPromise), valueMaybe = js.Any.fromFunction0(valueMaybe), valueOrThrow = js.Any.fromFunction0(valueOrThrow))
    __obj.asInstanceOf[typings.recoil.mod.LoadingLoadable[T]]
  }
  
  inline def ValueLoadable[T](
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
  ): typings.recoil.mod.ValueLoadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], errorMaybe = js.Any.fromFunction0(errorMaybe), errorOrThrow = js.Any.fromFunction0(errorOrThrow), getValue = js.Any.fromFunction0(getValue), is = js.Any.fromFunction1(is), map = js.Any.fromFunction1(map), promiseMaybe = js.Any.fromFunction0(promiseMaybe), promiseOrThrow = js.Any.fromFunction0(promiseOrThrow), state = "hasValue", toPromise = js.Any.fromFunction0(toPromise), valueMaybe = js.Any.fromFunction0(valueMaybe), valueOrThrow = js.Any.fromFunction0(valueOrThrow))
    __obj.asInstanceOf[typings.recoil.mod.ValueLoadable[T]]
  }
}
