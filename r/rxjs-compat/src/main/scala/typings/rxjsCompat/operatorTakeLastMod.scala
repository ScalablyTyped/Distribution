package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorTakeLastMod {
  
  @JSImport("rxjs-compat/operator/takeLast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def takeLast[T](count: Double): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeLast")(count.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
