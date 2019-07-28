package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait MapLocalTileProps extends js.Object {
  var pathTemplate: String
  var tileSize: js.UndefOr[Double] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object MapLocalTileProps {
  @scala.inline
  def apply(pathTemplate: String, tileSize: Int | Double = null, zIndex: Int | Double = null): MapLocalTileProps = {
    val __obj = js.Dynamic.literal(pathTemplate = pathTemplate)
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLocalTileProps]
  }
}

