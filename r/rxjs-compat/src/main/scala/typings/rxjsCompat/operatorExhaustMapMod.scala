package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorExhaustMapMod {
  
  @JSImport("rxjs-compat/operator/exhaustMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exhaustMap[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaustMap")(project.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
}
