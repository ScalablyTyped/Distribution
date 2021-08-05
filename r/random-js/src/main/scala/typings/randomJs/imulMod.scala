package typings.randomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imulMod {
  
  @JSImport("random-js/dist/utils/imul", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def imul(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("imul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
