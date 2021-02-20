package typings.ssimJs

import typings.ssimJs.typesMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skip2dMod {
  
  @JSImport("ssim.js/dist/matlab/skip2d", "skip2d")
  @js.native
  def skip2d(
    A: Matrix,
    hasStartRowEveryRowEndRow: js.Tuple3[Double, Double, Double],
    hasStartColEveryColEndCol: js.Tuple3[Double, Double, Double]
  ): Matrix = js.native
}
