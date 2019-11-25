package typings.reactDashDaterangeDashPicker.reactDashDaterangeDashPickerMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.ReactNode
import typings.reactDashDaterangeDashPicker.reactDashDaterangeDashPickerStrings.next
import typings.reactDashDaterangeDashPicker.reactDashDaterangeDashPickerStrings.previous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationArrowProps[T]
  extends typings.react.reactMod.Props[T] {
  var direction: js.UndefOr[next | previous] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onTrigger: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PaginationArrowProps {
  @scala.inline
  def apply[T](
    children: ReactNode = null,
    direction: next | previous = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onTrigger: () => Unit = null,
    ref: LegacyRef[T] = null
  ): PaginationArrowProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onTrigger != null) __obj.updateDynamic("onTrigger")(js.Any.fromFunction0(onTrigger))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationArrowProps[T]]
  }
}

