package typings
package primereactLib.componentsOrderlistOrderListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderListProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dragdrop: js.UndefOr[scala.Boolean] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var itemTemplate: js.UndefOr[
    js.Function1[/* item */ js.Any, js.UndefOr[reactLib.reactMod.Global.JSXNs.Element]]
  ] = js.undefined
  var listStyle: js.UndefOr[js.Object] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object OrderListProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    dragdrop: js.UndefOr[scala.Boolean] = js.undefined,
    header: js.Any = null,
    id: java.lang.String = null,
    itemTemplate: /* item */ js.Any => js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = null,
    listStyle: js.Object = null,
    onChange: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Object = null,
    tabIndex: java.lang.String = null,
    value: js.Array[_] = null
  ): OrderListProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(dragdrop)) __obj.updateDynamic("dragdrop")(dragdrop)
    if (header != null) __obj.updateDynamic("header")(header)
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OrderListProps]
  }
}

