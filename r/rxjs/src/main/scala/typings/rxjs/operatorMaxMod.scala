package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMaxMod {
  
  @JSImport("rxjs/operator/max", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def max[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[js.Any]
  inline def max[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(comparer.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
