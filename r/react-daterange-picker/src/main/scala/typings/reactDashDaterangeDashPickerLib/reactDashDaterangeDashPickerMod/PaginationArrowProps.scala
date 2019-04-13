package typings
package reactDashDaterangeDashPickerLib.reactDashDaterangeDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationArrowProps[T]
  extends reactLib.reactMod.Props[T] {
  var direction: js.UndefOr[
    reactDashDaterangeDashPickerLib.reactDashDaterangeDashPickerLibStrings.next | reactDashDaterangeDashPickerLib.reactDashDaterangeDashPickerLibStrings.previous
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var onTrigger: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object PaginationArrowProps {
  @scala.inline
  def apply[T](
    children: reactLib.reactMod.ReactNode = null,
    direction: reactDashDaterangeDashPickerLib.reactDashDaterangeDashPickerLibStrings.next | reactDashDaterangeDashPickerLib.reactDashDaterangeDashPickerLibStrings.previous = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.Key = null,
    onTrigger: () => scala.Unit = null,
    ref: reactLib.reactMod.LegacyRef[T] = null
  ): PaginationArrowProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onTrigger != null) __obj.updateDynamic("onTrigger")(js.Any.fromFunction0(onTrigger))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationArrowProps[T]]
  }
}

