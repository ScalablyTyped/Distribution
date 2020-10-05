package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.operatorMod.Operator
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.ObservedValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/observable/zip", JSImport.Namespace)
@js.native
object zipMod extends js.Object {
  @js.native
  class ZipOperator[T, R] () extends Operator[T, R] {
    def this(resultSelector: js.Function1[/* repeated */ js.Any, R]) = this()
    var resultSelector: js.UndefOr[js.Function1[/* repeated */ js.Any, R]] = js.native
  }
  
  @js.native
  class ZipSubscriber[T, R] protected () extends Subscriber[T] {
    def this(destination: Subscriber[R]) = this()
    def this(destination: Subscriber[R], resultSelector: js.Function1[/* repeated */ js.Any, R]) = this()
    def this(destination: Subscriber[R], resultSelector: js.UndefOr[scala.Nothing], values: js.Any) = this()
    def this(destination: Subscriber[R], resultSelector: js.Function1[/* repeated */ js.Any, R], values: js.Any) = this()
    var active: js.Any = js.native
    var iterators: js.Any = js.native
    var resultSelector: js.Any = js.native
    /* protected */ def _next(value: js.Any): Unit = js.native
    /* protected */ def _tryresultSelector(args: js.Array[_]): Unit = js.native
    def checkIterators(): Unit = js.native
    def notifyInactive(): Unit = js.native
  }
  
  def zip[R](array: js.Array[ObservableInput[_]]): Observable[R] = js.native
  def zip[R](array: js.Array[ObservableInput[_]], resultSelector: js.Function1[/* repeated */ js.Any, R]): Observable[R] = js.native
  def zip[R](observables: (ObservableInput[_] | (js.Function1[/* repeated */ js.Any, R]))*): Observable[R] = js.native
  def zip[O1 /* <: ObservableInput[_] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R]): Observable[R] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](v1: O1, v2: O2): Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R]
  ): Observable[R] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3): Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ]
  ): Observable[R] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4): Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
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
  ): Observable[R] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
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
  ): Observable[R] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
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
  ): Observable[R] = js.native
  @JSName("zip")
  def zip_O_ObservableInputWildcard[O /* <: ObservableInput[_] */](array: js.Array[O]): Observable[js.Array[ObservedValueOf[O]]] = js.native
  @JSName("zip")
  def zip_O_ObservableInputWildcard[O /* <: ObservableInput[_] */](observables: O*): Observable[js.Array[ObservedValueOf[O]]] = js.native
  @JSName("zip")
  def zip_O_ObservableInputWildcardR[O /* <: ObservableInput[_] */, R](array: js.Array[O], resultSelector: js.Function1[/* repeated */ ObservedValueOf[O], R]): Observable[R] = js.native
  @JSName("zip")
  def zip_O_ObservableInputWildcardR[O /* <: ObservableInput[_] */, R](observables: (O | (js.Function1[/* repeated */ ObservedValueOf[O], R]))*): Observable[R] = js.native
}

