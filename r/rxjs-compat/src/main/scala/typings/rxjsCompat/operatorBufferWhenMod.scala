package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorBufferWhenMod {
  
  @JSImport("rxjs-compat/operator/bufferWhen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bufferWhen[T](closingSelector: js.Function0[Observable_[Any]]): Observable_[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferWhen")(closingSelector.asInstanceOf[js.Any]).asInstanceOf[Observable_[js.Array[T]]]
}
