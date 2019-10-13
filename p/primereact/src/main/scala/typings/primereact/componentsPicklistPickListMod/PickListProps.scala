package typings.primereact.componentsPicklistPickListMod

import typings.primereact.Anon_EventSource
import typings.primereact.Anon_OriginalEventValue
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickListProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
  var metaKeySelection: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Anon_EventSource, Unit]] = js.undefined
  var onMoveAllToSource: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValue, Unit]] = js.undefined
  var onMoveAllToTarget: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValue, Unit]] = js.undefined
  var onMoveToSource: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValue, Unit]] = js.undefined
  var onMoveToTarget: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValue, Unit]] = js.undefined
  var onSourceSelect: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValue, Unit]] = js.undefined
  var onTargetSelect: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValue, Unit]] = js.undefined
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
    onChange: /* e */ Anon_EventSource => Unit = null,
    onMoveAllToSource: /* e */ Anon_OriginalEventValue => Unit = null,
    onMoveAllToTarget: /* e */ Anon_OriginalEventValue => Unit = null,
    onMoveToSource: /* e */ Anon_OriginalEventValue => Unit = null,
    onMoveToTarget: /* e */ Anon_OriginalEventValue => Unit = null,
    onSourceSelect: /* e */ Anon_OriginalEventValue => Unit = null,
    onTargetSelect: /* e */ Anon_OriginalEventValue => Unit = null,
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
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onMoveAllToSource != null) __obj.updateDynamic("onMoveAllToSource")(js.Any.fromFunction1(onMoveAllToSource))
    if (onMoveAllToTarget != null) __obj.updateDynamic("onMoveAllToTarget")(js.Any.fromFunction1(onMoveAllToTarget))
    if (onMoveToSource != null) __obj.updateDynamic("onMoveToSource")(js.Any.fromFunction1(onMoveToSource))
    if (onMoveToTarget != null) __obj.updateDynamic("onMoveToTarget")(js.Any.fromFunction1(onMoveToTarget))
    if (onSourceSelect != null) __obj.updateDynamic("onSourceSelect")(js.Any.fromFunction1(onSourceSelect))
    if (onTargetSelect != null) __obj.updateDynamic("onTargetSelect")(js.Any.fromFunction1(onTargetSelect))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (!js.isUndefined(showSourceControls)) __obj.updateDynamic("showSourceControls")(showSourceControls)
    if (!js.isUndefined(showTargetControls)) __obj.updateDynamic("showTargetControls")(showTargetControls)
    if (source != null) __obj.updateDynamic("source")(source)
    if (sourceHeader != null) __obj.updateDynamic("sourceHeader")(sourceHeader)
    if (sourceStyle != null) __obj.updateDynamic("sourceStyle")(sourceStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex)
    if (target != null) __obj.updateDynamic("target")(target)
    if (targetHeader != null) __obj.updateDynamic("targetHeader")(targetHeader)
    if (targetStyle != null) __obj.updateDynamic("targetStyle")(targetStyle)
    __obj.asInstanceOf[PickListProps]
  }
}

