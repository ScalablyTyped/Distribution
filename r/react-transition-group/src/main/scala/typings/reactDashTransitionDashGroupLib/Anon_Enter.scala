package typings
package reactDashTransitionDashGroupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enter extends js.Object {
  var enter: js.UndefOr[scala.Double] = js.undefined
  var exit: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Enter {
  @scala.inline
  def apply(enter: scala.Int | scala.Double = null, exit: scala.Int | scala.Double = null): Anon_Enter = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Enter]
  }
}

