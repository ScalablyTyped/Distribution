package typings.semanticDashUiDashVisibility.SemanticUINs.VisibilityNs

import typings.jquery.JQueryCoordinates
import typings.semanticDashUiDashVisibility.Anon_Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementCalculations extends ElementPosition {
  var bottom: Double
  var bottomPassed: Boolean
  var bottomVisible: Boolean
  var margin: js.UndefOr[Anon_Bottom] = js.undefined
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
    margin: Anon_Bottom = null
  ): ElementCalculations = {
    val __obj = js.Dynamic.literal(bottom = bottom, bottomPassed = bottomPassed, bottomVisible = bottomVisible, fits = fits, height = height, offScreen = offScreen, offset = offset, onScreen = onScreen, passing = passing, percentagePassed = percentagePassed, pixelsPassed = pixelsPassed, top = top, topPassed = topPassed, topVisible = topVisible, width = width)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    __obj.asInstanceOf[ElementCalculations]
  }
}

