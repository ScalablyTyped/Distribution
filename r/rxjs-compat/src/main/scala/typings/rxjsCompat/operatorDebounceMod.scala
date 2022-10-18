package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.SubscribableOrPromise
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorDebounceMod {
  
  @JSImport("rxjs-compat/operator/debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debounce[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[Any]]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
