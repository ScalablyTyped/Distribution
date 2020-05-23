package typings.resemblejs.mod

import typings.resemblejs.anon.Bottom
import typings.resemblejs.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResembleComparisonResult extends js.Object {
  var analysisTime: Double
  var diffBounds: Bottom
  /**
    * The difference in width and height between the dimensions of the two compared images
    */
  var dimensionDifference: Height
  /**
    * Do the two images have the same dimensions?
    */
  var isSameDimensions: Boolean
  /**
    * The percentage of pixels which do not match between the images
    */
  var misMatchPercentage: Double
  /**
    * Get a data URL for the comparison image
    */
  def getImageDataUrl(): String
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
}

