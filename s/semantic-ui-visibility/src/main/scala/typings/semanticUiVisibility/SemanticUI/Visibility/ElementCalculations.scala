package typings.semanticUiVisibility.SemanticUI.Visibility

import typings.jquery.JQueryCoordinates
import typings.semanticUiVisibility.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementCalculations extends ElementPosition {
  var bottom: Double
  var bottomPassed: Boolean
  var bottomVisible: Boolean
  var margin: js.UndefOr[Bottom] = js.undefined
  var offScreen: Boolean
  var onScreen: Boolean
  var passing: Boolean
  var percentagePassed: Double
  var pixelsPassed: Double
  var top: Double
  var topPassed: Boolean
  var topVisible: Boolean
}

object ElementCalculations {
  @scala.inline
  def apply(
    bottom: Double,
    bottomPassed: Boolean,
    bottomVisible: Boolean,
    fits: Boolean,
    height: Double,
    offScreen: Boolean,
    offset: JQueryCoordinates,
    onScreen: Boolean,
    passing: Boolean,
    percentagePassed: Double,
    pixelsPassed: Double,
    top: Double,
    topPassed: Boolean,
    topVisible: Boolean,
    width: Double,
    margin: Bottom = null
  ): ElementCalculations = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomPassed = bottomPassed.asInstanceOf[js.Any], bottomVisible = bottomVisible.asInstanceOf[js.Any], fits = fits.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offScreen = offScreen.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onScreen = onScreen.asInstanceOf[js.Any], passing = passing.asInstanceOf[js.Any], percentagePassed = percentagePassed.asInstanceOf[js.Any], pixelsPassed = pixelsPassed.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topPassed = topPassed.asInstanceOf[js.Any], topVisible = topVisible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCalculations]
  }
}

