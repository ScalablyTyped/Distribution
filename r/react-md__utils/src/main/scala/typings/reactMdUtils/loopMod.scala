package typings.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loopMod {
  
  @JSImport("@react-md/utils/types/loop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def loop(x: Double, max: Double, increment: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(x.asInstanceOf[js.Any], max.asInstanceOf[js.Any], increment.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def loop(x: Double, max: Double, increment: Boolean, minmax: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(x.asInstanceOf[js.Any], max.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minmax.asInstanceOf[js.Any])).asInstanceOf[Double]
}
