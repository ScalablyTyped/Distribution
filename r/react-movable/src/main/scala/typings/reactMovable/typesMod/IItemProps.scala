package typings.reactMovable.typesMod

import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.RefObject
import typings.react.mod.WheelEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemProps extends js.Object {
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Double] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[Element], Unit]] = js.undefined
  var onWheel: js.UndefOr[js.Function1[/* e */ WheelEvent[Element], Unit]] = js.undefined
  var ref: js.UndefOr[RefObject[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
}

object IItemProps {
  @scala.inline
  def apply(
    `aria-roledescription`: String = null,
    key: js.UndefOr[Double] = js.undefined,
    onKeyDown: /* e */ KeyboardEvent[Element] => Unit = null,
    onWheel: /* e */ WheelEvent[Element] => Unit = null,
    ref: RefObject[_] = null,
    style: CSSProperties = null,
    tabIndex: js.UndefOr[Double] = js.undefined
  ): IItemProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key.get.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemProps]
  }
}

