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
    if (appear != null) __obj.updateDynamic("appear")(appear.asInstanceOf[js.Any])
    if (appearActive != null) __obj.updateDynamic("appearActive")(appearActive.asInstanceOf[js.Any])
    if (appearDone != null) __obj.updateDynamic("appearDone")(appearDone.asInstanceOf[js.Any])
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (enterActive != null) __obj.updateDynamic("enterActive")(enterActive.asInstanceOf[js.Any])
    if (enterDone != null) __obj.updateDynamic("enterDone")(enterDone.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    if (exitActive != null) __obj.updateDynamic("exitActive")(exitActive.asInstanceOf[js.Any])
    if (exitDone != null) __obj.updateDynamic("exitDone")(exitDone.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTransitionClassNames]
  }
}

