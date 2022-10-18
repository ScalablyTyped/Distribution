package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableIfMod {
  
  @JSImport("rxjs-compat/observable/if", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `if`[T, F](condition: js.Function0[Boolean], trueResult: ObservableInput[T], falseResult: ObservableInput[F]): Observable[T | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("_if")(condition.asInstanceOf[js.Any], trueResult.asInstanceOf[js.Any], falseResult.asInstanceOf[js.Any])).asInstanceOf[Observable[T | F]]
}
