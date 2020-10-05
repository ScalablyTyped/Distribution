package typings.rxjs.anon

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SubscribableOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  def apply[T, F](condition: js.Function0[Boolean]): Observable[T | F] = js.native
  def apply[T, F](
    condition: js.Function0[Boolean],
    trueResult: js.UndefOr[SubscribableOrPromise[T]],
    falseResult: SubscribableOrPromise[F]
  ): Observable[T | F] = js.native
  def apply[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): Observable[T | F] = js.native
}

