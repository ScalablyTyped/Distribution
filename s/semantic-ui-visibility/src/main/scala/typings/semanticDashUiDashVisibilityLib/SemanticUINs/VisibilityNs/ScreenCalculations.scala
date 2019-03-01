package typings
package semanticDashUiDashVisibilityLib.SemanticUINs.VisibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenCalculations extends js.Object {
  var bottom: scala.Double
  var top: scala.Double
}

object ScreenCalculations {
  @scala.inline
  def apply(bottom: scala.Double, top: scala.Double): ScreenCalculations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[ScreenCalculations]
  }
}

