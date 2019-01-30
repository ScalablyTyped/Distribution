package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/concat", JSImport.Namespace)
@js.native
object internalObservableConcatMod extends js.Object {
  def concat[R](
    observables: (rxjsLib.internalTypesMod.ObservableInput[_] | rxjsLib.internalTypesMod.SchedulerLike)*
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1): rxjsLib.internalObservableMod.Observable[rxjsLib.internalTypesMod.ObservedValueOf[O1]] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[rxjsLib.internalTypesMod.ObservedValueOf[O1]] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2] | rxjsLib.internalTypesMod.ObservedValueOf[O3]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2] | rxjsLib.internalTypesMod.ObservedValueOf[O3]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2] | rxjsLib.internalTypesMod.ObservedValueOf[O3] | rxjsLib.internalTypesMod.ObservedValueOf[O4]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2] | rxjsLib.internalTypesMod.ObservedValueOf[O3] | rxjsLib.internalTypesMod.ObservedValueOf[O4]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2] | rxjsLib.internalTypesMod.ObservedValueOf[O3] | rxjsLib.internalTypesMod.ObservedValueOf[O4] | rxjsLib.internalTypesMod.ObservedValueOf[O5]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2] | rxjsLib.internalTypesMod.ObservedValueOf[O3] | rxjsLib.internalTypesMod.ObservedValueOf[O4] | rxjsLib.internalTypesMod.ObservedValueOf[O5]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O6 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2] | rxjsLib.internalTypesMod.ObservedValueOf[O3] | rxjsLib.internalTypesMod.ObservedValueOf[O4] | rxjsLib.internalTypesMod.ObservedValueOf[O5] | rxjsLib.internalTypesMod.ObservedValueOf[O6]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O6 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2] | rxjsLib.internalTypesMod.ObservedValueOf[O3] | rxjsLib.internalTypesMod.ObservedValueOf[O4] | rxjsLib.internalTypesMod.ObservedValueOf[O5] | rxjsLib.internalTypesMod.ObservedValueOf[O6]
  ] = js.native
  @JSName("concat")
  def concat_OObservableInput[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](observables: (O | rxjsLib.internalTypesMod.SchedulerLike)*): rxjsLib.internalObservableMod.Observable[rxjsLib.internalTypesMod.ObservedValueOf[O]] = js.native
}

