package typings
package rxjsLib.internalObservableZipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/zip", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def zip[R](array: js.Array[rxjsLib.internalTypesMod.ObservableInput[_]]): rxjsLib.internalObservableMod.Observable[R] = js.native
  def zip[R](
    array: js.Array[rxjsLib.internalTypesMod.ObservableInput[_]],
    resultSelector: js.Function1[/* repeated */ js.Any, R]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def zip[R](
    observables: (rxjsLib.internalTypesMod.ObservableInput[_] | (js.Function1[/* repeated */ js.Any, R]))*
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], R]): rxjsLib.internalObservableMod.Observable[R] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2): rxjsLib.internalObservableMod.Observable[
    js.Tuple2[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2]
    ]
  ] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      R
    ]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3): rxjsLib.internalObservableMod.Observable[
    js.Tuple3[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3]
    ]
  ] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    resultSelector: js.Function3[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      R
    ]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4): rxjsLib.internalObservableMod.Observable[
    js.Tuple4[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4]
    ]
  ] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    resultSelector: js.Function4[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      /* v4 */ rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      R
    ]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): rxjsLib.internalObservableMod.Observable[
    js.Tuple5[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      rxjsLib.internalTypesMod.ObservedValueOf[O5]
    ]
  ] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    resultSelector: js.Function5[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      /* v4 */ rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      /* v5 */ rxjsLib.internalTypesMod.ObservedValueOf[O5], 
      R
    ]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O6 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): rxjsLib.internalObservableMod.Observable[
    js.Tuple6[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      rxjsLib.internalTypesMod.ObservedValueOf[O5], 
      rxjsLib.internalTypesMod.ObservedValueOf[O6]
    ]
  ] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O6 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    v6: O6,
    resultSelector: js.Function6[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      /* v4 */ rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      /* v5 */ rxjsLib.internalTypesMod.ObservedValueOf[O5], 
      /* v6 */ rxjsLib.internalTypesMod.ObservedValueOf[O6], 
      R
    ]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  @JSName("zip")
  def zip_OObservableInput[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](array: js.Array[O]): rxjsLib.internalObservableMod.Observable[js.Array[rxjsLib.internalTypesMod.ObservedValueOf[O]]] = js.native
  @JSName("zip")
  def zip_OObservableInput[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](observables: O*): rxjsLib.internalObservableMod.Observable[js.Array[rxjsLib.internalTypesMod.ObservedValueOf[O]]] = js.native
  @JSName("zip")
  def zip_OObservableInputR[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    array: js.Array[O],
    resultSelector: js.Function1[/* repeated */ rxjsLib.internalTypesMod.ObservedValueOf[O], R]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  @JSName("zip")
  def zip_OObservableInputR[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](observables: (O | (js.Function1[/* repeated */ rxjsLib.internalTypesMod.ObservedValueOf[O], R]))*): rxjsLib.internalObservableMod.Observable[R] = js.native
}

