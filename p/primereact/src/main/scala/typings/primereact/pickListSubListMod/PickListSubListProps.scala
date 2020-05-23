package typings.primereact.pickListSubListMod

import typings.primereact.anon.EventValue
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickListSubListProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
  var list: js.UndefOr[js.Array[_]] = js.undefined
  var listClassName: js.UndefOr[String] = js.undefined
  var metaKeySelection: js.UndefOr[Boolean] = js.undefined
  var onItemClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ EventValue, Unit]] = js.undefined
  var selection: js.UndefOr[js.Array[_]] = js.undefined
  var showControls: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object PickListSubListProps {
  @scala.inline
  def apply(
    className: String = null,
    header: String = null,
    itemTemplate: /* item */ js.Any => js.UndefOr[Element] = null,
    list: js.Array[_] = null,
    listClassName: String = null,
    metaKeySelection: js.UndefOr[Boolean] = js.undefined,
    onItemClick: () => Unit = null,
    onSelectionChange: /* e */ EventValue => Unit = null,
    selection: js.Array[_] = null,
    showControls: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null
  ): PickListSubListProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (listClassName != null) __obj.updateDynamic("listClassName")(listClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection.get.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction0(onItemClick))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (!js.isUndefined(showControls)) __obj.updateDynamic("showControls")(showControls.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickListSubListProps]
  }
}

