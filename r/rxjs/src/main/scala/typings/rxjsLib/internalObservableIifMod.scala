package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/iif", JSImport.Namespace)
@js.native
object internalObservableIifMod extends js.Object {
  def iif[T, F](condition: js.Function0[scala.Boolean]): rxjsLib.internalObservableMod.Observable[T | F] = js.native
  def iif[T, F](
    condition: js.Function0[scala.Boolean],
    trueResult: rxjsLib.internalTypesMod.SubscribableOrPromise[T]
  ): rxjsLib.internalObservableMod.Observable[T | F] = js.native
  def iif[T, F](
    condition: js.Function0[scala.Boolean],
    trueResult: rxjsLib.internalTypesMod.SubscribableOrPromise[T],
    falseResult: rxjsLib.internalTypesMod.SubscribableOrPromise[F]
  ): rxjsLib.internalObservableMod.Observable[T | F] = js.native
}

