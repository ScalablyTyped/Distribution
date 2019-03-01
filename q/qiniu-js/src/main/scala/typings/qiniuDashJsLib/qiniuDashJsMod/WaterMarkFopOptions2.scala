package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterMarkFopOptions2 extends WaterMarkOptions2 {
  var fop: qiniuDashJsLib.qiniuDashJsLibStrings.watermark
}

object WaterMarkFopOptions2 {
  @scala.inline
  def apply(
    dissolve: scala.Double,
    dx: scala.Double,
    dy: scala.Double,
    fill: java.lang.String,
    font: java.lang.String,
    fontsize: scala.Double,
    fop: qiniuDashJsLib.qiniuDashJsLibStrings.watermark,
    gravity: qiniuDashJsLib.qiniuDashJsLibStrings.NorthWest | qiniuDashJsLib.qiniuDashJsLibStrings.North | qiniuDashJsLib.qiniuDashJsLibStrings.NorthEast | qiniuDashJsLib.qiniuDashJsLibStrings.West | qiniuDashJsLib.qiniuDashJsLibStrings.Center | qiniuDashJsLib.qiniuDashJsLibStrings.East | qiniuDashJsLib.qiniuDashJsLibStrings.SouthWest | qiniuDashJsLib.qiniuDashJsLibStrings.South | qiniuDashJsLib.qiniuDashJsLibStrings.SouthEast,
    mode: qiniuDashJsLib.qiniuDashJsLibNumbers.`2`,
    text: java.lang.String
  ): WaterMarkFopOptions2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dissolve")(dissolve)
    __obj.updateDynamic("dx")(dx)
    __obj.updateDynamic("dy")(dy)
    __obj.updateDynamic("fill")(fill)
    __obj.updateDynamic("font")(font)
    __obj.updateDynamic("fontsize")(fontsize)
    __obj.updateDynamic("fop")(fop)
    __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[WaterMarkFopOptions2]
  }
}

