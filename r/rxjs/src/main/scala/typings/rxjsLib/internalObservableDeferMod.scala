package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/defer", JSImport.Namespace)
@js.native
object internalObservableDeferMod extends js.Object {
  def defer[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](observableFactory: js.Function0[O | scala.Unit]): rxjsLib.internalObservableMod.Observable[rxjsLib.internalTypesMod.ObservedValueOf[O]] = js.native
}

