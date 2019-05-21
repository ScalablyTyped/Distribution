package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait MapUrlTileProps extends js.Object {
  var maximumZ: js.UndefOr[scala.Double] = js.undefined
  var tileSize: js.UndefOr[scala.Double] = js.undefined
  var urlTemplate: java.lang.String
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object MapUrlTileProps {
  @scala.inline
  def apply(
    urlTemplate: java.lang.String,
    maximumZ: scala.Int | scala.Double = null,
    tileSize: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): MapUrlTileProps = {
    val __obj = js.Dynamic.literal(urlTemplate = urlTemplate)
    if (maximumZ != null) __obj.updateDynamic("maximumZ")(maximumZ.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapUrlTileProps]
  }
}

