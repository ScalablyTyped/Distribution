package typings.ssimJs

import typings.ssimJs.typesMod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssim.js/dist/matlab/normpdf", JSImport.Namespace)
@js.native
object normpdfMod extends js.Object {
  
  def normpdf(hasDataWidthHeight: Matrix): Matrix = js.native
  def normpdf(hasDataWidthHeight: Matrix, µ: js.UndefOr[scala.Nothing], σ: Double): Matrix = js.native
  def normpdf(hasDataWidthHeight: Matrix, µ: Double): Matrix = js.native
  def normpdf(hasDataWidthHeight: Matrix, µ: Double, σ: Double): Matrix = js.native
}
