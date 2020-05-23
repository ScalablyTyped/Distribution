package typings.primereact.tabViewMod

import typings.primereact.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabViewProps extends js.Object {
  var activeIndex: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onTabChange: js.UndefOr[js.Function1[/* e */ Index, Unit]] = js.undefined
  var renderActiveOnly: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
}

object TabViewProps {
  @scala.inline
  def apply(
    activeIndex: js.UndefOr[Double] = js.undefined,
    className: String = null,
    id: String = null,
    onTabChange: /* e */ Index => Unit = null,
    renderActiveOnly: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null
  ): TabViewProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeIndex)) __obj.updateDynamic("activeIndex")(activeIndex.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1(onTabChange))
    if (!js.isUndefined(renderActiveOnly)) __obj.updateDynamic("renderActiveOnly")(renderActiveOnly.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabViewProps]
  }
}

