package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.ObservedValueOf
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/from", JSImport.Namespace)
@js.native
object internalObservableFromMod extends js.Object {
  def from[O /* <: ObservableInput[_] */](input: O): Observable[ObservedValueOf[O]] = js.native
  def from[O /* <: ObservableInput[_] */](input: O, scheduler: SchedulerLike): Observable[ObservedValueOf[O]] = js.native
}

