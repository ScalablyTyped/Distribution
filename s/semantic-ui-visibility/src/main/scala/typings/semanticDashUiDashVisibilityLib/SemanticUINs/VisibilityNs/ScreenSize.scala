package typings
package semanticDashUiDashVisibilityLib.SemanticUINs.VisibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenSize extends js.Object {
  var height: scala.Double
}

object ScreenSize {
  @scala.inline
  def apply(height: scala.Double): ScreenSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.asInstanceOf[ScreenSize]
  }
}

