package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minMod {
  
  @JSImport("rxjs-compat/operators/min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def min[T](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[Any]
  inline def min[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(comparer.asInstanceOf[js.Any]).asInstanceOf[Any]
}
