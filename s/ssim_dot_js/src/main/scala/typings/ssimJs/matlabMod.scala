package typings.ssimJs

import typings.ssimJs.padarrayMod.PaddingDirection
import typings.ssimJs.padarrayMod.PaddingValue
import typings.ssimJs.ssimJsStrings.gaussian
import typings.ssimJs.typesMod.ImageData
import typings.ssimJs.typesMod.Matrix
import typings.ssimJs.typesMod.Shape
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matlabMod {
  
  @JSImport("ssim.js/dist/matlab", "conv2")
  @js.native
  def conv2(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof boxConv | typeof convn | typeof mxConv2> is not an array type */ args: Parameters[
      (js.Function3[/* a */ Matrix, /* hasDataWidthHeight */ Matrix, js.UndefOr[Shape], Matrix]) | (js.Function4[/* a */ Matrix, /* b1 */ Matrix, /* b2 */ Matrix, /* shape */ js.UndefOr[Shape], Matrix])
    ]
  ): Matrix = js.native
  
  @JSImport("ssim.js/dist/matlab", "filter2")
  @js.native
  def filter2(h: Matrix, X: Matrix): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "filter2")
  @js.native
  def filter2(h: Matrix, X: Matrix, shape: Shape): Matrix = js.native
  
  @JSImport("ssim.js/dist/matlab", "fspecial")
  @js.native
  def fspecial(): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "fspecial")
  @js.native
  def fspecial(_type: js.UndefOr[scala.Nothing], hsize: js.UndefOr[scala.Nothing], σ: Double): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "fspecial")
  @js.native
  def fspecial(_type: js.UndefOr[scala.Nothing], hsize: Double): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "fspecial")
  @js.native
  def fspecial(_type: js.UndefOr[scala.Nothing], hsize: Double, σ: Double): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "fspecial")
  @js.native
  def fspecial_gaussian(_type: gaussian): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "fspecial")
  @js.native
  def fspecial_gaussian(_type: gaussian, hsize: js.UndefOr[scala.Nothing], σ: Double): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "fspecial")
  @js.native
  def fspecial_gaussian(_type: gaussian, hsize: Double): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "fspecial")
  @js.native
  def fspecial_gaussian(_type: gaussian, hsize: Double, σ: Double): Matrix = js.native
  
  @JSImport("ssim.js/dist/matlab", "imfilter")
  @js.native
  def imfilter(A: Matrix, f: Matrix): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "imfilter")
  @js.native
  def imfilter(A: Matrix, f: Matrix, pad: js.UndefOr[scala.Nothing], resSize: Shape): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "imfilter")
  @js.native
  def imfilter(A: Matrix, f: Matrix, pad: PaddingValue): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "imfilter")
  @js.native
  def imfilter(A: Matrix, f: Matrix, pad: PaddingValue, resSize: Shape): Matrix = js.native
  
  @JSImport("ssim.js/dist/matlab", "normpdf")
  @js.native
  def normpdf(hasDataWidthHeight: Matrix): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "normpdf")
  @js.native
  def normpdf(hasDataWidthHeight: Matrix, µ: js.UndefOr[scala.Nothing], σ: Double): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "normpdf")
  @js.native
  def normpdf(hasDataWidthHeight: Matrix, µ: Double): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "normpdf")
  @js.native
  def normpdf(hasDataWidthHeight: Matrix, µ: Double, σ: Double): Matrix = js.native
  
  @JSImport("ssim.js/dist/matlab", "ones")
  @js.native
  def ones(height: Double): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "ones")
  @js.native
  def ones(height: Double, width: Double): Matrix = js.native
  
  @JSImport("ssim.js/dist/matlab", "padarray")
  @js.native
  def padarray(A: Matrix, hasPadHeightPadWidth: js.Tuple2[Double, Double]): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "padarray")
  @js.native
  def padarray(
    A: Matrix,
    hasPadHeightPadWidth: js.Tuple2[Double, Double],
    _padval: js.UndefOr[scala.Nothing],
    _direction: PaddingDirection
  ): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "padarray")
  @js.native
  def padarray(A: Matrix, hasPadHeightPadWidth: js.Tuple2[Double, Double], _padval: PaddingValue): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "padarray")
  @js.native
  def padarray(
    A: Matrix,
    hasPadHeightPadWidth: js.Tuple2[Double, Double],
    _padval: PaddingValue,
    _direction: PaddingDirection
  ): Matrix = js.native
  
  @JSImport("ssim.js/dist/matlab", "rgb2gray")
  @js.native
  def rgb2gray(hasDataWidthHeight: ImageData): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "rgb2gray")
  @js.native
  def rgb2gray(hasDataWidthHeight: Matrix): Matrix = js.native
  
  @JSImport("ssim.js/dist/matlab", "rgb2grayInteger")
  @js.native
  def rgb2grayInteger(hasDataWidthHeight: ImageData): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "rgb2grayInteger")
  @js.native
  def rgb2grayInteger(hasDataWidthHeight: Matrix): Matrix = js.native
  
  @JSImport("ssim.js/dist/matlab", "skip2d")
  @js.native
  def skip2d(
    A: Matrix,
    hasStartRowEveryRowEndRow: js.Tuple3[Double, Double, Double],
    hasStartColEveryColEndCol: js.Tuple3[Double, Double, Double]
  ): Matrix = js.native
  
  @JSImport("ssim.js/dist/matlab", "sub")
  @js.native
  def sub(hasDataWidth: Matrix, x: Double, height: Double, y: Double, width: Double): Matrix = js.native
  
  @JSImport("ssim.js/dist/matlab", "transpose")
  @js.native
  def transpose(hasDataWidthHeight: Matrix): Matrix = js.native
  
  @JSImport("ssim.js/dist/matlab", "zeros")
  @js.native
  def zeros(height: Double): Matrix = js.native
  @JSImport("ssim.js/dist/matlab", "zeros")
  @js.native
  def zeros(height: Double, width: Double): Matrix = js.native
}
