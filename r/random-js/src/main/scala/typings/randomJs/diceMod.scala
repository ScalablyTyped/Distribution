package typings.randomJs

import typings.randomJs.typesMod.Distribution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diceMod {
  
  @JSImport("random-js/dist/distribution/dice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dice(sideCount: Double, dieCount: Double): Distribution[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dice")(sideCount.asInstanceOf[js.Any], dieCount.asInstanceOf[js.Any])).asInstanceOf[Distribution[js.Array[Double]]]
}
