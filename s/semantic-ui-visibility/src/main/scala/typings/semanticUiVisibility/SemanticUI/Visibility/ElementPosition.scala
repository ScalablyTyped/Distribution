package typings.semanticUiVisibility.SemanticUI.Visibility

import typings.jquery.JQueryCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementPosition extends js.Object {
  var fits: Boolean
  var height: Double
  var offset: JQueryCoordinates
  var width: Double
}

object ElementPosition {
  @scala.inline
  def apply(fits: Boolean, height: Double, offset: JQueryCoordinates, width: Double): ElementPosition = {
    val __obj = js.Dynamic.literal(fits = fits.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementPosition]
  }
}

