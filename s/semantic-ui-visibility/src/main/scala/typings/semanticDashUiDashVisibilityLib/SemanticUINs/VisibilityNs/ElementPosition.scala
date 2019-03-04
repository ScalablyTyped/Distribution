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
    val __obj = js.Dynamic.literal(fits = fits, height = height, offset = offset, width = width)
  
    __obj.asInstanceOf[ElementPosition]
  }
}

