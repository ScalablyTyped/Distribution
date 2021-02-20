package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.operatorMod.Operator
import typings.rxjs.outerSubscriberMod.OuterSubscriber
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.ObservableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object raceMod {
  
  @JSImport("rxjs/internal/observable/race", "RaceOperator")
  @js.native
  class RaceOperator[T] () extends Operator[T, T]
  
  @JSImport("rxjs/internal/observable/race", "RaceSubscriber")
  @js.native
  class RaceSubscriber[T] protected () extends OuterSubscriber[T, T] {
    def this(destination: Subscriber[T]) = this()
    
    /* protected */ def _next(observable: js.Any): Unit = js.native
    
    var hasFirst: js.Any = js.native
    
    def notifyNext(_outerValue: T, innerValue: T, outerIndex: Double): Unit = js.native
    
    var observables: js.Any = js.native
    
    var subscriptions: js.Any = js.native
  }
  
  @JSImport("rxjs/internal/observable/race", "race")
  @js.native
  def race(arg: js.Array[ObservableInput[_]]): Observable[js.Object] = js.native
  @JSImport("rxjs/internal/observable/race", "race")
  @js.native
  def race(observables: ObservableInput[_]*): Observable[js.Object] = js.native
  @JSImport("rxjs/internal/observable/race", "race")
  @js.native
  def race[A](a: ObservableInput[A]): Observable[A] = js.native
  @JSImport("rxjs/internal/observable/race", "race")
  @js.native
  def race[A, B](arg: js.Tuple2[ObservableInput[A], ObservableInput[B]]): Observable[A | B] = js.native
  @JSImport("rxjs/internal/observable/race", "race")
  @js.native
  def race[A, B](a: ObservableInput[A], b: ObservableInput[B]): Observable[A | B] = js.native
  @JSImport("rxjs/internal/observable/race", "race")
  @js.native
  def race[A, B, C](arg: js.Tuple3[ObservableInput[A], ObservableInput[B], ObservableInput[C]]): Observable[A | B | C] = js.native
  @JSImport("rxjs/internal/observable/race", "race")
  @js.native
  def race[A, B, C](a: ObservableInput[A], b: ObservableInput[B], c: ObservableInput[C]): Observable[A | B | C] = js.native
  @JSImport("rxjs/internal/observable/race", "race")
  @js.native
  def race[A, B, C, D](arg: js.Tuple4[ObservableInput[A], ObservableInput[B], ObservableInput[C], ObservableInput[D]]): Observable[A | B | C | D] = js.native
  @JSImport("rxjs/internal/observable/race", "race")
  @js.native
  def race[A, B, C, D](a: ObservableInput[A], b: ObservableInput[B], c: ObservableInput[C], d: ObservableInput[D]): Observable[A | B | C | D] = js.native
  @JSImport("rxjs/internal/observable/race", "race")
  @js.native
  def race[A, B, C, D, E](
    arg: js.Tuple5[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E]
    ]
  ): Observable[A | B | C | D | E] = js.native
  @JSImport("rxjs/internal/observable/race", "race")
  @js.native
  def race[A, B, C, D, E](
    a: ObservableInput[A],
    b: ObservableInput[B],
    c: ObservableInput[C],
    d: ObservableInput[D],
    e: ObservableInput[E]
  ): Observable[A | B | C | D | E] = js.native
  @JSImport("rxjs/internal/observable/race", "race")
  @js.native
  def race_A[A](arg: js.Array[ObservableInput[A]]): Observable[A] = js.native
  @JSImport("rxjs/internal/observable/race", "race")
  @js.native
  def race_T[T](arg: js.Array[ObservableInput[T]]): Observable[T] = js.native
  @JSImport("rxjs/internal/observable/race", "race")
  @js.native
  def race_T[T](observables: ObservableInput[T]*): Observable[T] = js.native
}
