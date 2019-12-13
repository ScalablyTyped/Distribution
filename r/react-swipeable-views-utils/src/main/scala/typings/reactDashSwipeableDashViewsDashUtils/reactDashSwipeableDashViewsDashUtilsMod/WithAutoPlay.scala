package typings.reactDashSwipeableDashViewsDashUtils.reactDashSwipeableDashViewsDashUtilsMod

import typings.reactDashSwipeableDashViews.reactDashSwipeableDashViewsMod.OnChangeIndexCallback
import typings.reactDashSwipeableDashViews.reactDashSwipeableDashViewsMod.OnSwitchingCallback
import typings.reactDashSwipeableDashViews.reactDashSwipeableDashViewsMod.OnSwitchingCallbackTypeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithAutoPlay extends js.Object {
  var index: Double
  var onChangeIndex: OnChangeIndexCallback
  var onSwitching: js.UndefOr[OnSwitchingCallback] = js.undefined
}

object WithAutoPlay {
  @scala.inline
  def apply(
    index: Double,
    onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit,
    onSwitching: (/* index */ Double, /* type */ OnSwitchingCallbackTypeDescriptor) => Unit = null
  ): WithAutoPlay = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex))
    if (onSwitching != null) __obj.updateDynamic("onSwitching")(js.Any.fromFunction2(onSwitching))
    __obj.asInstanceOf[WithAutoPlay]
  }
}

