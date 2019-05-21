package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait MapWMSTileProps extends js.Object {
  var maximumZ: js.UndefOr[scala.Double] = js.undefined
  var minimumZ: js.UndefOr[scala.Double] = js.undefined
  var opacity: scala.Double
  var tileSize: scala.Double
  var urlTemplate: java.lang.String
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object MapWMSTileProps {
  @scala.inline
  def apply(
    opacity: scala.Double,
    tileSize: scala.Double,
    urlTemplate: java.lang.String,
    maximumZ: scala.Int | scala.Double = null,
    minimumZ: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): MapWMSTileProps = {
    val __obj = js.Dynamic.literal(opacity = opacity, tileSize = tileSize, urlTemplate = urlTemplate)
    if (maximumZ != null) __obj.updateDynamic("maximumZ")(maximumZ.asInstanceOf[js.Any])
    if (minimumZ != null) __obj.updateDynamic("minimumZ")(minimumZ.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapWMSTileProps]
  }
}

