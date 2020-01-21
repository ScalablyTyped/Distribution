package typings.reactNativeMaterialUi.mod

import typings.react.mod._Global_.JSX.Element
import typings.reactNativeMaterialUi.AnonActive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomNavigationAction extends js.Object {
  var active: Boolean
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: Element | String
  var key: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[AnonActive] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
}

object BottomNavigationAction {
  @scala.inline
  def apply(
    active: Boolean,
    icon: Element | String,
    disabled: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    label: String = null,
    onPress: () => Unit = null,
    style: AnonActive = null,
    testID: String = null
  ): BottomNavigationAction = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomNavigationAction]
  }
}

