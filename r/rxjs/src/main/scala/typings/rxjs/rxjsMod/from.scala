package typings.rxjs.rxjsMod

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.ObservedValueOf
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "from")
@js.native
object from extends js.Object {
  def apply[O /* <: ObservableInput[_] */](input: O): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O]] = js.native
  def apply[O /* <: ObservableInput[_] */](input: O, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O]] = js.native
}

