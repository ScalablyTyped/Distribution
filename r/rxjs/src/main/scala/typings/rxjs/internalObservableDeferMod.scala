package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.ObservedValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/defer", JSImport.Namespace)
@js.native
object internalObservableDeferMod extends js.Object {
  def defer[O /* <: ObservableInput[_] */](observableFactory: js.Function0[O | Unit]): Observable[ObservedValueOf[O]] = js.native
}

