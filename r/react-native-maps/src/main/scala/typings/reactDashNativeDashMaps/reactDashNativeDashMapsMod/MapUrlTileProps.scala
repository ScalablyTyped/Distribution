package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties * / any */ trait MapUrlTileProps extends js.Object {
  var maximumZ: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var urlTemplate: String
  var zIndex: js.UndefOr[Double] = js.undefined
}

object MapUrlTileProps {
  @scala.inline
  def apply(
    urlTemplate: String,
    maximumZ: Int | Double = null,
    tileSize: Int | Double = null,
    zIndex: Int | Double = null
  ): MapUrlTileProps = {
    val __obj = js.Dynamic.literal(urlTemplate = urlTemplate.asInstanceOf[js.Any])
    if (maximumZ != null) __obj.updateDynamic("maximumZ")(maximumZ.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapUrlTileProps]
  }
}

