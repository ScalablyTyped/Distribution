package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/zip", JSImport.Namespace)
@js.native
object operatorZipMod extends js.Object {
  def zipProto[T](`this`: rxjsLib.rxjsMod.Observable[T], observables: rxjsLib.internalTypesMod.ObservableInput[T]*): rxjsLib.rxjsMod.Observable[js.Array[T]] = js.native
  def zipProto[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    array: js.Array[rxjsLib.internalTypesMod.ObservableInput[T]]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
  def zipProto[T, R](`this`: rxjsLib.rxjsMod.Observable[T], project: js.Function1[/* v1 */ T, R]): rxjsLib.rxjsMod.Observable[R] = js.native
  def zipProto[T, T2](`this`: rxjsLib.rxjsMod.Observable[T], v2: rxjsLib.internalTypesMod.ObservableInput[T2]): rxjsLib.rxjsMod.Observable[js.Tuple2[T, T2]] = js.native
  def zipProto[T, TOther, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    array: js.Array[rxjsLib.internalTypesMod.ObservableInput[TOther]],
    project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
  def zipProto[T, T2, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    project: js.Function2[/* v1 */ T, /* v2 */ T2, R]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
  def zipProto[T, T2, T3](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3]
  ): rxjsLib.rxjsMod.Observable[js.Tuple3[T, T2, T3]] = js.native
  def zipProto[T, T2, T3, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
  def zipProto[T, T2, T3, T4](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4]
  ): rxjsLib.rxjsMod.Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def zipProto[T, T2, T3, T4, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
  def zipProto[T, T2, T3, T4, T5](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5]
  ): rxjsLib.rxjsMod.Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def zipProto[T, T2, T3, T4, T5, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
  def zipProto[T, T2, T3, T4, T5, T6](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6]
  ): rxjsLib.rxjsMod.Observable[js.Tuple6[T, T2, T3, T4, T5, T6]] = js.native
  def zipProto[T, T2, T3, T4, T5, T6, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6],
    project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
  @JSName("zipProto")
  def zipProto_TR[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    observables: (rxjsLib.internalTypesMod.ObservableInput[T] | (js.Function1[/* repeated */ T, R]))*
  ): rxjsLib.rxjsMod.Observable[R] = js.native
}

