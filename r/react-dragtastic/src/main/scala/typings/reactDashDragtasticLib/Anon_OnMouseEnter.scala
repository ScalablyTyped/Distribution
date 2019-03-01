package typings
package reactDashDragtasticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnMouseEnter extends js.Object {
  def onMouseEnter(): scala.Unit
  def onMouseLeave(): scala.Unit
  def onMouseUp(): scala.Unit
}

object Anon_OnMouseEnter {
  @scala.inline
  def apply(
    onMouseEnter: js.Function0[scala.Unit],
    onMouseLeave: js.Function0[scala.Unit],
    onMouseUp: js.Function0[scala.Unit]
  ): Anon_OnMouseEnter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    __obj.updateDynamic("onMouseUp")(onMouseUp)
    __obj.asInstanceOf[Anon_OnMouseEnter]
  }
}

