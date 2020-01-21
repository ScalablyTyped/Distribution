package typings.primereact.orderListMod

import typings.primereact.AnonOriginalEventValue
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderListProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var dragdrop: js.UndefOr[Boolean] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
  var listStyle: js.UndefOr[js.Object] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ AnonOriginalEventValue, Unit]] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object OrderListProps {
  @scala.inline
  def apply(
    className: String = null,
    dragdrop: js.UndefOr[Boolean] = js.undefined,
    header: js.Any = null,
    id: String = null,
    itemTemplate: /* item */ js.Any => js.UndefOr[Element] = null,
    listStyle: js.Object = null,
    onChange: /* e */ AnonOriginalEventValue => Unit = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    tabIndex: String = null,
    value: js.Array[_] = null
  ): OrderListProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(dragdrop)) __obj.updateDynamic("dragdrop")(dragdrop.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderListProps]
  }
}

