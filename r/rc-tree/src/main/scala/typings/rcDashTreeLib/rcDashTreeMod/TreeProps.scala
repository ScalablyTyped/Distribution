package typings
package rcDashTreeLib.rcDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeProps extends js.Object {
  /**
    * whether auto expand parent treeNodes
    */
  var autoExpandParent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * check node precisely, parent and children nodes are not associated
    */
  var checkStrictly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * whether support checked
    */
  var checkable: js.UndefOr[scala.Boolean | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
    * Controlled checked treeNodes (After setting, defaultCheckedKeys will not work).
    * Note: parent and children nodes are associated, if the parent node's key exists, it all children node will be checked, and vice versa.
    * When set checkable and checkStrictly, it should be an object, which contains checked array and halfChecked array.
    */
  var checkedKeys: js.UndefOr[js.Array[java.lang.String] | rcDashTreeLib.Anon_Checked] = js.undefined
  /**
    * additional css class of root dom node
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * default checked treeNodes
    */
  var defaultCheckedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * default expand all treeNodes
    */
  var defaultExpandAll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * auto expand parent treeNodes when init
    */
  var defaultExpandParent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * default expand specific treeNodes
    */
  var defaultExpandedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * default selected treeNodes
    */
  var defaultSelectedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * whether disabled the tree
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * whether can drag treeNode.
    */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * control expanding of specific treeNodes
    */
  var expandedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * filter some treeNodes as you need.
    */
  var filterTreeNode: js.UndefOr[js.Function1[/* node */ InternalTreeNode, scala.Boolean]] = js.undefined
  /**
    * customize icon. When you pass component, whose render will receive full TreeNode props as component props
    */
  var icon: js.UndefOr[
    reactLib.reactMod.Global.JSXNs.Element | (js.Function1[/* props */ InternalTreeNodeProps, reactLib.reactMod.Global.JSXNs.Element])
  ] = js.undefined
  /**
    * load data asynchronously
    */
  var loadData: js.UndefOr[js.Function1[/* node */ InternalTreeNode, js.Promise[_]]] = js.undefined
  /**
    * whether multiple select
    */
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * click the treeNode/checkbox to fire
    */
  var onCheck: js.UndefOr[
    js.Function2[/* checkedKeys */ js.Array[java.lang.String], /* e */ CheckData, scala.Unit]
  ] = js.undefined
  /**
    * it execs when fire the tree's dragend event
    */
  var onDragEnd: js.UndefOr[js.Function1[/* props */ OnDragEndData, scala.Unit]] = js.undefined
  /**
    * event on drag enter
    */
  var onDragEnter: js.UndefOr[js.Function1[/* props */ OnDragEnterData, scala.Unit]] = js.undefined
  /**
    * it execs when fire the tree's dragleave event
    */
  var onDragLeave: js.UndefOr[js.Function1[/* props */ OnDragLeaveData, scala.Unit]] = js.undefined
  /**
    * it execs when fire the tree's dragover event
    */
  var onDragOver: js.UndefOr[js.Function1[/* props */ OnDragOverData, scala.Unit]] = js.undefined
  /**
    * event on drag start
    */
  var onDragStart: js.UndefOr[js.Function1[/* props */ OnDragStartData, scala.Unit]] = js.undefined
  /**
    * event on drag drop
    */
  var onDrop: js.UndefOr[js.Function1[/* props */ OnDropData, scala.Unit]] = js.undefined
  /**
    * fire on treeNode expand or not
    */
  var onExpand: js.UndefOr[
    js.Function2[/* expandedKeys */ js.Array[java.lang.String], /* e */ ExpandData, scala.Unit]
  ] = js.undefined
  /**
    * call when mouse enter a treeNode
    */
  var onMouseEnter: js.UndefOr[js.Function1[/* props */ OnMouseEnterData, scala.Unit]] = js.undefined
  /**
    * call when mouse leave a treeNode
    */
  var onMouseLeave: js.UndefOr[js.Function1[/* props */ OnMouseLeaveData, scala.Unit]] = js.undefined
  /**
    * select current treeNode and show customized contextmenu
    */
  var onRightClick: js.UndefOr[js.Function1[/* props */ OnRightClickData, scala.Unit]] = js.undefined
  /**
    * click the treeNode to fire
    */
  var onSelect: js.UndefOr[
    js.Function2[/* selectedKeys */ js.Array[java.lang.String], /* e */ SelectData, scala.Unit]
  ] = js.undefined
  /**
    * prefix class
    */
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  /**
    * whether can be selected
    */
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controlled selected treeNodes(After setting, defaultSelectedKeys will not work)
    */
  var selectedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * whether show icon
    */
  var showIcon: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * whether show line
    */
  var showLine: js.UndefOr[scala.Boolean] = js.undefined
}

object TreeProps {
  @scala.inline
  def apply(
    autoExpandParent: js.UndefOr[scala.Boolean] = js.undefined,
    checkStrictly: js.UndefOr[scala.Boolean] = js.undefined,
    checkable: scala.Boolean | reactLib.reactMod.Global.JSXNs.Element = null,
    checkedKeys: js.Array[java.lang.String] | rcDashTreeLib.Anon_Checked = null,
    className: java.lang.String = null,
    defaultCheckedKeys: js.Array[java.lang.String] = null,
    defaultExpandAll: js.UndefOr[scala.Boolean] = js.undefined,
    defaultExpandParent: js.UndefOr[scala.Boolean] = js.undefined,
    defaultExpandedKeys: js.Array[java.lang.String] = null,
    defaultSelectedKeys: js.Array[java.lang.String] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    expandedKeys: js.Array[java.lang.String] = null,
    filterTreeNode: js.Function1[/* node */ InternalTreeNode, scala.Boolean] = null,
    icon: reactLib.reactMod.Global.JSXNs.Element | (js.Function1[/* props */ InternalTreeNodeProps, reactLib.reactMod.Global.JSXNs.Element]) = null,
    loadData: js.Function1[/* node */ InternalTreeNode, js.Promise[_]] = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    onCheck: js.Function2[/* checkedKeys */ js.Array[java.lang.String], /* e */ CheckData, scala.Unit] = null,
    onDragEnd: js.Function1[/* props */ OnDragEndData, scala.Unit] = null,
    onDragEnter: js.Function1[/* props */ OnDragEnterData, scala.Unit] = null,
    onDragLeave: js.Function1[/* props */ OnDragLeaveData, scala.Unit] = null,
    onDragOver: js.Function1[/* props */ OnDragOverData, scala.Unit] = null,
    onDragStart: js.Function1[/* props */ OnDragStartData, scala.Unit] = null,
    onDrop: js.Function1[/* props */ OnDropData, scala.Unit] = null,
    onExpand: js.Function2[/* expandedKeys */ js.Array[java.lang.String], /* e */ ExpandData, scala.Unit] = null,
    onMouseEnter: js.Function1[/* props */ OnMouseEnterData, scala.Unit] = null,
    onMouseLeave: js.Function1[/* props */ OnMouseLeaveData, scala.Unit] = null,
    onRightClick: js.Function1[/* props */ OnRightClickData, scala.Unit] = null,
    onSelect: js.Function2[/* selectedKeys */ js.Array[java.lang.String], /* e */ SelectData, scala.Unit] = null,
    prefixCls: java.lang.String = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    selectedKeys: js.Array[java.lang.String] = null,
    showIcon: js.UndefOr[scala.Boolean] = js.undefined,
    showLine: js.UndefOr[scala.Boolean] = js.undefined
  ): TreeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoExpandParent)) __obj.updateDynamic("autoExpandParent")(autoExpandParent)
    if (!js.isUndefined(checkStrictly)) __obj.updateDynamic("checkStrictly")(checkStrictly)
    if (checkable != null) __obj.updateDynamic("checkable")(checkable.asInstanceOf[js.Any])
    if (checkedKeys != null) __obj.updateDynamic("checkedKeys")(checkedKeys.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultCheckedKeys != null) __obj.updateDynamic("defaultCheckedKeys")(defaultCheckedKeys)
    if (!js.isUndefined(defaultExpandAll)) __obj.updateDynamic("defaultExpandAll")(defaultExpandAll)
    if (!js.isUndefined(defaultExpandParent)) __obj.updateDynamic("defaultExpandParent")(defaultExpandParent)
    if (defaultExpandedKeys != null) __obj.updateDynamic("defaultExpandedKeys")(defaultExpandedKeys)
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys)
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(filterTreeNode)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(loadData)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onCheck != null) __obj.updateDynamic("onCheck")(onCheck)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onExpand != null) __obj.updateDynamic("onExpand")(onExpand)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onRightClick != null) __obj.updateDynamic("onRightClick")(onRightClick)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys)
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon)
    if (!js.isUndefined(showLine)) __obj.updateDynamic("showLine")(showLine)
    __obj.asInstanceOf[TreeProps]
  }
}

