package typings.rxjs.internalTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.rxjs.internalObservableMod.Observable
import typings.std.ArrayLike
import typings.std.AsyncIterable
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Cons[X, Y /* <: js.Array[Any] */] = Any

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

type Head[X /* <: js.Array[Any] */] = Any

type MonoTypeOperatorFunction[T] = OperatorFunction[T, T]

/* Rewritten from type alias, can be one of: 
  - typings.rxjs.internalObservableMod.Observable[T]
  - typings.rxjs.internalTypesMod.InteropObservable[T]
  - typings.std.AsyncIterable[T]
  - typings.std.PromiseLike[T]
  - typings.std.ArrayLike[T]
  - js.Iterable[T]
  - typings.rxjs.internalTypesMod.ReadableStreamLike[T]
*/
type ObservableInput[T] = _ObservableInput[T] | AsyncIterable[T] | PromiseLike[T] | ArrayLike[T] | js.Iterable[T]

type ObservableInputTuple[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<T[K]>}
  */ typings.rxjs.rxjsStrings.ObservableInputTuple & TopLevel[T]

type ObservableLike[T] = InteropObservable[T]

type ObservedValueOf[O] = Any

type ObservedValueTupleFromArray[X] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof X ]: rxjs.rxjs/dist/types/internal/types.ObservedValueOf<X[K]>}
  */ typings.rxjs.rxjsStrings.ObservedValueTupleFromArray & TopLevel[X]

type ObservedValueUnionFromArray[X] = Any

type ObservedValuesFromArray[X] = ObservedValueUnionFromArray[X]

type OperatorFunction[T, R] = UnaryFunction[Observable[T], Observable[R]]

type SubscribableOrPromise[T] = (Subscribable[scala.Nothing | T]) | PromiseLike[T] | InteropObservable[T]

type Tail[X /* <: js.Array[Any] */] = Any

/* Rewritten from type alias, can be one of: 
  - typings.rxjs.subscriptionMod.Subscription
  - typings.rxjs.internalTypesMod.Unsubscribable
  - js.Function0[scala.Unit]
  - scala.Unit
*/
type TeardownLogic = _TeardownLogic | js.Function0[Unit] | Unit

type TruthyTypesOf[T] = T

type UnaryFunction[T, R] = js.Function1[/* source */ T, R]

type ValueFromArray[A /* <: js.Array[Any] */] = Any

type ValueFromNotification[T] = Unit
