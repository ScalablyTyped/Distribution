package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorCatchMod {
  
  @JSImport("rxjs-compat/operator/catch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `catch`[T, R](selector: js.Function2[/* err */ Any, /* caught */ Observable_[T], ObservableInput[R]]): Observable_[T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("_catch")(selector.asInstanceOf[js.Any]).asInstanceOf[Observable_[T | R]]
}
