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

trait WaterMarkFopOptions1 extends WaterMarkOptions1 {
  var fop: typings.qiniuDashJs.qiniuDashJsStrings.watermark
}

object WaterMarkFopOptions1 {
  @scala.inline
  def apply(
    dissolve: Double,
    dx: Double,
    dy: Double,
    fop: typings.qiniuDashJs.qiniuDashJsStrings.watermark,
    gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast,
    image: String,
    mode: `1`
  ): WaterMarkFopOptions1 = {
    val __obj = js.Dynamic.literal(dissolve = dissolve.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], fop = fop.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WaterMarkFopOptions1]
  }
}

