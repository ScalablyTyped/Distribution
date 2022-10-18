package typings.ssimJs

import typings.ssimJs.distTypesMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatlabSkip2dMod {
  
  @JSImport("ssim.js/dist/matlab/skip2d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def skip2d(
    A: Matrix,
    hasStartRowEveryRowEndRow: js.Tuple3[Double, Double, Double],
    hasStartColEveryColEndCol: js.Tuple3[Double, Double, Double]
  ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("skip2d")(A.asInstanceOf[js.Any], hasStartRowEveryRowEndRow.asInstanceOf[js.Any], hasStartColEveryColEndCol.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}
