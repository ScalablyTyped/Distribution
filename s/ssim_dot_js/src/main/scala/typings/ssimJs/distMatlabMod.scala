package typings.ssimJs

import typings.ssimJs.distMatlabPadarrayMod.PaddingDirection
import typings.ssimJs.distMatlabPadarrayMod.PaddingValue
import typings.ssimJs.distTypesMod.ImageData
import typings.ssimJs.distTypesMod.Matrix
import typings.ssimJs.distTypesMod.Shape
import typings.ssimJs.ssimJsStrings.gaussian
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatlabMod {
  
  @JSImport("ssim.js/dist/matlab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv2(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof boxConv | typeof convn | typeof mxConv2> is not an array type */ args: Parameters[
      (js.Function3[/* a */ Matrix, /* hasDataWidthHeight */ Matrix, js.UndefOr[Shape], Matrix]) | (js.Function4[/* a */ Matrix, /* b1 */ Matrix, /* b2 */ Matrix, /* shape */ js.UndefOr[Shape], Matrix])
    ]
  ): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2")(args.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  
  inline def filter2(h: Matrix, X: Matrix): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("filter2")(h.asInstanceOf[js.Any], X.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def filter2(h: Matrix, X: Matrix, shape: Shape): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("filter2")(h.asInstanceOf[js.Any], X.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  inline def fspecial(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fspecial")().asInstanceOf[Matrix]
  inline def fspecial(_type: Unit, hsize: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("fspecial")(_type.asInstanceOf[js.Any], hsize.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def fspecial(_type: Unit, hsize: Double, σ: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("fspecial")(_type.asInstanceOf[js.Any], hsize.asInstanceOf[js.Any], σ.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def fspecial(_type: Unit, hsize: Unit, σ: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("fspecial")(_type.asInstanceOf[js.Any], hsize.asInstanceOf[js.Any], σ.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  inline def fspecial_gaussian(_type: gaussian): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fspecial")(_type.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  inline def fspecial_gaussian(_type: gaussian, hsize: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("fspecial")(_type.asInstanceOf[js.Any], hsize.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def fspecial_gaussian(_type: gaussian, hsize: Double, σ: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("fspecial")(_type.asInstanceOf[js.Any], hsize.asInstanceOf[js.Any], σ.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def fspecial_gaussian(_type: gaussian, hsize: Unit, σ: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("fspecial")(_type.asInstanceOf[js.Any], hsize.asInstanceOf[js.Any], σ.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  inline def imfilter(A: Matrix, f: Matrix): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("imfilter")(A.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def imfilter(A: Matrix, f: Matrix, pad: Unit, resSize: Shape): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("imfilter")(A.asInstanceOf[js.Any], f.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], resSize.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def imfilter(A: Matrix, f: Matrix, pad: PaddingValue): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("imfilter")(A.asInstanceOf[js.Any], f.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def imfilter(A: Matrix, f: Matrix, pad: PaddingValue, resSize: Shape): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("imfilter")(A.asInstanceOf[js.Any], f.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], resSize.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  inline def normpdf(hasRefWidthHeight: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("normpdf")(hasRefWidthHeight.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  inline def normpdf(hasRefWidthHeight: Matrix, µ: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("normpdf")(hasRefWidthHeight.asInstanceOf[js.Any], µ.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def normpdf(hasRefWidthHeight: Matrix, µ: Double, σ: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("normpdf")(hasRefWidthHeight.asInstanceOf[js.Any], µ.asInstanceOf[js.Any], σ.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def normpdf(hasRefWidthHeight: Matrix, µ: Unit, σ: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("normpdf")(hasRefWidthHeight.asInstanceOf[js.Any], µ.asInstanceOf[js.Any], σ.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  inline def ones(height: Double): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("ones")(height.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  inline def ones(height: Double, width: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("ones")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  inline def padarray(A: Matrix, hasPadHeightPadWidth: js.Tuple2[Double, Double]): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("padarray")(A.asInstanceOf[js.Any], hasPadHeightPadWidth.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def padarray(
    A: Matrix,
    hasPadHeightPadWidth: js.Tuple2[Double, Double],
    _padval: Unit,
    _direction: PaddingDirection
  ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("padarray")(A.asInstanceOf[js.Any], hasPadHeightPadWidth.asInstanceOf[js.Any], _padval.asInstanceOf[js.Any], _direction.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def padarray(A: Matrix, hasPadHeightPadWidth: js.Tuple2[Double, Double], _padval: PaddingValue): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("padarray")(A.asInstanceOf[js.Any], hasPadHeightPadWidth.asInstanceOf[js.Any], _padval.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def padarray(
    A: Matrix,
    hasPadHeightPadWidth: js.Tuple2[Double, Double],
    _padval: PaddingValue,
    _direction: PaddingDirection
  ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("padarray")(A.asInstanceOf[js.Any], hasPadHeightPadWidth.asInstanceOf[js.Any], _padval.asInstanceOf[js.Any], _direction.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  inline def rgb2gray(hasDWidthHeight: ImageData): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2gray")(hasDWidthHeight.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  inline def rgb2gray(hasDWidthHeight: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2gray")(hasDWidthHeight.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  
  inline def rgb2grayInteger(hasDWidthHeight: ImageData): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2grayInteger")(hasDWidthHeight.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  inline def rgb2grayInteger(hasDWidthHeight: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2grayInteger")(hasDWidthHeight.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  
  inline def skip2d(
    A: Matrix,
    hasStartRowEveryRowEndRow: js.Tuple3[Double, Double, Double],
    hasStartColEveryColEndCol: js.Tuple3[Double, Double, Double]
  ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("skip2d")(A.asInstanceOf[js.Any], hasStartRowEveryRowEndRow.asInstanceOf[js.Any], hasStartColEveryColEndCol.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  inline def sub(hasRefRefWidth: Matrix, x: Double, height: Double, y: Double, width: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(hasRefRefWidth.asInstanceOf[js.Any], x.asInstanceOf[js.Any], height.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  inline def transpose(hasRefWidthHeight: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(hasRefWidthHeight.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  
  inline def zeros(height: Double): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(height.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  inline def zeros(height: Double, width: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}
