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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottomPassed")(bottomPassed)
    __obj.updateDynamic("bottomVisible")(bottomVisible)
    __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.updateDynamic("fits")(fits)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("offScreen")(offScreen)
    __obj.updateDynamic("onScreen")(onScreen)
    __obj.updateDynamic("passing")(passing)
    __obj.updateDynamic("percentagePassed")(percentagePassed)
    __obj.updateDynamic("pixelsPassed")(pixelsPassed)
    __obj.updateDynamic("topPassed")(topPassed)
    __obj.updateDynamic("topVisible")(topVisible)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[VisibilityCalculations]
  }
}

