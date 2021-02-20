package typings.ssimJs

import typings.ssimJs.ssimJsStrings.both
import typings.ssimJs.ssimJsStrings.symmetric
import typings.ssimJs.typesMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object padarrayMod {
  
  @JSImport("ssim.js/dist/matlab/padarray", "padarray")
  @js.native
  def padarray(A: Matrix, hasPadHeightPadWidth: js.Tuple2[Double, Double]): Matrix = js.native
  @JSImport("ssim.js/dist/matlab/padarray", "padarray")
  @js.native
  def padarray(
    A: Matrix,
    hasPadHeightPadWidth: js.Tuple2[Double, Double],
    _padval: js.UndefOr[scala.Nothing],
    _direction: PaddingDirection
  ): Matrix = js.native
  @JSImport("ssim.js/dist/matlab/padarray", "padarray")
  @js.native
  def padarray(A: Matrix, hasPadHeightPadWidth: js.Tuple2[Double, Double], _padval: PaddingValue): Matrix = js.native
  @JSImport("ssim.js/dist/matlab/padarray", "padarray")
  @js.native
  def padarray(
    A: Matrix,
    hasPadHeightPadWidth: js.Tuple2[Double, Double],
    _padval: PaddingValue,
    _direction: PaddingDirection
  ): Matrix = js.native
  
  type PaddingDirection = both
  
  type PaddingValue = symmetric
}
