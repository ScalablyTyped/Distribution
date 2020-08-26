package typings.resemblejs.mod

import typings.resemblejs.anon.Bottom
import typings.resemblejs.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResembleComparisonResult extends js.Object {
  var analysisTime: Double = js.native
  var diffBounds: Bottom = js.native
  /**
    * The difference in width and height between the dimensions of the two compared images
    */
  var dimensionDifference: Height = js.native
  /**
    * Do the two images have the same dimensions?
    */
  var isSameDimensions: Boolean = js.native
  /**
    * The percentage of pixels which do not match between the images
    */
  var misMatchPercentage: Double = js.native
  /**
    * Get a data URL for the comparison image
    */
  def getImageDataUrl(): String = js.native
}

object ResembleComparisonResult {
  @scala.inline
  def apply(
    analysisTime: Double,
    diffBounds: Bottom,
    dimensionDifference: Height,
    getImageDataUrl: () => String,
    isSameDimensions: Boolean,
    misMatchPercentage: Double
  ): ResembleComparisonResult = {
    val __obj = js.Dynamic.literal(analysisTime = analysisTime.asInstanceOf[js.Any], diffBounds = diffBounds.asInstanceOf[js.Any], dimensionDifference = dimensionDifference.asInstanceOf[js.Any], getImageDataUrl = js.Any.fromFunction0(getImageDataUrl), isSameDimensions = isSameDimensions.asInstanceOf[js.Any], misMatchPercentage = misMatchPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResembleComparisonResult]
  }
  @scala.inline
  implicit class ResembleComparisonResultOps[Self <: ResembleComparisonResult] (val x: Self) extends AnyVal {
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
    def setAnalysisTime(value: Double): Self = this.set("analysisTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiffBounds(value: Bottom): Self = this.set("diffBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimensionDifference(value: Height): Self = this.set("dimensionDifference", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetImageDataUrl(value: () => String): Self = this.set("getImageDataUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSameDimensions(value: Boolean): Self = this.set("isSameDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setMisMatchPercentage(value: Double): Self = this.set("misMatchPercentage", value.asInstanceOf[js.Any])
  }
  
}

