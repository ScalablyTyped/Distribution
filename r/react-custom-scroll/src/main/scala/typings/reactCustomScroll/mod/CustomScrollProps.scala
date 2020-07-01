package typings.reactCustomScroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomScrollProps extends js.Object {
  var addScrolledClass: js.UndefOr[Boolean] = js.undefined
  var allowOuterScroll: js.UndefOr[Boolean] = js.undefined
  var flex: js.UndefOr[Double | String] = js.undefined
  var freezePosition: js.UndefOr[Boolean] = js.undefined
  var heightRelativeToParent: js.UndefOr[String] = js.undefined
  var keepAtBottom: js.UndefOr[Boolean] = js.undefined
  var minScrollHandleHeight: js.UndefOr[Double] = js.undefined
  var onScoll: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], _]] = js.undefined
  var rtl: js.UndefOr[Boolean] = js.undefined
  var scrollTo: js.UndefOr[Double] = js.undefined
}

object CustomScrollProps {
  @scala.inline
  def apply(
    addScrolledClass: js.UndefOr[Boolean] = js.undefined,
    allowOuterScroll: js.UndefOr[Boolean] = js.undefined,
    flex: Double | String = null,
    freezePosition: js.UndefOr[Boolean] = js.undefined,
    heightRelativeToParent: String = null,
    keepAtBottom: js.UndefOr[Boolean] = js.undefined,
    minScrollHandleHeight: js.UndefOr[Double] = js.undefined,
    onScoll: /* e */ js.UndefOr[js.Any] => _ = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    scrollTo: js.UndefOr[Double] = js.undefined
  ): CustomScrollProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addScrolledClass)) __obj.updateDynamic("addScrolledClass")(addScrolledClass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowOuterScroll)) __obj.updateDynamic("allowOuterScroll")(allowOuterScroll.get.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(freezePosition)) __obj.updateDynamic("freezePosition")(freezePosition.get.asInstanceOf[js.Any])
    if (heightRelativeToParent != null) __obj.updateDynamic("heightRelativeToParent")(heightRelativeToParent.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAtBottom)) __obj.updateDynamic("keepAtBottom")(keepAtBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minScrollHandleHeight)) __obj.updateDynamic("minScrollHandleHeight")(minScrollHandleHeight.get.asInstanceOf[js.Any])
    if (onScoll != null) __obj.updateDynamic("onScoll")(js.Any.fromFunction1(onScoll))
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollTo)) __obj.updateDynamic("scrollTo")(scrollTo.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomScrollProps]
  }
}

