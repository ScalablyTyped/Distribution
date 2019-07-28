package typings.reactDashImgpro.reactDashImgproMod.ReactImgproNs

import typings.reactDashImgpro.reactDashImgproStrings.horizontal_center
import typings.reactDashImgpro.reactDashImgproStrings.horizontal_left
import typings.reactDashImgpro.reactDashImgproStrings.horizontal_right
import typings.reactDashImgpro.reactDashImgproStrings.vertical_bottom
import typings.reactDashImgpro.reactDashImgproStrings.vertical_middle
import typings.reactDashImgpro.reactDashImgproStrings.vertical_top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var height: Double
  var mode: horizontal_left | horizontal_center | horizontal_right | vertical_top | vertical_bottom | vertical_middle
  var width: Double
}

object Size {
  @scala.inline
  def apply(
    height: Double,
    mode: horizontal_left | horizontal_center | horizontal_right | vertical_top | vertical_bottom | vertical_middle,
    width: Double
  ): Size = {
    val __obj = js.Dynamic.literal(height = height, mode = mode.asInstanceOf[js.Any], width = width)
  
    __obj.asInstanceOf[Size]
  }
}

