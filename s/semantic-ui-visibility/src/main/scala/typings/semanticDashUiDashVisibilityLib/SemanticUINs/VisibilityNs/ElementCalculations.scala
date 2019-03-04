package typings
package semanticDashUiDashVisibilityLib.SemanticUINs.VisibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementCalculations extends ElementPosition {
  var bottom: scala.Double
  var bottomPassed: scala.Boolean
  var bottomVisible: scala.Boolean
  var margin: js.UndefOr[semanticDashUiDashVisibilityLib.Anon_Bottom] = js.undefined
  var offScreen: scala.Boolean
  var onScreen: scala.Boolean
  var passing: scala.Boolean
  var percentagePassed: scala.Double
  var pixelsPassed: scala.Double
  var top: scala.Double
  var topPassed: scala.Boolean
  var topVisible: scala.Boolean
}

object ElementCalculations {
  @scala.inline
  def apply(
    bottom: scala.Double,
    bottomPassed: scala.Boolean,
    bottomVisible: scala.Boolean,
    fits: scala.Boolean,
    height: scala.Double,
    offScreen: scala.Boolean,
    offset: jqueryLib.JQueryCoordinates,
    onScreen: scala.Boolean,
    passing: scala.Boolean,
    percentagePassed: scala.Double,
    pixelsPassed: scala.Double,
    top: scala.Double,
    topPassed: scala.Boolean,
    topVisible: scala.Boolean,
    width: scala.Double,
    margin: semanticDashUiDashVisibilityLib.Anon_Bottom = null
  ): ElementCalculations = {
    val __obj = js.Dynamic.literal(bottom = bottom, bottomPassed = bottomPassed, bottomVisible = bottomVisible, fits = fits, height = height, offScreen = offScreen, offset = offset, onScreen = onScreen, passing = passing, percentagePassed = percentagePassed, pixelsPassed = pixelsPassed, top = top, topPassed = topPassed, topVisible = topVisible, width = width)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    __obj.asInstanceOf[ElementCalculations]
  }
}

