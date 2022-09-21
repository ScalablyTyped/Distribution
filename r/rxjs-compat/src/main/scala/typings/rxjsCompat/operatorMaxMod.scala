package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMaxMod {
  
  @JSImport("rxjs-compat/operator/max", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def max[T](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[Any]
  inline def max[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(comparer.asInstanceOf[js.Any]).asInstanceOf[Any]
}
