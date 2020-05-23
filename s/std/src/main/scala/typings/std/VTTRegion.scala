package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VTTRegion extends js.Object {
  var id: java.lang.String
  var lines: Double
  var regionAnchorX: Double
  var regionAnchorY: Double
  var scroll: ScrollSetting
  var viewportAnchorX: Double
  var viewportAnchorY: Double
  var width: Double
}

object VTTRegion {
  @scala.inline
  def apply(
    id: java.lang.String,
    lines: Double,
    regionAnchorX: Double,
    regionAnchorY: Double,
    scroll: ScrollSetting,
    viewportAnchorX: Double,
    viewportAnchorY: Double,
    width: Double
  ): VTTRegion = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], regionAnchorX = regionAnchorX.asInstanceOf[js.Any], regionAnchorY = regionAnchorY.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], viewportAnchorX = viewportAnchorX.asInstanceOf[js.Any], viewportAnchorY = viewportAnchorY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VTTRegion]
  }
}

