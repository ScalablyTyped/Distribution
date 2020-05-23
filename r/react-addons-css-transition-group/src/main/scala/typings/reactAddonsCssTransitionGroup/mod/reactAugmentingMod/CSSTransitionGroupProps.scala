package typings.reactAddonsCssTransitionGroup.mod.reactAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HTMLTransitionGroupProps<ReactCSSTransitionGroup> * / any */ trait CSSTransitionGroupProps extends js.Object {
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
    transitionAppearTimeout: js.UndefOr[Double] = js.undefined,
    transitionEnter: js.UndefOr[Boolean] = js.undefined,
    transitionEnterTimeout: js.UndefOr[Double] = js.undefined,
    transitionLeave: js.UndefOr[Boolean] = js.undefined,
    transitionLeaveTimeout: js.UndefOr[Double] = js.undefined
  ): CSSTransitionGroupProps = {
    val __obj = js.Dynamic.literal(transitionName = transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionAppear)) __obj.updateDynamic("transitionAppear")(transitionAppear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionAppearTimeout)) __obj.updateDynamic("transitionAppearTimeout")(transitionAppearTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionEnter)) __obj.updateDynamic("transitionEnter")(transitionEnter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionEnterTimeout)) __obj.updateDynamic("transitionEnterTimeout")(transitionEnterTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionLeave)) __obj.updateDynamic("transitionLeave")(transitionLeave.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionLeaveTimeout)) __obj.updateDynamic("transitionLeaveTimeout")(transitionLeaveTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTransitionGroupProps]
  }
}

