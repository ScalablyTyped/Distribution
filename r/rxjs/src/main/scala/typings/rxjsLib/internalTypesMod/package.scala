package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internalTypesMod {
  type FactoryOrValue[T] = T | js.Function0[T]
  type MonoTypeOperatorFunction[T] = OperatorFunction[T, T]
  type ObservableInput[T] = SubscribableOrPromise[T] | stdLib.ArrayLike[T] | stdLib.Iterable[T]
  type ObservableLike[T] = InteropObservable[T]
  type ObservedValueOf[O] = js.Any
  type ObservedValuesFromArray[X] = js.Any
  type OperatorFunction[T, R] = UnaryFunction[
    rxjsLib.internalObservableMod.Observable[T], 
    rxjsLib.internalObservableMod.Observable[R]
  ]
  type SubscribableOrPromise[T] = (Subscribable[scala.Nothing | T]) | js.Thenable[T] | InteropObservable[T]
  type TeardownLogic = Unsubscribable | js.Function | scala.Unit
  type UnaryFunction[T, R] = js.Function1[/* source */ T, R]
}
