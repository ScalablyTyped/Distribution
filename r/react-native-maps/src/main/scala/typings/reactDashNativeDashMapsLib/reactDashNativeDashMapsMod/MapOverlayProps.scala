package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait MapOverlayProps extends js.Object {
  var bounds: js.Tuple2[Coordinate, Coordinate]
  var image: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.ImageURISource | reactDashNativeLib.reactDashNativeMod.ImageRequireSource
  ] = js.undefined
}

object MapOverlayProps {
  @scala.inline
  def apply(
    bounds: js.Tuple2[Coordinate, Coordinate],
    image: reactDashNativeLib.reactDashNativeMod.ImageURISource | reactDashNativeLib.reactDashNativeMod.ImageRequireSource = null
  ): MapOverlayProps = {
    val __obj = js.Dynamic.literal(bounds = bounds)
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOverlayProps]
  }
}

