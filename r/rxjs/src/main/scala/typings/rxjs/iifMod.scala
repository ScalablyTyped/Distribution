package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SubscribableOrPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iifMod {
  
  @JSImport("rxjs/internal/observable/iif", "iif")
  @js.native
  def iif[T, F](condition: js.Function0[Boolean]): Observable[T | F] = js.native
  @JSImport("rxjs/internal/observable/iif", "iif")
  @js.native
  def iif[T, F](
    condition: js.Function0[Boolean],
    trueResult: js.UndefOr[SubscribableOrPromise[T]],
    falseResult: SubscribableOrPromise[F]
  ): Observable[T | F] = js.native
  @JSImport("rxjs/internal/observable/iif", "iif")
  @js.native
  def iif[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): Observable[T | F] = js.native
}
