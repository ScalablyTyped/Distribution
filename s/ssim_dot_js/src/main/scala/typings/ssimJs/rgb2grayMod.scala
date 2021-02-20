package typings.ssimJs

import typings.ssimJs.typesMod.ImageData
import typings.ssimJs.typesMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rgb2grayMod {
  
  @JSImport("ssim.js/dist/matlab/rgb2gray", "rgb2gray")
  @js.native
  def rgb2gray(hasDataWidthHeight: ImageData): Matrix = js.native
  @JSImport("ssim.js/dist/matlab/rgb2gray", "rgb2gray")
  @js.native
  def rgb2gray(hasDataWidthHeight: Matrix): Matrix = js.native
  
  @JSImport("ssim.js/dist/matlab/rgb2gray", "rgb2grayInteger")
  @js.native
  def rgb2grayInteger(hasDataWidthHeight: ImageData): Matrix = js.native
  @JSImport("ssim.js/dist/matlab/rgb2gray", "rgb2grayInteger")
  @js.native
  def rgb2grayInteger(hasDataWidthHeight: Matrix): Matrix = js.native
}
