package typings.reactLoadingIndicator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingIndicatorProps extends js.Object {
  /*
    The color of the most solid segment—what we call each spoke of the loading indicator.
    The color prop is an object with four keys: red, green, blue, and alpha.
    The first three color components are values between 0 and 255, inclusive.
    The alpha component is a value between 0 and 1, inclusive.
    */
  var color: js.UndefOr[LoadingIndicatorColor] = js.undefined
  /*
    The number of steps between segments from the boldest segment to the faintest segments.
    If fadeSteps is segments - 1 then only the last segment will be the faintest,
    multiplied by fadeTo.
    If fadeSteps is a lower value, then several of the last segments will all have the faintest opacity.
    */
  var fadeSteps: js.UndefOr[Double] = js.undefined
   // Extra spacing to pad the distance between the center of the loading indicator and each segment, in logical pixels.
  /*
    The alpha multiplier of the faintest segments.
    Each segment's color is determined by multiplying the alpha channel of the color
    prop by a gradually decreasing alpha multiplier that starts at 1 and linearly
    decreases to the fadeTo prop.
    */
  var fadeTo: js.UndefOr[Double] = js.undefined
   // The width of each segment, in logical pixels.
  var segmentLength: js.UndefOr[Double] = js.undefined
   // The number of segments, evenly spaced from each other.
  var segmentWidth: js.UndefOr[Double] = js.undefined
  var segments: js.UndefOr[Double] = js.undefined
   // The length of each segment, in logical pixels.
  var spacing: js.UndefOr[Double] = js.undefined
}

object LoadingIndicatorProps {
  @scala.inline
  def apply(
    color: LoadingIndicatorColor = null,
    fadeSteps: js.UndefOr[Double] = js.undefined,
    fadeTo: js.UndefOr[Double] = js.undefined,
    segmentLength: js.UndefOr[Double] = js.undefined,
    segmentWidth: js.UndefOr[Double] = js.undefined,
    segments: js.UndefOr[Double] = js.undefined,
    spacing: js.UndefOr[Double] = js.undefined
  ): LoadingIndicatorProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeSteps)) __obj.updateDynamic("fadeSteps")(fadeSteps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeTo)) __obj.updateDynamic("fadeTo")(fadeTo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(segmentLength)) __obj.updateDynamic("segmentLength")(segmentLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(segmentWidth)) __obj.updateDynamic("segmentWidth")(segmentWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(segments)) __obj.updateDynamic("segments")(segments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spacing)) __obj.updateDynamic("spacing")(spacing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingIndicatorProps]
  }
}

