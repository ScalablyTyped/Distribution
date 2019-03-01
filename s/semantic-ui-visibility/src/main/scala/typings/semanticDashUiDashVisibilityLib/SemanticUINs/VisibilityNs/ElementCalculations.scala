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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("bottomPassed")(bottomPassed)
    __obj.updateDynamic("bottomVisible")(bottomVisible)
    __obj.updateDynamic("fits")(fits)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("offScreen")(offScreen)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("onScreen")(onScreen)
    __obj.updateDynamic("passing")(passing)
    __obj.updateDynamic("percentagePassed")(percentagePassed)
    __obj.updateDynamic("pixelsPassed")(pixelsPassed)
    __obj.updateDynamic("top")(top)
    __obj.updateDynamic("topPassed")(topPassed)
    __obj.updateDynamic("topVisible")(topVisible)
    __obj.updateDynamic("width")(width)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    __obj.asInstanceOf[ElementCalculations]
  }
}

