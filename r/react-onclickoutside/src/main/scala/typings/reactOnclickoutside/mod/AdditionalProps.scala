package typings.reactOnclickoutside.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalProps extends ConfigObject {
  var disableOnClickOutside: js.UndefOr[Boolean] = js.undefined
  var eventTypes: js.UndefOr[String | js.Array[String]] = js.undefined
  var outsideClickIgnoreClass: js.UndefOr[String] = js.undefined
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  var stopPropagation: js.UndefOr[Boolean] = js.undefined
}

object AdditionalProps {
  @scala.inline
  def apply(
    disableOnClickOutside: js.UndefOr[Boolean] = js.undefined,
    eventTypes: String | js.Array[String] = null,
    excludeScrollbar: js.UndefOr[Boolean] = js.undefined,
    handleClickOutside: MouseEvent[_, NativeMouseEvent] => Unit = null,
    outsideClickIgnoreClass: String = null,
    preventDefault: js.UndefOr[Boolean] = js.undefined,
    stopPropagation: js.UndefOr[Boolean] = js.undefined
  ): AdditionalProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableOnClickOutside)) __obj.updateDynamic("disableOnClickOutside")(disableOnClickOutside.asInstanceOf[js.Any])
    if (eventTypes != null) __obj.updateDynamic("eventTypes")(eventTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeScrollbar)) __obj.updateDynamic("excludeScrollbar")(excludeScrollbar.asInstanceOf[js.Any])
    if (handleClickOutside != null) __obj.updateDynamic("handleClickOutside")(js.Any.fromFunction1(handleClickOutside))
    if (outsideClickIgnoreClass != null) __obj.updateDynamic("outsideClickIgnoreClass")(outsideClickIgnoreClass.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalProps]
  }
}

