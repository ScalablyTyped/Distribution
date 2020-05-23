package typings.storybookReactNative.navigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var initialUiVisible: js.UndefOr[Boolean] = js.undefined
  var tabOpen: Double
  def onChangeTab(index: Double): Unit
}

object Props {
  @scala.inline
  def apply(onChangeTab: Double => Unit, tabOpen: Double, initialUiVisible: js.UndefOr[Boolean] = js.undefined): Props = {
    val __obj = js.Dynamic.literal(onChangeTab = js.Any.fromFunction1(onChangeTab), tabOpen = tabOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(initialUiVisible)) __obj.updateDynamic("initialUiVisible")(initialUiVisible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

