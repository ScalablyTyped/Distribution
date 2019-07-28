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
import typings.qiniuDashJs.qiniuDashJsStrings.watermark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterMarkFopOptions2 extends WaterMarkOptions2 {
  var fop: watermark
}

object WaterMarkFopOptions2 {
  @scala.inline
  def apply(
    dissolve: Double,
    dx: Double,
    dy: Double,
    fill: String,
    font: String,
    fontsize: Double,
    fop: watermark,
    gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast,
    mode: `2`,
    text: String
  ): WaterMarkFopOptions2 = {
    val __obj = js.Dynamic.literal(dissolve = dissolve, dx = dx, dy = dy, fill = fill, font = font, fontsize = fontsize, fop = fop, gravity = gravity.asInstanceOf[js.Any], mode = mode, text = text)
  
    __obj.asInstanceOf[WaterMarkFopOptions2]
  }
}

