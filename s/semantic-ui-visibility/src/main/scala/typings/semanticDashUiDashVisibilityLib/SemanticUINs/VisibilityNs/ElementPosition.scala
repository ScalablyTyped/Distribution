package typings
package semanticDashUiDashVisibilityLib.SemanticUINs.VisibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementPosition extends js.Object {
  var fits: scala.Boolean
  var height: scala.Double
  var offset: jqueryLib.JQueryCoordinates
  var width: scala.Double
}

object ElementPosition {
  @scala.inline
  def apply(
    fits: scala.Boolean,
    height: scala.Double,
    offset: jqueryLib.JQueryCoordinates,
    width: scala.Double
  ): ElementPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fits")(fits)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ElementPosition]
  }
}

