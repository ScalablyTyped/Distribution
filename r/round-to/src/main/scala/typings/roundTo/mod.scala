package typings.roundTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("round-to", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def roundTo(number: Double, precision: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("roundTo")(number.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def roundToDown(number: Double, precision: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("roundToDown")(number.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def roundToUp(number: Double, precision: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("roundToUp")(number.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
}
