package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SubscribableOrPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iifMod {
  
  @JSImport("rxjs/internal/observable/iif", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def iif[T, F](condition: js.Function0[Boolean]): Observable[T | F] = ^.asInstanceOf[js.Dynamic].applyDynamic("iif")(condition.asInstanceOf[js.Any]).asInstanceOf[Observable[T | F]]
  @scala.inline
  def iif[T, F](condition: js.Function0[Boolean], trueResult: Unit, falseResult: SubscribableOrPromise[F]): Observable[T | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("iif")(condition.asInstanceOf[js.Any], trueResult.asInstanceOf[js.Any], falseResult.asInstanceOf[js.Any])).asInstanceOf[Observable[T | F]]
  @scala.inline
  def iif[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): Observable[T | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("iif")(condition.asInstanceOf[js.Any], trueResult.asInstanceOf[js.Any])).asInstanceOf[Observable[T | F]]
  @scala.inline
  def iif[T, F](
    condition: js.Function0[Boolean],
    trueResult: SubscribableOrPromise[T],
    falseResult: SubscribableOrPromise[F]
  ): Observable[T | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("iif")(condition.asInstanceOf[js.Any], trueResult.asInstanceOf[js.Any], falseResult.asInstanceOf[js.Any])).asInstanceOf[Observable[T | F]]
}
