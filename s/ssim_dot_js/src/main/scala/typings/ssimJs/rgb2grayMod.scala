package typings.ssimJs

import typings.ssimJs.typesMod.ImageData
import typings.ssimJs.typesMod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssim.js/dist/matlab/rgb2gray", JSImport.Namespace)
@js.native
object rgb2grayMod extends js.Object {
  
  def rgb2gray(hasDataWidthHeight: ImageData): Matrix = js.native
  def rgb2gray(hasDataWidthHeight: Matrix): Matrix = js.native
  
  def rgb2grayInteger(hasDataWidthHeight: ImageData): Matrix = js.native
  def rgb2grayInteger(hasDataWidthHeight: Matrix): Matrix = js.native
}
