package typings.rxjs.rxjsMod

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.ObservedValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "defer")
@js.native
object defer extends js.Object {
  def apply[R /* <: ObservableInput[_] | Unit */](observableFactory: js.Function0[R]): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[R]] = js.native
}

