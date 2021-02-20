package typings.ssimJs

import typings.ssimJs.anon.DataHeight
import typings.ssimJs.anon.Width
import typings.ssimJs.typesMod.ImageMatrix
import typings.ssimJs.typesMod.MSSIMMatrix
import typings.ssimJs.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weberSsimMod {
  
  @JSImport("ssim.js/dist/weberSsim", "partialSumMatrix1")
  @js.native
  def partialSumMatrix1(pixels: ImageMatrix, f: js.Function3[/* v */ Double, /* x */ Double, /* y */ Double, Double]): Width = js.native
  
  @JSImport("ssim.js/dist/weberSsim", "partialSumMatrix2")
  @js.native
  def partialSumMatrix2(
    pixels1: ImageMatrix,
    pixels2: ImageMatrix,
    f: js.Function4[/* a */ Double, /* b */ Double, /* x */ Double, /* y */ Double, Double]
  ): Width = js.native
  
  @JSImport("ssim.js/dist/weberSsim", "weberSsim")
  @js.native
  def weberSsim(pixels1: ImageMatrix, pixels2: ImageMatrix, options: Options): MSSIMMatrix = js.native
  
  @JSImport("ssim.js/dist/weberSsim", "windowCovariance")
  @js.native
  def windowCovariance(pixels1: ImageMatrix, pixels2: ImageMatrix, sums1: js.Any, sums2: js.Any, windowSize: Double): DataHeight = js.native
  
  @JSImport("ssim.js/dist/weberSsim", "windowMatrix")
  @js.native
  def windowMatrix(sumMatrix: js.Any, windowSize: Double, divisor: Double): DataHeight = js.native
  
  @JSImport("ssim.js/dist/weberSsim", "windowSums")
  @js.native
  def windowSums(pixels: ImageMatrix, windowSize: Double): DataHeight = js.native
  
  @JSImport("ssim.js/dist/weberSsim", "windowVariance")
  @js.native
  def windowVariance(pixels: ImageMatrix, sums: js.Any, windowSize: Double): DataHeight = js.native
}
