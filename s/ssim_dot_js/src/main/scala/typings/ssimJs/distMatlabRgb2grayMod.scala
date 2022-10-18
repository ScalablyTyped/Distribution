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
  
  inline def rgb2gray(hasDWidthHeight: ImageData): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2gray")(hasDWidthHeight.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  inline def rgb2gray(hasDWidthHeight: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2gray")(hasDWidthHeight.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  
  inline def rgb2grayInteger(hasDWidthHeight: ImageData): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2grayInteger")(hasDWidthHeight.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  inline def rgb2grayInteger(hasDWidthHeight: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2grayInteger")(hasDWidthHeight.asInstanceOf[js.Any]).asInstanceOf[Matrix]
}
