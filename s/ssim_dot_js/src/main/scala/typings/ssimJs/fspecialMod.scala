package typings.ssimJs

import typings.ssimJs.ssimJsStrings.gaussian
import typings.ssimJs.typesMod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssim.js/dist/matlab/fspecial", JSImport.Namespace)
@js.native
object fspecialMod extends js.Object {
  
  def fspecial(): Matrix = js.native
  def fspecial(_type: js.UndefOr[scala.Nothing], hsize: js.UndefOr[scala.Nothing], σ: Double): Matrix = js.native
  def fspecial(_type: js.UndefOr[scala.Nothing], hsize: Double): Matrix = js.native
  def fspecial(_type: js.UndefOr[scala.Nothing], hsize: Double, σ: Double): Matrix = js.native
  @JSName("fspecial")
  def fspecial_gaussian(_type: gaussian): Matrix = js.native
  @JSName("fspecial")
  def fspecial_gaussian(_type: gaussian, hsize: js.UndefOr[scala.Nothing], σ: Double): Matrix = js.native
  @JSName("fspecial")
  def fspecial_gaussian(_type: gaussian, hsize: Double): Matrix = js.native
  @JSName("fspecial")
  def fspecial_gaussian(_type: gaussian, hsize: Double, σ: Double): Matrix = js.native
}
