package typings.rxjs.rxjsMod

import typings.rxjs.internalTypesMod.SubscribableOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "iif")
@js.native
object iif extends js.Object {
  def apply[T, F](condition: js.Function0[Boolean]): typings.rxjs.internalObservableMod.Observable[T | F] = js.native
  def apply[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): typings.rxjs.internalObservableMod.Observable[T | F] = js.native
  def apply[T, F](
    condition: js.Function0[Boolean],
    trueResult: SubscribableOrPromise[T],
    falseResult: SubscribableOrPromise[F]
  ): typings.rxjs.internalObservableMod.Observable[T | F] = js.native
}

