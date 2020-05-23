package typings.rmcTabs.tabPaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var active: Boolean
  var className: js.UndefOr[String] = js.undefined
  var fixX: js.UndefOr[Boolean] = js.undefined
  var fixY: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    active: Boolean,
    className: String = null,
    fixX: js.UndefOr[Boolean] = js.undefined,
    fixY: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    role: String = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(fixX)) __obj.updateDynamic("fixX")(fixX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixY)) __obj.updateDynamic("fixY")(fixY.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

