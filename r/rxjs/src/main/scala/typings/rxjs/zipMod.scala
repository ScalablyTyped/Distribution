package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.operatorMod.Operator
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.ObservedValueOf
import typings.rxjs.typesMod.TeardownLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zipMod {
  
  @JSImport("rxjs/internal/observable/zip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/observable/zip", "ZipOperator")
  @js.native
  class ZipOperator[T, R] ()
    extends StObject
       with Operator[T, R] {
    def this(resultSelector: js.Function1[/* repeated */ js.Any, R]) = this()
    
    /* CompleteClass */
    override def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic = js.native
    
    var resultSelector: js.UndefOr[js.Function1[/* repeated */ js.Any, R]] = js.native
  }
  
  @JSImport("rxjs/internal/observable/zip", "ZipSubscriber")
  @js.native
  class ZipSubscriber[T, R] protected () extends Subscriber[T] {
    def this(destination: Subscriber[R]) = this()
    def this(destination: Subscriber[R], resultSelector: js.Function1[/* repeated */ js.Any, R]) = this()
    def this(destination: Subscriber[R], resultSelector: js.Function1[/* repeated */ js.Any, R], values: js.Any) = this()
    def this(destination: Subscriber[R], resultSelector: Unit, values: js.Any) = this()
    
    /* protected */ def _next(value: js.Any): Unit = js.native
    
    /* protected */ def _tryresultSelector(args: js.Array[js.Any]): Unit = js.native
    
    /* private */ var active: js.Any = js.native
    
    def checkIterators(): Unit = js.native
    
    /* private */ var iterators: js.Any = js.native
    
    def notifyInactive(): Unit = js.native
    
    /* private */ var resultSelector: js.Any = js.native
  }
  
  inline def zip[R](array: js.Array[ObservableInput[js.Any]]): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(array.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  inline def zip[R](array: js.Array[ObservableInput[js.Any]], resultSelector: js.Function1[/* repeated */ js.Any, R]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(array.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def zip[R](observables: (ObservableInput[js.Any] | (js.Function1[/* repeated */ js.Any, R]))*): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2): Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3): Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4): Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    resultSelector: js.Function5[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ]]
  inline def zip[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    v6: O6,
    resultSelector: js.Function6[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      /* v6 */ ObservedValueOf[O6], 
      R
    ]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
  inline def zip_O_ObservableInputAny[O /* <: ObservableInput[js.Any] */](array: js.Array[O]): Observable[js.Array[ObservedValueOf[O]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(array.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[ObservedValueOf[O]]]]
  inline def zip_O_ObservableInputAny[O /* <: ObservableInput[js.Any] */](observables: O*): Observable[js.Array[ObservedValueOf[O]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[ObservedValueOf[O]]]]
  
  inline def zip_O_ObservableInputAnyR[O /* <: ObservableInput[js.Any] */, R](array: js.Array[O], resultSelector: js.Function1[/* repeated */ ObservedValueOf[O], R]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(array.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def zip_O_ObservableInputAnyR[O /* <: ObservableInput[js.Any] */, R](observables: (O | (js.Function1[/* repeated */ ObservedValueOf[O], R]))*): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
}
