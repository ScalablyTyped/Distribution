package typings.reactDashAddonsDashCssDashTransitionDashGroup.reactDashAddonsDashCssDashTransitionDashGroupMod.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLTransitionGroupProps<ReactCSSTransitionGroup> * / any */ trait CSSTransitionGroupProps extends js.Object {
  var transitionAppear: js.UndefOr[Boolean] = js.undefined
  var transitionAppearTimeout: js.UndefOr[Double] = js.undefined
  var transitionEnter: js.UndefOr[Boolean] = js.undefined
  var transitionEnterTimeout: js.UndefOr[Double] = js.undefined
  var transitionLeave: js.UndefOr[Boolean] = js.undefined
  var transitionLeaveTimeout: js.UndefOr[Double] = js.undefined
  var transitionName: String | CSSTransitionGroupTransitionName
}

object CSSTransitionGroupProps {
  @scala.inline
  def apply(
    transitionName: String | CSSTransitionGroupTransitionName,
    transitionAppear: js.UndefOr[Boolean] = js.undefined,
    transitionAppearTimeout: Int | Double = null,
    transitionEnter: js.UndefOr[Boolean] = js.undefined,
    transitionEnterTimeout: Int | Double = null,
    transitionLeave: js.UndefOr[Boolean] = js.undefined,
    transitionLeaveTimeout: Int | Double = null
  ): CSSTransitionGroupProps = {
    val __obj = js.Dynamic.literal(transitionName = transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionAppear)) __obj.updateDynamic("transitionAppear")(transitionAppear.asInstanceOf[js.Any])
    if (transitionAppearTimeout != null) __obj.updateDynamic("transitionAppearTimeout")(transitionAppearTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionEnter)) __obj.updateDynamic("transitionEnter")(transitionEnter.asInstanceOf[js.Any])
    if (transitionEnterTimeout != null) __obj.updateDynamic("transitionEnterTimeout")(transitionEnterTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionLeave)) __obj.updateDynamic("transitionLeave")(transitionLeave.asInstanceOf[js.Any])
    if (transitionLeaveTimeout != null) __obj.updateDynamic("transitionLeaveTimeout")(transitionLeaveTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTransitionGroupProps]
  }
}

