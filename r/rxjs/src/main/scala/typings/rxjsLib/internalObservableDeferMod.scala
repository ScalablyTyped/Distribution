package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/defer", JSImport.Namespace)
@js.native
object internalObservableDeferMod extends js.Object {
  def defer[T](observableFactory: js.Function0[rxjsLib.internalTypesMod.SubscribableOrPromise[T] | scala.Unit]): rxjsLib.internalObservableMod.Observable[T] = js.native
}

