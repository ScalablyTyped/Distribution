package typings.reactLoadingIndicator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadingIndicatorProps extends js.Object {
  
  /*
    The color of the most solid segment—what we call each spoke of the loading indicator.
    The color prop is an object with four keys: red, green, blue, and alpha.
    The first three color components are values between 0 and 255, inclusive.
    The alpha component is a value between 0 and 1, inclusive.
    */
  var color: js.UndefOr[LoadingIndicatorColor] = js.native
  
  /*
    The number of steps between segments from the boldest segment to the faintest segments.
    If fadeSteps is segments - 1 then only the last segment will be the faintest,
    multiplied by fadeTo.
    If fadeSteps is a lower value, then several of the last segments will all have the faintest opacity.
    */
  var fadeSteps: js.UndefOr[Double] = js.native
  
   // Extra spacing to pad the distance between the center of the loading indicator and each segment, in logical pixels.
  /*
    The alpha multiplier of the faintest segments.
    Each segment's color is determined by multiplying the alpha channel of the color
    prop by a gradually decreasing alpha multiplier that starts at 1 and linearly
    decreases to the fadeTo prop.
    */
  var fadeTo: js.UndefOr[Double] = js.native
  
   // The width of each segment, in logical pixels.
  var segmentLength: js.UndefOr[Double] = js.native
  
   // The number of segments, evenly spaced from each other.
  var segmentWidth: js.UndefOr[Double] = js.native
  
  var segments: js.UndefOr[Double] = js.native
  
   // The length of each segment, in logical pixels.
  var spacing: js.UndefOr[Double] = js.native
}
object LoadingIndicatorProps {
  
  @scala.inline
  def apply(): LoadingIndicatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadingIndicatorProps]
  }
  
  @scala.inline
  implicit class LoadingIndicatorPropsOps[Self <: LoadingIndicatorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: LoadingIndicatorColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFadeSteps(value: Double): Self = this.set("fadeSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeSteps: Self = this.set("fadeSteps", js.undefined)
    
    @scala.inline
    def setFadeTo(value: Double): Self = this.set("fadeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeTo: Self = this.set("fadeTo", js.undefined)
    
    @scala.inline
    def setSegmentLength(value: Double): Self = this.set("segmentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentLength: Self = this.set("segmentLength", js.undefined)
    
    @scala.inline
    def setSegmentWidth(value: Double): Self = this.set("segmentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentWidth: Self = this.set("segmentWidth", js.undefined)
    
    @scala.inline
    def setSegments(value: Double): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
  }
}
