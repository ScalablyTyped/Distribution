package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/bufferToggle", JSImport.Namespace)
@js.native
object operatorBufferToggleMod extends js.Object {
  def bufferToggle[T, O](
    `this`: rxjsLib.rxjsMod.Observable[T],
    openings: rxjsLib.internalTypesMod.SubscribableOrPromise[O],
    closingSelector: js.Function1[/* value */ O, rxjsLib.internalTypesMod.SubscribableOrPromise[_]]
  ): rxjsLib.rxjsMod.Observable[js.Array[T]] = js.native
}

