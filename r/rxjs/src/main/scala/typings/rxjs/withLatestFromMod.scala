package typings.rxjs

import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.ObservedValueOf
import typings.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/withLatestFrom", JSImport.Namespace)
@js.native
object withLatestFromMod extends js.Object {
  def withLatestFrom[T, R](array: js.Array[ObservableInput[_]]): OperatorFunction[T, R] = js.native
  def withLatestFrom[T, R](array: js.Array[ObservableInput[_]], project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[T, R] = js.native
  def withLatestFrom[T, R](observables: (ObservableInput[_] | (js.Function1[/* repeated */ js.Any, R]))*): OperatorFunction[T, R] = js.native
  def withLatestFrom[T, R](project: js.Function1[/* v1 */ T, R]): OperatorFunction[T, R] = js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */](source2: O2): OperatorFunction[T, js.Tuple2[T, ObservedValueOf[O2]]] = js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, R](source2: O2, project: js.Function2[/* v1 */ T, /* v2 */ ObservedValueOf[O2], R]): OperatorFunction[T, R] = js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v2: O2, v3: O3): OperatorFunction[T, js.Tuple3[T, ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
    v2: O2,
    v3: O3,
    project: js.Function3[/* v1 */ T, /* v2 */ ObservedValueOf[O2], /* v3 */ ObservedValueOf[O3], R]
  ): OperatorFunction[T, R] = js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v2: O2, v3: O3, v4: O4): OperatorFunction[T, js.Tuple4[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]] = js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
    v2: O2,
    v3: O3,
    v4: O4,
    project: js.Function4[
      /* v1 */ T, 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ]
  ): OperatorFunction[T, R] = js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v2: O2, v3: O3, v4: O4, v5: O5): OperatorFunction[
    T, 
    js.Tuple5[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4], ObservedValueOf[O5]]
  ] = js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    project: js.Function5[
      /* v1 */ T, 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ]
  ): OperatorFunction[T, R] = js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): OperatorFunction[
    T, 
    js.Tuple6[
      T, 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    v6: O6,
    project: js.Function6[
      /* v1 */ T, 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      /* v6 */ ObservedValueOf[O6], 
      R
    ]
  ): OperatorFunction[T, R] = js.native
}

