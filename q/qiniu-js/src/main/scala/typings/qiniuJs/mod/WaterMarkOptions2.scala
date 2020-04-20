package typings.qiniuJs.mod

import typings.qiniuJs.qiniuJsNumbers.`2`
import typings.qiniuJs.qiniuJsStrings.Center
import typings.qiniuJs.qiniuJsStrings.East
import typings.qiniuJs.qiniuJsStrings.North
import typings.qiniuJs.qiniuJsStrings.NorthEast
import typings.qiniuJs.qiniuJsStrings.NorthWest
import typings.qiniuJs.qiniuJsStrings.South
import typings.qiniuJs.qiniuJsStrings.SouthEast
import typings.qiniuJs.qiniuJsStrings.SouthWest
import typings.qiniuJs.qiniuJsStrings.West
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
    val __obj = js.Dynamic.literal(dissolve = dissolve.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontsize = fontsize.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaterMarkOptions2]
  }
}

