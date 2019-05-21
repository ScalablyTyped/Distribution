package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait MapLocalTileProps extends js.Object {
  var pathTemplate: java.lang.String
  var tileSize: js.UndefOr[scala.Double] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object MapLocalTileProps {
  @scala.inline
  def apply(
    pathTemplate: java.lang.String,
    tileSize: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): MapLocalTileProps = {
    val __obj = js.Dynamic.literal(pathTemplate = pathTemplate)
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLocalTileProps]
  }
}

