package typings.reactCssTransitionReplace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.CSSTransitionGroupProps * / any */ trait Props extends js.Object {
  var changeWidth: js.UndefOr[Boolean] = js.undefined
  var overflowHidden: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    changeWidth: js.UndefOr[Boolean] = js.undefined,
    overflowHidden: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(changeWidth)) __obj.updateDynamic("changeWidth")(changeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overflowHidden)) __obj.updateDynamic("overflowHidden")(overflowHidden.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

