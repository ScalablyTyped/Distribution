package typings.ssimJs

import typings.ssimJs.anon.DataHeight
import typings.ssimJs.anon.Width
import typings.ssimJs.typesMod.ImageMatrix
import typings.ssimJs.typesMod.MSSIMMatrix
import typings.ssimJs.typesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssim.js/dist/weberSsim", JSImport.Namespace)
@js.native
object weberSsimMod extends js.Object {
  
  def partialSumMatrix1(pixels: ImageMatrix, f: js.Function3[/* v */ Double, /* x */ Double, /* y */ Double, Double]): Width = js.native
  
  def partialSumMatrix2(
    pixels1: ImageMatrix,
    pixels2: ImageMatrix,
    f: js.Function4[/* a */ Double, /* b */ Double, /* x */ Double, /* y */ Double, Double]
  ): Width = js.native
  
  def weberSsim(pixels1: ImageMatrix, pixels2: ImageMatrix, options: Options): MSSIMMatrix = js.native
  
  def windowCovariance(pixels1: ImageMatrix, pixels2: ImageMatrix, sums1: js.Any, sums2: js.Any, windowSize: Double): DataHeight = js.native
  
  def windowMatrix(sumMatrix: js.Any, windowSize: Double, divisor: Double): DataHeight = js.native
  
  def windowSums(pixels: ImageMatrix, windowSize: Double): DataHeight = js.native
  
  def windowVariance(pixels: ImageMatrix, sums: js.Any, windowSize: Double): DataHeight = js.native
}
