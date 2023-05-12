package typings.smoothScrollbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsClampMod {
  
  @JSImport("smooth-scrollbar/utils/clamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clamp(value: Double, lower: Double, upper: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any])).asInstanceOf[Double]
}
