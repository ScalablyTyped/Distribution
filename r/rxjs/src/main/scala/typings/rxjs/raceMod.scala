package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.operatorMod.Operator
import typings.rxjs.outerSubscriberMod.OuterSubscriber
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.TeardownLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object raceMod {
  
  @JSImport("rxjs/internal/observable/race", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/observable/race", "RaceOperator")
  @js.native
  class RaceOperator[T] ()
    extends StObject
       with Operator[T, T] {
    
    /* CompleteClass */
    override def call(subscriber: Subscriber[T], source: js.Any): TeardownLogic = js.native
  }
  
  @JSImport("rxjs/internal/observable/race", "RaceSubscriber")
  @js.native
  class RaceSubscriber[T] protected () extends OuterSubscriber[T, T] {
    def this(destination: Subscriber[T]) = this()
    
    /* protected */ def _next(observable: js.Any): Unit = js.native
    
    /* private */ var hasFirst: js.Any = js.native
    
    def notifyNext(_outerValue: T, innerValue: T, outerIndex: Double): Unit = js.native
    
    /* private */ var observables: js.Any = js.native
    
    /* private */ var subscriptions: js.Any = js.native
  }
  
  inline def race(arg: js.Array[ObservableInput[js.Any]]): Observable[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(arg.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Object]]
  inline def race(observables: ObservableInput[js.Any]*): Observable[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Object]]
  inline def race[A](a: ObservableInput[A]): Observable[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(a.asInstanceOf[js.Any]).asInstanceOf[Observable[A]]
  inline def race[A, B](arg: js.Tuple2[ObservableInput[A], ObservableInput[B]]): Observable[A | B] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(arg.asInstanceOf[js.Any]).asInstanceOf[Observable[A | B]]
  inline def race[A, B](a: ObservableInput[A], b: ObservableInput[B]): Observable[A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Observable[A | B]]
  inline def race[A, B, C](arg: js.Tuple3[ObservableInput[A], ObservableInput[B], ObservableInput[C]]): Observable[A | B | C] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(arg.asInstanceOf[js.Any]).asInstanceOf[Observable[A | B | C]]
  inline def race[A, B, C](a: ObservableInput[A], b: ObservableInput[B], c: ObservableInput[C]): Observable[A | B | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Observable[A | B | C]]
  inline def race[A, B, C, D](arg: js.Tuple4[ObservableInput[A], ObservableInput[B], ObservableInput[C], ObservableInput[D]]): Observable[A | B | C | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(arg.asInstanceOf[js.Any]).asInstanceOf[Observable[A | B | C | D]]
  inline def race[A, B, C, D](a: ObservableInput[A], b: ObservableInput[B], c: ObservableInput[C], d: ObservableInput[D]): Observable[A | B | C | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Observable[A | B | C | D]]
  inline def race[A, B, C, D, E](
    arg: js.Tuple5[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E]
    ]
  ): Observable[A | B | C | D | E] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(arg.asInstanceOf[js.Any]).asInstanceOf[Observable[A | B | C | D | E]]
  inline def race[A, B, C, D, E](
    a: ObservableInput[A],
    b: ObservableInput[B],
    c: ObservableInput[C],
    d: ObservableInput[D],
    e: ObservableInput[E]
  ): Observable[A | B | C | D | E] = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Observable[A | B | C | D | E]]
  
  inline def race_A[A](arg: js.Array[ObservableInput[A]]): Observable[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(arg.asInstanceOf[js.Any]).asInstanceOf[Observable[A]]
  
  inline def race_T[T](arg: js.Array[ObservableInput[T]]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(arg.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def race_T[T](observables: ObservableInput[T]*): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
}
