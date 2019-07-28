package typings.qiniuDashJs.qiniuDashJsMod

import typings.qiniuDashJs.qiniuDashJsNumbers.`2`
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

trait WaterMarkOptions2 extends js.Object {
   // 水印文字，mode = 2 时 **必需**
  var dissolve: Double
             // 水印文字字体
  var dx: Double
                 // 横轴边距，单位:像素(px)
  var dy: Double
                 // 纵轴边距，单位:像素(px)
  var fill: String
           // 字体大小，单位: 缇
  var font: String
   // 水印位置
  var fontsize: Double
            // 透明度，取值范围1-100，非必需，下同
  var gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast
  var mode: `2`
    // 文字水印
  var text: String
}

object WaterMarkOptions2 {
  @scala.inline
  def apply(
    dissolve: Double,
    dx: Double,
    dy: Double,
    fill: String,
    font: String,
    fontsize: Double,
    gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast,
    mode: `2`,
    text: String
  ): WaterMarkOptions2 = {
    val __obj = js.Dynamic.literal(dissolve = dissolve, dx = dx, dy = dy, fill = fill, font = font, fontsize = fontsize, gravity = gravity.asInstanceOf[js.Any], mode = mode, text = text)
  
    __obj.asInstanceOf[WaterMarkOptions2]
  }
}

