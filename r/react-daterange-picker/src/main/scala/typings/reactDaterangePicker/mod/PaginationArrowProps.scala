package typings.reactDaterangePicker.mod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import typings.reactDaterangePicker.reactDaterangePickerStrings.next
import typings.reactDaterangePicker.reactDaterangePickerStrings.previous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationArrowProps[T]
  extends typings.react.mod.Props[T] {
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
    ref: js.UndefOr[Null | LegacyRef[T]] = js.undefined
  ): PaginationArrowProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onTrigger != null) __obj.updateDynamic("onTrigger")(js.Any.fromFunction0(onTrigger))
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationArrowProps[T]]
  }
}

