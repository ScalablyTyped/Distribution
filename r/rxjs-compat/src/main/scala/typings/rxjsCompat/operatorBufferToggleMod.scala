package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.SubscribableOrPromise
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorBufferToggleMod {
  
  @JSImport("rxjs-compat/operator/bufferToggle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bufferToggle[T, O](
    openings: SubscribableOrPromise[O],
    closingSelector: js.Function1[/* value */ O, SubscribableOrPromise[Any]]
  ): Observable_[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferToggle")(openings.asInstanceOf[js.Any], closingSelector.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Array[T]]]
}
