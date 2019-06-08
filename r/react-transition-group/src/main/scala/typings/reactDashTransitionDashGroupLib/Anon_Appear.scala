package typings
package reactDashTransitionDashGroupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Appear extends js.Object {
  var appear: js.UndefOr[scala.Double] = js.undefined
  var enter: js.UndefOr[scala.Double] = js.undefined
  var exit: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Appear {
  @scala.inline
  def apply(
    appear: scala.Int | scala.Double = null,
    enter: scala.Int | scala.Double = null,
    exit: scala.Int | scala.Double = null
  ): Anon_Appear = {
    val __obj = js.Dynamic.literal()
    if (appear != null) __obj.updateDynamic("appear")(appear.asInstanceOf[js.Any])
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Appear]
  }
}

