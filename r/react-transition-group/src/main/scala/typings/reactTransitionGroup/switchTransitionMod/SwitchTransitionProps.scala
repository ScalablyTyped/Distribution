package typings.reactTransitionGroup.switchTransitionMod

import typings.react.mod.ReactElement
import typings.reactTransitionGroup.reactTransitionGroupStrings.`in-out`
import typings.reactTransitionGroup.reactTransitionGroupStrings.`out-in`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchTransitionProps extends js.Object {
  /**
    * Any `Transition` or `CSSTransition` component
    */
  var children: ReactElement
  /**
    * Transition modes.
    * `out-in`: Current element transitions out first, then when complete, the new element transitions in.
    * `in-out`: New element transitions in first, then when complete, the current element transitions out.
    */
  var mode: js.UndefOr[`out-in` | `in-out`] = js.undefined
}

object SwitchTransitionProps {
  @scala.inline
  def apply(children: ReactElement, mode: `out-in` | `in-out` = null): SwitchTransitionProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchTransitionProps]
  }
}

