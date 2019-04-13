package typings
package reactDashTransitionDashGroupLib.cSSTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSTransitionClassNames extends js.Object {
  var appear: js.UndefOr[java.lang.String] = js.undefined
  var appearActive: js.UndefOr[java.lang.String] = js.undefined
  var appearDone: js.UndefOr[java.lang.String] = js.undefined
  var enter: js.UndefOr[java.lang.String] = js.undefined
  var enterActive: js.UndefOr[java.lang.String] = js.undefined
  var enterDone: js.UndefOr[java.lang.String] = js.undefined
  var exit: js.UndefOr[java.lang.String] = js.undefined
  var exitActive: js.UndefOr[java.lang.String] = js.undefined
  var exitDone: js.UndefOr[java.lang.String] = js.undefined
}

object CSSTransitionClassNames {
  @scala.inline
  def apply(
    appear: java.lang.String = null,
    appearActive: java.lang.String = null,
    appearDone: java.lang.String = null,
    enter: java.lang.String = null,
    enterActive: java.lang.String = null,
    enterDone: java.lang.String = null,
    exit: java.lang.String = null,
    exitActive: java.lang.String = null,
    exitDone: java.lang.String = null
  ): CSSTransitionClassNames = {
    val __obj = js.Dynamic.literal()
    if (appear != null) __obj.updateDynamic("appear")(appear)
    if (appearActive != null) __obj.updateDynamic("appearActive")(appearActive)
    if (appearDone != null) __obj.updateDynamic("appearDone")(appearDone)
    if (enter != null) __obj.updateDynamic("enter")(enter)
    if (enterActive != null) __obj.updateDynamic("enterActive")(enterActive)
    if (enterDone != null) __obj.updateDynamic("enterDone")(enterDone)
    if (exit != null) __obj.updateDynamic("exit")(exit)
    if (exitActive != null) __obj.updateDynamic("exitActive")(exitActive)
    if (exitDone != null) __obj.updateDynamic("exitDone")(exitDone)
    __obj.asInstanceOf[CSSTransitionClassNames]
  }
}

