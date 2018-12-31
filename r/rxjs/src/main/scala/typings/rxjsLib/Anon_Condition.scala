package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Condition extends js.Object {
  def apply[T, F](condition: js.Function0[scala.Boolean]): rxjsLib.internalObservableMod.Observable[T | F] = js.native
  def apply[T, F](
    condition: js.Function0[scala.Boolean],
    trueResult: rxjsLib.internalTypesMod.SubscribableOrPromise[T]
  ): rxjsLib.internalObservableMod.Observable[T | F] = js.native
  def apply[T, F](
    condition: js.Function0[scala.Boolean],
    trueResult: rxjsLib.internalTypesMod.SubscribableOrPromise[T],
    falseResult: rxjsLib.internalTypesMod.SubscribableOrPromise[F]
  ): rxjsLib.internalObservableMod.Observable[T | F] = js.native
}

