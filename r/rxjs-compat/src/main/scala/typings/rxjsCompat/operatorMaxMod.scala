package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMaxMod {
  
  @JSImport("rxjs-compat/operator/max", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def max[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[Observable_[T]]
  inline def max[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(comparer.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
