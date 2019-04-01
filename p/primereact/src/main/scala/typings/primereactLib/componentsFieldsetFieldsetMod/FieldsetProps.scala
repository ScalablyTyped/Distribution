package typings
package primereactLib.componentsFieldsetFieldsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldsetProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var legend: js.UndefOr[js.Any] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onExpand: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onToggle: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Event, scala.Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var toggleable: js.UndefOr[scala.Boolean] = js.undefined
}

object FieldsetProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    legend: js.Any = null,
    onClick: /* event */ stdLib.Event => scala.Unit = null,
    onCollapse: /* event */ stdLib.Event => scala.Unit = null,
    onExpand: /* event */ stdLib.Event => scala.Unit = null,
    onToggle: /* e */ primereactLib.Anon_Event => scala.Unit = null,
    style: js.Object = null,
    toggleable: js.UndefOr[scala.Boolean] = js.undefined
  ): FieldsetProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (id != null) __obj.updateDynamic("id")(id)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction1(onExpand))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(toggleable)) __obj.updateDynamic("toggleable")(toggleable)
    __obj.asInstanceOf[FieldsetProps]
  }
}

