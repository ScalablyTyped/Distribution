package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Accumulator[T, TAcc] = js.Function2[/* acc */ TAcc, /* value */ T, TAcc]

type AnonymousObservable[T] = typings.rx.Rx.Observable[T]

type AnonymousSubject[T] = typings.rx.Rx.Subject[T]

type ArrayLike[T] = js.Array[T] | typings.rx.anon.Dictindex[T]

type ArrayOrIterable[T] = typings.rx.Rx.ArrayLike[T]

type AsyncSubject[T] = typings.rx.Rx.Subject[T]

type Comparer[T, TResult] = js.Function2[/* value1 */ T, /* value2 */ T, TResult]

type HistoricalScheduler = typings.rx.Rx.VirtualTimeScheduler[scala.Double, scala.Double]

type Predicate[T] = typings.rx.Rx.Selector[T, scala.Boolean]

type ReplaySubject[T] = typings.rx.Rx.Subject[T]

type Selector[T, TResult] = js.Function3[
/* value */ T, 
/* index */ scala.Double, 
/* observable */ typings.rx.Rx.Observable[T], 
TResult]

type ValueOrSelector[T, TResult] = TResult | (typings.rx.Rx.Selector[T, TResult])
