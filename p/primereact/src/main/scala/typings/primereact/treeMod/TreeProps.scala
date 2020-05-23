package typings.primereact.treeMod

import typings.primereact.anon.NodeOriginalEvent
import typings.primereact.anon.Value
import typings.primereact.treeNodeMod.TreeNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var contentClassName: js.UndefOr[String] = js.undefined
  var contentStyle: js.UndefOr[js.Object] = js.undefined
  var contextMenuSelectionKey: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dragdropScope: js.UndefOr[String] = js.undefined
  var expandedKeys: js.UndefOr[js.Any] = js.undefined
  var filter: js.UndefOr[Boolean] = js.undefined
  var filterBy: js.UndefOr[js.Any] = js.undefined
  var filterLocale: js.UndefOr[String] = js.undefined
  var filterMode: js.UndefOr[String] = js.undefined
  var filterPlaceholder: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var loadingIcon: js.UndefOr[String] = js.undefined
  var metaKeySelection: js.UndefOr[Boolean] = js.undefined
  var nodeTemplate: js.UndefOr[js.Function1[/* node */ js.Any, Element]] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
  var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
  var onDragDrop: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
  var onExpand: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
  var onToggle: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
  var onUnselect: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
  var propagateSelectionDown: js.UndefOr[Boolean] = js.undefined
  var propagateSelectionUp: js.UndefOr[Boolean] = js.undefined
  var selectionKeys: js.UndefOr[js.Any] = js.undefined
  var selectionMode: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[js.Array[TreeNode]] = js.undefined
}

object TreeProps {
  @scala.inline
  def apply(
    className: String = null,
    contentClassName: String = null,
    contentStyle: js.Object = null,
    contextMenuSelectionKey: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dragdropScope: String = null,
    expandedKeys: js.Any = null,
    filter: js.UndefOr[Boolean] = js.undefined,
    filterBy: js.Any = null,
    filterLocale: String = null,
    filterMode: String = null,
    filterPlaceholder: String = null,
    id: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    loadingIcon: String = null,
    metaKeySelection: js.UndefOr[Boolean] = js.undefined,
    nodeTemplate: /* node */ js.Any => Element = null,
    onCollapse: /* e */ NodeOriginalEvent => Unit = null,
    onContextMenu: /* e */ NodeOriginalEvent => Unit = null,
    onContextMenuSelectionChange: /* e */ Value => Unit = null,
    onDragDrop: /* e */ Value => Unit = null,
    onExpand: /* e */ NodeOriginalEvent => Unit = null,
    onSelect: /* e */ NodeOriginalEvent => Unit = null,
    onSelectionChange: /* e */ Value => Unit = null,
    onToggle: /* e */ Value => Unit = null,
    onUnselect: /* e */ NodeOriginalEvent => Unit = null,
    propagateSelectionDown: js.UndefOr[Boolean] = js.undefined,
    propagateSelectionUp: js.UndefOr[Boolean] = js.undefined,
    selectionKeys: js.Any = null,
    selectionMode: String = null,
    style: js.Object = null,
    value: js.Array[TreeNode] = null
  ): TreeProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (contextMenuSelectionKey != null) __obj.updateDynamic("contextMenuSelectionKey")(contextMenuSelectionKey.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (dragdropScope != null) __obj.updateDynamic("dragdropScope")(dragdropScope.asInstanceOf[js.Any])
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.get.asInstanceOf[js.Any])
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy.asInstanceOf[js.Any])
    if (filterLocale != null) __obj.updateDynamic("filterLocale")(filterLocale.asInstanceOf[js.Any])
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.get.asInstanceOf[js.Any])
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection.get.asInstanceOf[js.Any])
    if (nodeTemplate != null) __obj.updateDynamic("nodeTemplate")(js.Any.fromFunction1(nodeTemplate))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onContextMenuSelectionChange != null) __obj.updateDynamic("onContextMenuSelectionChange")(js.Any.fromFunction1(onContextMenuSelectionChange))
    if (onDragDrop != null) __obj.updateDynamic("onDragDrop")(js.Any.fromFunction1(onDragDrop))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction1(onExpand))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (onUnselect != null) __obj.updateDynamic("onUnselect")(js.Any.fromFunction1(onUnselect))
    if (!js.isUndefined(propagateSelectionDown)) __obj.updateDynamic("propagateSelectionDown")(propagateSelectionDown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(propagateSelectionUp)) __obj.updateDynamic("propagateSelectionUp")(propagateSelectionUp.get.asInstanceOf[js.Any])
    if (selectionKeys != null) __obj.updateDynamic("selectionKeys")(selectionKeys.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeProps]
  }
}

