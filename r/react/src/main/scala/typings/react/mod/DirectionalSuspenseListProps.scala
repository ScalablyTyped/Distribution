package typings.react.mod

import typings.react.reactStrings.backwards
import typings.react.reactStrings.forwards
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionalSuspenseListProps
  extends typings.react.experimentalMod.reactAugmentingMod.SuspenseListCommonProps {
  /**
    * Defines the order in which the `SuspenseList` children should be revealed.
    */
  var revealOrder: forwards | backwards
  /**
    * Dictates how unloaded items in a SuspenseList is shown.
    *
    * - By default, `SuspenseList` will show all fallbacks in the list.
    * - `collapsed` shows only the next fallback in the list.
    * - `hidden` doesn’t show any unloaded items.
    */
  var tail: js.UndefOr[typings.react.experimentalMod.reactAugmentingMod.SuspenseListTailMode] = js.undefined
}

object DirectionalSuspenseListProps {
  @scala.inline
  def apply(
    children: ReactElement | Iterable[ReactElement],
    revealOrder: forwards | backwards,
    tail: typings.react.experimentalMod.reactAugmentingMod.SuspenseListTailMode = null
  ): DirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    if (tail != null) __obj.updateDynamic("tail")(tail.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionalSuspenseListProps]
  }
}

