package typings.qiniuJs.mod

import typings.qiniuJs.qiniuJsNumbers.`1`
import typings.qiniuJs.qiniuJsStrings.Center
import typings.qiniuJs.qiniuJsStrings.East
import typings.qiniuJs.qiniuJsStrings.North
import typings.qiniuJs.qiniuJsStrings.NorthEast
import typings.qiniuJs.qiniuJsStrings.NorthWest
import typings.qiniuJs.qiniuJsStrings.South
import typings.qiniuJs.qiniuJsStrings.SouthEast
import typings.qiniuJs.qiniuJsStrings.SouthWest
import typings.qiniuJs.qiniuJsStrings.West
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaterMarkOptions1 extends StObject {
  
  // 图片水印的Url，mode = 1 时 **必需**
  var dissolve: Double = js.native
  
  // 水印位置
  var dx: Double = js.native
  
  // 横轴边距，单位:像素(px)
  var dy: Double = js.native
  
  // 透明度，取值范围1-100，非必需，下同
  var gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast = js.native
  
  // 图片水印
  var image: String = js.native
  
  var mode: `1` = js.native
}
object WaterMarkOptions1 {
  
  @scala.inline
  def apply(
    dissolve: Double,
    dx: Double,
    dy: Double,
    gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast,
    image: String,
    mode: `1`
  ): WaterMarkOptions1 = {
    val __obj = js.Dynamic.literal(dissolve = dissolve.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaterMarkOptions1]
  }
  
  @scala.inline
  implicit class WaterMarkOptions1MutableBuilder[Self <: WaterMarkOptions1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDissolve(value: Double): Self = StObject.set(x, "dissolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravity(value: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: `1`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
