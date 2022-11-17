package typings.rxjs.distTypesInternalTypesMod

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSubscriptionMod.Subscription
import typings.std.ArrayLike
import typings.std.AsyncIterable
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type FactoryOrValue[T] = T | js.Function0[T]

type Falsy = js.UndefOr[Null | false | 0 | -0 | ""]

type MonoTypeOperatorFunction[T] = OperatorFunction[T, T]

type ObservableInput[T] = Observable[T] | InteropObservable[T] | AsyncIterable[T] | PromiseLike[T] | ArrayLike[T] | js.Iterable[T] | ReadableStreamLike[T]

type ObservableLike[T] = InteropObservable[T]

type ObservableNotification[T] = NextNotification[T] | ErrorNotification | CompleteNotification

type ObservedValuesFromArray[X] = ObservedValueUnionFromArray[X]

type OperatorFunction[T, R] = UnaryFunction[Observable[T], Observable[R]]

type PartialObserver[T] = NextObserver[T] | ErrorObserver[T] | CompletionObserver[T]

type SubscribableOrPromise[T] = (Subscribable[scala.Nothing | T]) | PromiseLike[T] | InteropObservable[T]

type TeardownLogic = Subscription | Unsubscribable | js.Function0[Unit] | Unit

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends rxjs.rxjs/dist/types/internal/types.Falsy ? never : T
  }}}
  */
type TruthyTypesOf[T] = T

type UnaryFunction[T, R] = js.Function1[/* source */ T, R]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends {  kind :'N' | 'E' | 'C'} ? T extends rxjs.rxjs/dist/types/internal/types.NextNotification<any> ? T extends {  value :infer V} ? V : undefined : never : never
  }}}
  */
type ValueFromNotification[T] = Unit
