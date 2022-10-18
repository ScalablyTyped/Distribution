package typings.rxjs.distTypesInternalTypesMod

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.std.ArrayLike
import typings.std.AsyncIterable
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type FactoryOrValue[T] = T | js.Function0[T]

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - scala.Unit
  - typings.rxjs.rxjsBooleans.`false`
  - typings.rxjs.rxjsInts.`0`
  - typings.rxjs.rxjsInts.`-0`
  - typings.rxjs.rxjsStrings._empty
*/
type Falsy = js.UndefOr[_Falsy | Null]

type MonoTypeOperatorFunction[T] = OperatorFunction[T, T]

/* Rewritten from type alias, can be one of: 
  - typings.rxjs.distTypesInternalObservableMod.Observable[T]
  - typings.rxjs.distTypesInternalTypesMod.InteropObservable[T]
  - typings.std.AsyncIterable[T]
  - typings.std.PromiseLike[T]
  - typings.std.ArrayLike[T]
  - js.Iterable[T]
  - typings.rxjs.distTypesInternalTypesMod.ReadableStreamLike[T]
*/
type ObservableInput[T] = _ObservableInput[T] | AsyncIterable[T] | PromiseLike[T] | ArrayLike[T] | js.Iterable[T]

type ObservableLike[T] = InteropObservable[T]

type ObservedValuesFromArray[X] = ObservedValueUnionFromArray[X]

type OperatorFunction[T, R] = UnaryFunction[Observable[T], Observable[R]]

type SubscribableOrPromise[T] = (Subscribable[scala.Nothing | T]) | PromiseLike[T] | InteropObservable[T]

/* Rewritten from type alias, can be one of: 
  - typings.rxjs.distTypesInternalSubscriptionMod.Subscription
  - typings.rxjs.distTypesInternalTypesMod.Unsubscribable
  - js.Function0[scala.Unit]
  - scala.Unit
*/
type TeardownLogic = _TeardownLogic | js.Function0[Unit] | Unit

type UnaryFunction[T, R] = js.Function1[/* source */ T, R]
