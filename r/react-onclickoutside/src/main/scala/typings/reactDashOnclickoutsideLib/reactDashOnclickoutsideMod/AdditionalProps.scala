package typings
package reactDashOnclickoutsideLib.reactDashOnclickoutsideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalProps extends ConfigObject {
  var disableOnClickOutside: js.UndefOr[scala.Boolean] = js.undefined
  var eventTypes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var outsideClickIgnoreClass: js.UndefOr[java.lang.String] = js.undefined
  var preventDefault: js.UndefOr[scala.Boolean] = js.undefined
  var stopPropagation: js.UndefOr[scala.Boolean] = js.undefined
}

object AdditionalProps {
  @scala.inline
  def apply(
    disableOnClickOutside: js.UndefOr[scala.Boolean] = js.undefined,
    eventTypes: java.lang.String | js.Array[java.lang.String] = null,
    excludeScrollbar: js.UndefOr[scala.Boolean] = js.undefined,
    handleClickOutside: reactLib.reactMod.MouseEventHandler[_] = null,
    outsideClickIgnoreClass: java.lang.String = null,
    preventDefault: js.UndefOr[scala.Boolean] = js.undefined,
    stopPropagation: js.UndefOr[scala.Boolean] = js.undefined
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

