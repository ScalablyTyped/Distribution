package typings.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod

import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.down
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibilityCalculations extends js.Object {
  var bottomPassed: Boolean
  var bottomVisible: Boolean
  var direction: down | up
  var fits: Boolean
  var height: Double
  var offScreen: Boolean
  var onScreen: Boolean
  var passing: Boolean
  var percentagePassed: Double
  var pixelsPassed: Double
  var topPassed: Boolean
  var topVisible: Boolean
  var width: Double
}

object VisibilityCalculations {
  @scala.inline
  def apply(
    bottomPassed: Boolean,
    bottomVisible: Boolean,
    direction: down | up,
    fits: Boolean,
    height: Double,
    offScreen: Boolean,
    onScreen: Boolean,
    passing: Boolean,
    percentagePassed: Double,
    pixelsPassed: Double,
    topPassed: Boolean,
    topVisible: Boolean,
    width: Double
  ): VisibilityCalculations = {
    val __obj = js.Dynamic.literal(bottomPassed = bottomPassed, bottomVisible = bottomVisible, direction = direction.asInstanceOf[js.Any], fits = fits, height = height, offScreen = offScreen, onScreen = onScreen, passing = passing, percentagePassed = percentagePassed, pixelsPassed = pixelsPassed, topPassed = topPassed, topVisible = topVisible, width = width)
  
    __obj.asInstanceOf[VisibilityCalculations]
  }
}

