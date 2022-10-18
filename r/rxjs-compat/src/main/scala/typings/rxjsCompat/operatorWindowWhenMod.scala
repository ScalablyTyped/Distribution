package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorWindowWhenMod {
  
  @JSImport("rxjs-compat/operator/windowWhen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def windowWhen[T](closingSelector: js.Function0[Observable_[Any]]): Observable_[Observable_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("windowWhen")(closingSelector.asInstanceOf[js.Any]).asInstanceOf[Observable_[Observable_[T]]]
}
