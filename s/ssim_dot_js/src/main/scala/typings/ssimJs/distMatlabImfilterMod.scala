package typings.ssimJs

import typings.ssimJs.distMatlabPadarrayMod.PaddingValue
import typings.ssimJs.distTypesMod.Matrix
import typings.ssimJs.distTypesMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatlabImfilterMod {
  
  @JSImport("ssim.js/dist/matlab/imfilter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def imfilter(A: Matrix, f: Matrix): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("imfilter")(A.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def imfilter(A: Matrix, f: Matrix, pad: Unit, resSize: Shape): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("imfilter")(A.asInstanceOf[js.Any], f.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], resSize.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def imfilter(A: Matrix, f: Matrix, pad: PaddingValue): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("imfilter")(A.asInstanceOf[js.Any], f.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def imfilter(A: Matrix, f: Matrix, pad: PaddingValue, resSize: Shape): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("imfilter")(A.asInstanceOf[js.Any], f.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], resSize.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}
