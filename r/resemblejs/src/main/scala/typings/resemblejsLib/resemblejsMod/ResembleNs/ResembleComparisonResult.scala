package typings
package resemblejsLib.resemblejsMod.ResembleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResembleComparisonResult extends js.Object {
  var analysisTime: scala.Double
  var diffBounds: resemblejsLib.Anon_Bottom
  /**
    * The difference in width and height between the dimensions of the two compared images
    */
  var dimensionDifference: resemblejsLib.Anon_Height
  /**
    * Do the two images have the same dimensions?
    */
  var isSameDimensions: scala.Boolean
  /**
    * The percentage of pixels which do not match between the images
    */
  var misMatchPercentage: scala.Double
  /**
    * Get a data URL for the comparison image
    */
  def getImageDataUrl(): java.lang.String
}

object ResembleComparisonResult {
  @scala.inline
  def apply(
    analysisTime: scala.Double,
    diffBounds: resemblejsLib.Anon_Bottom,
    dimensionDifference: resemblejsLib.Anon_Height,
    getImageDataUrl: () => java.lang.String,
    isSameDimensions: scala.Boolean,
    misMatchPercentage: scala.Double
  ): ResembleComparisonResult = {
    val __obj = js.Dynamic.literal(analysisTime = analysisTime, diffBounds = diffBounds, dimensionDifference = dimensionDifference, getImageDataUrl = js.Any.fromFunction0(getImageDataUrl), isSameDimensions = isSameDimensions, misMatchPercentage = misMatchPercentage)
  
    __obj.asInstanceOf[ResembleComparisonResult]
  }
}

