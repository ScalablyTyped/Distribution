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
import typings.qiniuDashJs.qiniuDashJsStrings.watermark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterMarkFopOptions1 extends WaterMarkOptions1 {
  var fop: watermark
}

object WaterMarkFopOptions1 {
  @scala.inline
  def apply(
    dissolve: Double,
    dx: Double,
    dy: Double,
    fop: watermark,
    gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast,
    image: String,
    mode: `1`
  ): WaterMarkFopOptions1 = {
    val __obj = js.Dynamic.literal(dissolve = dissolve, dx = dx, dy = dy, fop = fop, gravity = gravity.asInstanceOf[js.Any], image = image, mode = mode)
  
    __obj.asInstanceOf[WaterMarkFopOptions1]
  }
}

