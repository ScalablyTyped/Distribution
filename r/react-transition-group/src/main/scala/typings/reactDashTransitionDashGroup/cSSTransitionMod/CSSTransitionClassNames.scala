package typings.reactDashTransitionDashGroup.cSSTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSTransitionClassNames extends js.Object {
  var appear: js.UndefOr[String] = js.undefined
  var appearActive: js.UndefOr[String] = js.undefined
  var appearDone: js.UndefOr[String] = js.undefined
  var enter: js.UndefOr[String] = js.undefined
  var enterActive: js.UndefOr[String] = js.undefined
  var enterDone: js.UndefOr[String] = js.undefined
  var exit: js.UndefOr[String] = js.undefined
  var exitActive: js.UndefOr[String] = js.undefined
  var exitDone: js.UndefOr[String] = js.undefined
}

object CSSTransitionClassNames {
  @scala.inline
  def apply(
    appear: String = null,
    appearActive: String = null,
    appearDone: String = null,
    enter: String = null,
    enterActive: String = null,
    enterDone: String = null,
    exit: String = null,
    exitActive: String = null,
    exitDone: String = null
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

