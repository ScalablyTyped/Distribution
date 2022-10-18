package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMinMod {
  
  @JSImport("rxjs-compat/operator/min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def min[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[Observable_[T]]
  inline def min[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(comparer.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
