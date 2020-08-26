package typings.rxjs.mod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SubscribableOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "iif")
@js.native
object iif extends js.Object {
  def apply[T, F](condition: js.Function0[Boolean]): Observable[T | F] = js.native
  def apply[T, F](
    condition: js.Function0[Boolean],
    trueResult: js.UndefOr[SubscribableOrPromise[T]],
    falseResult: SubscribableOrPromise[F]
  ): Observable[T | F] = js.native
  def apply[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): Observable[T | F] = js.native
}

