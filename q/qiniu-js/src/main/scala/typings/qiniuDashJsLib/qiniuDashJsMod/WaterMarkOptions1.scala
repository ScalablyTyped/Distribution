package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WaterMarkOptions1 extends js.Object {
   // 图片水印的Url，mode = 1 时 **必需**
  var dissolve: scala.Double
   // 水印位置
  var dx: scala.Double
    // 横轴边距，单位:像素(px)
  var dy: scala.Double
   // 透明度，取值范围1-100，非必需，下同
  var gravity: qiniuDashJsLib.qiniuDashJsLibStrings.NorthWest | qiniuDashJsLib.qiniuDashJsLibStrings.North | qiniuDashJsLib.qiniuDashJsLibStrings.NorthEast | qiniuDashJsLib.qiniuDashJsLibStrings.West | qiniuDashJsLib.qiniuDashJsLibStrings.Center | qiniuDashJsLib.qiniuDashJsLibStrings.East | qiniuDashJsLib.qiniuDashJsLibStrings.SouthWest | qiniuDashJsLib.qiniuDashJsLibStrings.South | qiniuDashJsLib.qiniuDashJsLibStrings.SouthEast
   // 图片水印
  var image: java.lang.String
  var mode: qiniuDashJsLib.qiniuDashJsLibNumbers.`1`
}

