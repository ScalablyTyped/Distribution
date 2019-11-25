package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import typings.reactDashNative.reactDashNativeMod.ImageRequireSource
import typings.reactDashNative.reactDashNativeMod.ImageURISource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties * / any */ trait MapOverlayProps extends js.Object {
  var bounds: js.Tuple2[Coordinate, Coordinate]
  var image: js.UndefOr[ImageURISource | ImageRequireSource] = js.undefined
}

object MapOverlayProps {
  @scala.inline
  def apply(bounds: js.Tuple2[Coordinate, Coordinate], image: ImageURISource | ImageRequireSource = null): MapOverlayProps = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOverlayProps]
  }
}

