package typings.rxjs

import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.ObservedValueOf
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withLatestFromMod {
  
  @JSImport("rxjs/internal/operators/withLatestFrom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def withLatestFrom[T, R](array: js.Array[ObservableInput[js.Any]]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(array.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def withLatestFrom[T, R](array: js.Array[ObservableInput[js.Any]], project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(array.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def withLatestFrom[T, R](observables: (ObservableInput[js.Any] | (js.Function1[/* repeated */ js.Any, R]))*): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def withLatestFrom[T, R](project: js.Function1[/* v1 */ T, R]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */](source2: O2): OperatorFunction[T, js.Tuple2[T, ObservedValueOf[O2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(source2.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Tuple2[T, ObservedValueOf[O2]]]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, R](source2: O2, project: js.Function2[/* v1 */ T, /* v2 */ ObservedValueOf[O2], R]): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(source2.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */](v2: O2, v3: O3): OperatorFunction[T, js.Tuple3[T, ObservedValueOf[O2], ObservedValueOf[O3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple3[T, ObservedValueOf[O2], ObservedValueOf[O3]]]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, R](
    v2: O2,
    v3: O3,
    project: js.Function3[/* v1 */ T, /* v2 */ ObservedValueOf[O2], /* v3 */ ObservedValueOf[O3], R]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */](v2: O2, v3: O3, v4: O4): OperatorFunction[T, js.Tuple4[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple4[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, R](
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
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */](v2: O2, v3: O3, v4: O4, v5: O5): OperatorFunction[
    T, 
    js.Tuple5[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4], ObservedValueOf[O5]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    js.Tuple5[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4], ObservedValueOf[O5]]
  ]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, R](
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
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */](v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): OperatorFunction[
    T, 
    js.Tuple6[
      T, 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    js.Tuple6[
      T, 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */, R](
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
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
}
