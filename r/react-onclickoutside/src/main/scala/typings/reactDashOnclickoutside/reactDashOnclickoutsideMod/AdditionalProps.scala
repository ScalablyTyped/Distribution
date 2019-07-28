package typings.reactDashOnclickoutside.reactDashOnclickoutsideMod

import typings.react.reactMod.MouseEventHandler
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
    handleClickOutside: MouseEventHandler[_] = null,
    outsideClickIgnoreClass: String = null,
    preventDefault: js.UndefOr[Boolean] = js.undefined,
    stopPropagation: js.UndefOr[Boolean] = js.undefined
  ): AdditionalProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableOnClickOutside)) __obj.updateDynamic("disableOnClickOutside")(disableOnClickOutside)
    if (eventTypes != null) __obj.updateDynamic("eventTypes")(eventTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeScrollbar)) __obj.updateDynamic("excludeScrollbar")(excludeScrollbar)
    if (handleClickOutside != null) __obj.updateDynamic("handleClickOutside")(handleClickOutside)
    if (outsideClickIgnoreClass != null) __obj.updateDynamic("outsideClickIgnoreClass")(outsideClickIgnoreClass)
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault)
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.asInstanceOf[AdditionalProps]
  }
}

