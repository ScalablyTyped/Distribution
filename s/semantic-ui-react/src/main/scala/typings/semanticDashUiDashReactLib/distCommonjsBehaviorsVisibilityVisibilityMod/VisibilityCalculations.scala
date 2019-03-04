package typings
package semanticDashUiDashReactLib.distCommonjsBehaviorsVisibilityVisibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibilityCalculations extends js.Object {
  var bottomPassed: scala.Boolean
  var bottomVisible: scala.Boolean
  var direction: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.down | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.up
  var fits: scala.Boolean
  var height: scala.Double
  var offScreen: scala.Boolean
  var onScreen: scala.Boolean
  var passing: scala.Boolean
  var percentagePassed: scala.Double
  var pixelsPassed: scala.Double
  var topPassed: scala.Boolean
  var topVisible: scala.Boolean
  var width: scala.Double
}

object VisibilityCalculations {
  @scala.inline
  def apply(
    bottomPassed: scala.Boolean,
    bottomVisible: scala.Boolean,
    direction: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.down | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.up,
    fits: scala.Boolean,
    height: scala.Double,
    offScreen: scala.Boolean,
    onScreen: scala.Boolean,
    passing: scala.Boolean,
    percentagePassed: scala.Double,
    pixelsPassed: scala.Double,
    topPassed: scala.Boolean,
    topVisible: scala.Boolean,
    width: scala.Double
  ): VisibilityCalculations = {
    val __obj = js.Dynamic.literal(bottomPassed = bottomPassed, bottomVisible = bottomVisible, direction = direction.asInstanceOf[js.Any], fits = fits, height = height, offScreen = offScreen, onScreen = onScreen, passing = passing, percentagePassed = percentagePassed, pixelsPassed = pixelsPassed, topPassed = topPassed, topVisible = topVisible, width = width)
  
    __obj.asInstanceOf[VisibilityCalculations]
  }
}

