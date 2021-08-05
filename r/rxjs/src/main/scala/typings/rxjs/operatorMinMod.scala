package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMinMod {
  
  @JSImport("rxjs/operator/min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def min[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[js.Any]
  inline def min[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(comparer.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
