package typings.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nearestMod {
  
  @JSImport("@react-md/utils/types/nearest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def nearest(value: Double, min: Double, max: Double, steps: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nearest")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[Double]
}
