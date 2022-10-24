package typings.ssimJs

import typings.ssimJs.distTypesMod.ImageData
import typings.ssimJs.distTypesMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatlabRgb2grayMod {
  
  @JSImport("ssim.js/dist/matlab/rgb2gray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rgb2gray(param0: ImageData): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2gray")(param0.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  inline def rgb2gray(param0: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2gray")(param0.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  
  inline def rgb2grayInteger(param0: ImageData): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2grayInteger")(param0.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  inline def rgb2grayInteger(param0: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2grayInteger")(param0.asInstanceOf[js.Any]).asInstanceOf[Matrix]
}
