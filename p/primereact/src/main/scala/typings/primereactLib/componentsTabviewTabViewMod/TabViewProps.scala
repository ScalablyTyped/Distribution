package typings
package primereactLib.componentsTabviewTabViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabViewProps extends js.Object {
  var activeIndex: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var onTabChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Index, scala.Unit]] = js.undefined
  var renderActiveOnly: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
}

object TabViewProps {
  @scala.inline
  def apply(
    activeIndex: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    id: java.lang.String = null,
    onTabChange: /* e */ primereactLib.Anon_Index => scala.Unit = null,
    renderActiveOnly: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Any = null
  ): TabViewProps = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1(onTabChange))
    if (!js.isUndefined(renderActiveOnly)) __obj.updateDynamic("renderActiveOnly")(renderActiveOnly)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TabViewProps]
  }
}

