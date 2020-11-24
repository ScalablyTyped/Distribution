package typings.ssimJs.typesMod

import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ssimJs.typesMod.Matrix
  - typings.ssimJs.typesMod.ImageData
  - typings.ssimJs.anon.Height
*/
trait ImageMatrix extends js.Object
object ImageMatrix {
  
  @scala.inline
  def Matrix(data: js.Array[Double], height: Double, width: Double): ImageMatrix = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMatrix]
  }
  
  @scala.inline
  def ImageData(data: Uint8ClampedArray, height: Double, width: Double): ImageMatrix = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMatrix]
  }
  
  @scala.inline
  def Height(
    data: Uint8Array | Int8Array | Uint32Array | Int32Array | Uint16Array,
    height: Double,
    width: Double
  ): ImageMatrix = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMatrix]
  }
}
