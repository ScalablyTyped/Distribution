package typings.primereact.componentsPanelPanelMod

import typings.primereact.Anon_Event
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var collapseIcon: js.UndefOr[String] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var expandIcon: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onExpand: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onToggle: js.UndefOr[js.Function1[/* e */ Anon_Event, Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var toggleable: js.UndefOr[Boolean] = js.undefined
}

object PanelProps {
  @scala.inline
  def apply(
    className: String = null,
    collapseIcon: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    expandIcon: String = null,
    header: js.Any = null,
    id: String = null,
    onCollapse: /* event */ Event => Unit = null,
    onExpand: /* event */ Event => Unit = null,
    onToggle: /* e */ Anon_Event => Unit = null,
    style: js.Object = null,
    toggleable: js.UndefOr[Boolean] = js.undefined
  ): PanelProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (collapseIcon != null) __obj.updateDynamic("collapseIcon")(collapseIcon)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon)
    if (header != null) __obj.updateDynamic("header")(header)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction1(onExpand))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(toggleable)) __obj.updateDynamic("toggleable")(toggleable)
    __obj.asInstanceOf[PanelProps]
  }
}

