package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/combineLatest", JSImport.Namespace)
@js.native
object operatorCombineLatestMod extends js.Object {
  def combineLatest[T, R](`this`: Observable[T], array: js.Array[ObservableInput[T]]): Observable[js.Array[T]] = js.native
  def combineLatest[T, R](`this`: Observable[T], observables: (ObservableInput[T] | (js.Function1[/* repeated */ T, R]))*): Observable[R] = js.native
  def combineLatest[T, R](`this`: Observable[T], project: js.Function1[/* v1 */ T, R]): Observable[R] = js.native
  def combineLatest[T, T2](`this`: Observable[T], v2: ObservableInput[T2]): Observable[js.Tuple2[T, T2]] = js.native
  def combineLatest[T, TOther, R](
    `this`: Observable[T],
    array: js.Array[ObservableInput[TOther]],
    project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
  ): Observable[R] = js.native
  def combineLatest[T, T2, R](`this`: Observable[T], v2: ObservableInput[T2], project: js.Function2[/* v1 */ T, /* v2 */ T2, R]): Observable[R] = js.native
  def combineLatest[T, T2, T3](`this`: Observable[T], v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def combineLatest[T, T2, T3, R](
    `this`: Observable[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
  ): Observable[R] = js.native
  def combineLatest[T, T2, T3, T4](`this`: Observable[T], v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, T4, R](
    `this`: Observable[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
  ): Observable[R] = js.native
  def combineLatest[T, T2, T3, T4, T5](
    `this`: Observable[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T, T2, T3, T4, T5, R](
    `this`: Observable[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
  ): Observable[R] = js.native
  def combineLatest[T, T2, T3, T4, T5, T6](
    `this`: Observable[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable[js.Tuple6[T, T2, T3, T4, T5, T6]] = js.native
  def combineLatest[T, T2, T3, T4, T5, T6, R](
    `this`: Observable[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
  ): Observable[R] = js.native
}

