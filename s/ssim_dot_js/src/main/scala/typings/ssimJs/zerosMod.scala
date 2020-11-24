package typings.ssimJs

import typings.ssimJs.typesMod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssim.js/dist/matlab/zeros", JSImport.Namespace)
@js.native
object zerosMod extends js.Object {
  
  def zeros(height: Double): Matrix = js.native
  def zeros(height: Double, width: Double): Matrix = js.native
}
