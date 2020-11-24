package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type FactoryOrValue[T] = T | js.Function0[T]
  
  type MonoTypeOperatorFunction[T] = typings.rxjs.typesMod.OperatorFunction[T, T]
  
  type ObservableInput[T] = typings.rxjs.typesMod.SubscribableOrPromise[T] | typings.std.ArrayLike[T] | typings.std.Iterable[T]
  
  type ObservableLike[T] = typings.rxjs.typesMod.InteropObservable[T]
  
  type ObservedValueOf[O] = js.Any
  
  type ObservedValuesFromArray[X] = js.Any
  
  type OperatorFunction[T, R] = typings.rxjs.typesMod.UnaryFunction[
    typings.rxjs.internalObservableMod.Observable[T], 
    typings.rxjs.internalObservableMod.Observable[R]
  ]
  
  type SubscribableOrPromise[T] = (typings.rxjs.typesMod.Subscribable[scala.Nothing | T]) | js.Thenable[T] | typings.rxjs.typesMod.InteropObservable[T]
  
  type TeardownLogic = typings.rxjs.typesMod.Unsubscribable | js.Function | scala.Unit
  
  type UnaryFunction[T, R] = js.Function1[/* source */ T, R]
}
