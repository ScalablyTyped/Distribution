package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/from", JSImport.Namespace)
@js.native
object internalObservableFromMod extends js.Object {
  def from[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](input: O): rxjsLib.internalObservableMod.Observable[rxjsLib.internalTypesMod.ObservedValueOf[O]] = js.native
  def from[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](input: O, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[rxjsLib.internalTypesMod.ObservedValueOf[O]] = js.native
}

