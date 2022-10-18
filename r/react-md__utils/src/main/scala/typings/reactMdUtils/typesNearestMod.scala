package typings.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNearestMod {
  
  @JSImport("@react-md/utils/types/nearest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nearest(value: Double, min: Double, max: Double, steps: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nearest")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def nearest(value: Double, min: Double, max: Double, steps: Double, range: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nearest")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Double]
}
