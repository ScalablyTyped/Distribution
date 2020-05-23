package typings.primereact.pickListMod

import typings.primereact.anon.Source
import typings.primereact.anon.Value
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickListProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
  var metaKeySelection: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Source, Unit]] = js.undefined
  var onMoveAllToSource: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
  var onMoveAllToTarget: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
  var onMoveToSource: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
  var onMoveToTarget: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
  var onSourceSelect: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
  var onTargetSelect: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var showSourceControls: js.UndefOr[Boolean] = js.undefined
  var showTargetControls: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[js.Array[_]] = js.undefined
  var sourceHeader: js.UndefOr[js.Any] = js.undefined
  var sourceStyle: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[js.Array[_]] = js.undefined
  var targetHeader: js.UndefOr[js.Any] = js.undefined
  var targetStyle: js.UndefOr[js.Object] = js.undefined
}

object PickListProps {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    itemTemplate: /* item */ js.Any => js.UndefOr[Element] = null,
    metaKeySelection: js.UndefOr[Boolean] = js.undefined,
    onChange: /* e */ Source => Unit = null,
    onMoveAllToSource: /* e */ Value => Unit = null,
    onMoveAllToTarget: /* e */ Value => Unit = null,
    onMoveToSource: /* e */ Value => Unit = null,
    onMoveToTarget: /* e */ Value => Unit = null,
    onSourceSelect: /* e */ Value => Unit = null,
    onTargetSelect: /* e */ Value => Unit = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    showSourceControls: js.UndefOr[Boolean] = js.undefined,
    showTargetControls: js.UndefOr[Boolean] = js.undefined,
    source: js.Array[_] = null,
    sourceHeader: js.Any = null,
    sourceStyle: js.Object = null,
    style: js.Object = null,
    tabIndex: String = null,
    target: js.Array[_] = null,
    targetHeader: js.Any = null,
    targetStyle: js.Object = null
  ): PickListProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onMoveAllToSource != null) __obj.updateDynamic("onMoveAllToSource")(js.Any.fromFunction1(onMoveAllToSource))
    if (onMoveAllToTarget != null) __obj.updateDynamic("onMoveAllToTarget")(js.Any.fromFunction1(onMoveAllToTarget))
    if (onMoveToSource != null) __obj.updateDynamic("onMoveToSource")(js.Any.fromFunction1(onMoveToSource))
    if (onMoveToTarget != null) __obj.updateDynamic("onMoveToTarget")(js.Any.fromFunction1(onMoveToTarget))
    if (onSourceSelect != null) __obj.updateDynamic("onSourceSelect")(js.Any.fromFunction1(onSourceSelect))
    if (onTargetSelect != null) __obj.updateDynamic("onTargetSelect")(js.Any.fromFunction1(onTargetSelect))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSourceControls)) __obj.updateDynamic("showSourceControls")(showSourceControls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTargetControls)) __obj.updateDynamic("showTargetControls")(showTargetControls.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceHeader != null) __obj.updateDynamic("sourceHeader")(sourceHeader.asInstanceOf[js.Any])
    if (sourceStyle != null) __obj.updateDynamic("sourceStyle")(sourceStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetHeader != null) __obj.updateDynamic("targetHeader")(targetHeader.asInstanceOf[js.Any])
    if (targetStyle != null) __obj.updateDynamic("targetStyle")(targetStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickListProps]
  }
}

