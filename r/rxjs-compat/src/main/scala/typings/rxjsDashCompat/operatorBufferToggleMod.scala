package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.SubscribableOrPromise
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/bufferToggle", JSImport.Namespace)
@js.native
object operatorBufferToggleMod extends js.Object {
  def bufferToggle[T, O](
    `this`: Observable[T],
    openings: SubscribableOrPromise[O],
    closingSelector: js.Function1[/* value */ O, SubscribableOrPromise[_]]
  ): Observable[js.Array[T]] = js.native
}

