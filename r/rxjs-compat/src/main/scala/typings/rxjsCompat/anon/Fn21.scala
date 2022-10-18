package typings.rxjsCompat.anon

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn21 extends StObject {
  
  def apply[T](observables: ObservableInput[T]*): Observable_[js.Array[T]] = js.native
  def apply[T, R](array: js.Array[ObservableInput[T]]): Observable_[R] = js.native
  def apply[T, R](project: js.Function1[/* v1 */ T, R]): Observable_[R] = js.native
  def apply[T, T2](v2: ObservableInput[T2]): Observable_[js.Tuple2[T, T2]] = js.native
  def apply[T, TOther, R](
    array: js.Array[ObservableInput[TOther]],
    project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
  ): Observable_[R] = js.native
  def apply[T, T2, R](v2: ObservableInput[T2], project: js.Function2[/* v1 */ T, /* v2 */ T2, R]): Observable_[R] = js.native
  def apply[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable_[js.Tuple3[T, T2, T3]] = js.native
  def apply[T, T2, T3, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
  ): Observable_[R] = js.native
  def apply[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable_[js.Tuple4[T, T2, T3, T4]] = js.native
  def apply[T, T2, T3, T4, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
  ): Observable_[R] = js.native
  def apply[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable_[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def apply[T, T2, T3, T4, T5, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
  ): Observable_[R] = js.native
  def apply[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable_[js.Tuple6[T, T2, T3, T4, T5, T6]] = js.native
  def apply[T, T2, T3, T4, T5, T6, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
  ): Observable_[R] = js.native
}
