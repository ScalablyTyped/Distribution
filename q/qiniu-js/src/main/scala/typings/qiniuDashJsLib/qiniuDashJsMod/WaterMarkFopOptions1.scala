package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterMarkFopOptions1 extends WaterMarkOptions1 {
  var fop: qiniuDashJsLib.qiniuDashJsLibStrings.watermark
}

object WaterMarkFopOptions1 {
  @scala.inline
  def apply(
    dissolve: scala.Double,
    dx: scala.Double,
    dy: scala.Double,
    fop: qiniuDashJsLib.qiniuDashJsLibStrings.watermark,
    gravity: qiniuDashJsLib.qiniuDashJsLibStrings.NorthWest | qiniuDashJsLib.qiniuDashJsLibStrings.North | qiniuDashJsLib.qiniuDashJsLibStrings.NorthEast | qiniuDashJsLib.qiniuDashJsLibStrings.West | qiniuDashJsLib.qiniuDashJsLibStrings.Center | qiniuDashJsLib.qiniuDashJsLibStrings.East | qiniuDashJsLib.qiniuDashJsLibStrings.SouthWest | qiniuDashJsLib.qiniuDashJsLibStrings.South | qiniuDashJsLib.qiniuDashJsLibStrings.SouthEast,
    image: java.lang.String,
    mode: qiniuDashJsLib.qiniuDashJsLibNumbers.`1`
  ): WaterMarkFopOptions1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dissolve")(dissolve)
    __obj.updateDynamic("dx")(dx)
    __obj.updateDynamic("dy")(dy)
    __obj.updateDynamic("fop")(fop)
    __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[WaterMarkFopOptions1]
  }
}

