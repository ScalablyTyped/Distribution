package typings
package reactDashAddonsDashCssDashTransitionDashGroupLib.reactDashAddonsDashCssDashTransitionDashGroupMod.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait CSSTransitionGroupProps extends js.Object {
  var transitionAppear: js.UndefOr[scala.Boolean] = js.undefined
  var transitionAppearTimeout: js.UndefOr[scala.Double] = js.undefined
  var transitionEnter: js.UndefOr[scala.Boolean] = js.undefined
  var transitionEnterTimeout: js.UndefOr[scala.Double] = js.undefined
  var transitionLeave: js.UndefOr[scala.Boolean] = js.undefined
  var transitionLeaveTimeout: js.UndefOr[scala.Double] = js.undefined
  var transitionName: java.lang.String | CSSTransitionGroupTransitionName
}

object CSSTransitionGroupProps {
  @scala.inline
  def apply(
    transitionName: java.lang.String | CSSTransitionGroupTransitionName,
    transitionAppear: js.UndefOr[scala.Boolean] = js.undefined,
    transitionAppearTimeout: scala.Int | scala.Double = null,
    transitionEnter: js.UndefOr[scala.Boolean] = js.undefined,
    transitionEnterTimeout: scala.Int | scala.Double = null,
    transitionLeave: js.UndefOr[scala.Boolean] = js.undefined,
    transitionLeaveTimeout: scala.Int | scala.Double = null
  ): CSSTransitionGroupProps = {
    val __obj = js.Dynamic.literal(transitionName = transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionAppear)) __obj.updateDynamic("transitionAppear")(transitionAppear)
    if (transitionAppearTimeout != null) __obj.updateDynamic("transitionAppearTimeout")(transitionAppearTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionEnter)) __obj.updateDynamic("transitionEnter")(transitionEnter)
    if (transitionEnterTimeout != null) __obj.updateDynamic("transitionEnterTimeout")(transitionEnterTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionLeave)) __obj.updateDynamic("transitionLeave")(transitionLeave)
    if (transitionLeaveTimeout != null) __obj.updateDynamic("transitionLeaveTimeout")(transitionLeaveTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTransitionGroupProps]
  }
}

