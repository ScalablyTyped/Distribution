package typings.ssimJs

import typings.ssimJs.padarrayMod.PaddingValue
import typings.ssimJs.typesMod.Matrix
import typings.ssimJs.typesMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imfilterMod {
  
  @JSImport("ssim.js/dist/matlab/imfilter", "imfilter")
  @js.native
  def imfilter(A: Matrix, f: Matrix): Matrix = js.native
  @JSImport("ssim.js/dist/matlab/imfilter", "imfilter")
  @js.native
  def imfilter(A: Matrix, f: Matrix, pad: js.UndefOr[scala.Nothing], resSize: Shape): Matrix = js.native
  @JSImport("ssim.js/dist/matlab/imfilter", "imfilter")
  @js.native
  def imfilter(A: Matrix, f: Matrix, pad: PaddingValue): Matrix = js.native
  @JSImport("ssim.js/dist/matlab/imfilter", "imfilter")
  @js.native
  def imfilter(A: Matrix, f: Matrix, pad: PaddingValue, resSize: Shape): Matrix = js.native
}
