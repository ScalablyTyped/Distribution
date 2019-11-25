package typings.qiniuDashJs.qiniuDashJsMod

import typings.qiniuDashJs.qiniuDashJsNumbers.`1`
import typings.qiniuDashJs.qiniuDashJsStrings.Center
import typings.qiniuDashJs.qiniuDashJsStrings.East
import typings.qiniuDashJs.qiniuDashJsStrings.North
import typings.qiniuDashJs.qiniuDashJsStrings.NorthEast
import typings.qiniuDashJs.qiniuDashJsStrings.NorthWest
import typings.qiniuDashJs.qiniuDashJsStrings.South
import typings.qiniuDashJs.qiniuDashJsStrings.SouthEast
import typings.qiniuDashJs.qiniuDashJsStrings.SouthWest
import typings.qiniuDashJs.qiniuDashJsStrings.West
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterMarkOptions1 extends js.Object {
   // 图片水印的Url，mode = 1 时 **必需**
  var dissolve: Double
   // 水印位置
  var dx: Double
    // 横轴边距，单位:像素(px)
  var dy: Double
   // 透明度，取值范围1-100，非必需，下同
  var gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast
   // 图片水印
  var image: String
  var mode: `1`
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
}

