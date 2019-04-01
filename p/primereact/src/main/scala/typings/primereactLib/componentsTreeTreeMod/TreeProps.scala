package typings
package primereactLib.componentsTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var contextMenuSelectionKey: js.UndefOr[js.Any] = js.undefined
  var dragdropScope: js.UndefOr[java.lang.String] = js.undefined
  var expandedKeys: js.UndefOr[js.Any] = js.undefined
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  var filterBy: js.UndefOr[js.Any] = js.undefined
  var filterMode: js.UndefOr[java.lang.String] = js.undefined
  var filterPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  var loadingIcon: js.UndefOr[java.lang.String] = js.undefined
  var metaKeySelection: js.UndefOr[scala.Boolean] = js.undefined
  var nodeTemplate: js.UndefOr[js.Function1[/* node */ js.Any, reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_NodeOriginalEvent, scala.Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_NodeOriginalEvent, scala.Unit]] = js.undefined
  var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var onDragDrop: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var onExpand: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_NodeOriginalEvent, scala.Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_NodeOriginalEvent, scala.Unit]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var onToggle: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var onUnselect: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_NodeOriginalEvent, scala.Unit]] = js.undefined
  var propagateSelectionDown: js.UndefOr[scala.Boolean] = js.undefined
  var propagateSelectionUp: js.UndefOr[scala.Boolean] = js.undefined
  var selectionKeys: js.UndefOr[js.Any] = js.undefined
  var selectionMode: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[js.Array[primereactLib.componentsTreenodeTreeNodeMod.TreeNode]] = js.undefined
}

object TreeProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    contextMenuSelectionKey: js.Any = null,
    dragdropScope: java.lang.String = null,
    expandedKeys: js.Any = null,
    filter: js.UndefOr[scala.Boolean] = js.undefined,
    filterBy: js.Any = null,
    filterMode: java.lang.String = null,
    filterPlaceholder: java.lang.String = null,
    id: java.lang.String = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    loadingIcon: java.lang.String = null,
    metaKeySelection: js.UndefOr[scala.Boolean] = js.undefined,
    nodeTemplate: /* node */ js.Any => reactLib.reactMod.Global.JSXNs.Element = null,
    onCollapse: /* e */ primereactLib.Anon_NodeOriginalEvent => scala.Unit = null,
    onContextMenu: /* e */ primereactLib.Anon_NodeOriginalEvent => scala.Unit = null,
    onContextMenuSelectionChange: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    onDragDrop: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    onExpand: /* e */ primereactLib.Anon_NodeOriginalEvent => scala.Unit = null,
    onSelect: /* e */ primereactLib.Anon_NodeOriginalEvent => scala.Unit = null,
    onSelectionChange: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    onToggle: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    onUnselect: /* e */ primereactLib.Anon_NodeOriginalEvent => scala.Unit = null,
    propagateSelectionDown: js.UndefOr[scala.Boolean] = js.undefined,
    propagateSelectionUp: js.UndefOr[scala.Boolean] = js.undefined,
    selectionKeys: js.Any = null,
    selectionMode: java.lang.String = null,
    style: js.Object = null,
    value: js.Array[primereactLib.componentsTreenodeTreeNodeMod.TreeNode] = null
  ): TreeProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (contextMenuSelectionKey != null) __obj.updateDynamic("contextMenuSelectionKey")(contextMenuSelectionKey)
    if (dragdropScope != null) __obj.updateDynamic("dragdropScope")(dragdropScope)
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys)
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy)
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode)
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon)
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection)
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
    if (!js.isUndefined(propagateSelectionDown)) __obj.updateDynamic("propagateSelectionDown")(propagateSelectionDown)
    if (!js.isUndefined(propagateSelectionUp)) __obj.updateDynamic("propagateSelectionUp")(propagateSelectionUp)
    if (selectionKeys != null) __obj.updateDynamic("selectionKeys")(selectionKeys)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TreeProps]
  }
}

