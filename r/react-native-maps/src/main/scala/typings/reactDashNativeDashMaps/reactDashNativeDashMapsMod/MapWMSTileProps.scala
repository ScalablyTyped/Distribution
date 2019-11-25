package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties * / any */ trait MapWMSTileProps extends js.Object {
  var maximumZ: js.UndefOr[Double] = js.undefined
  var minimumZ: js.UndefOr[Double] = js.undefined
  var opacity: Double
  var tileSize: Double
  var urlTemplate: String
  var zIndex: js.UndefOr[Double] = js.undefined
}

object MapWMSTileProps {
  @scala.inline
  def apply(
    opacity: Double,
    tileSize: Double,
    urlTemplate: String,
    maximumZ: Int | Double = null,
    minimumZ: Int | Double = null,
    zIndex: Int | Double = null
  ): MapWMSTileProps = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any], urlTemplate = urlTemplate.asInstanceOf[js.Any])
    if (maximumZ != null) __obj.updateDynamic("maximumZ")(maximumZ.asInstanceOf[js.Any])
    if (minimumZ != null) __obj.updateDynamic("minimumZ")(minimumZ.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapWMSTileProps]
  }
}

