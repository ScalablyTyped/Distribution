package typings.rcTree.mod

import typings.rcTree.AnonChecked
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeProps extends js.Object {
  /**
    * whether auto expand parent treeNodes
    */
  var autoExpandParent: js.UndefOr[Boolean] = js.undefined
  /**
    * check node precisely, parent and children nodes are not associated
    */
  var checkStrictly: js.UndefOr[Boolean] = js.undefined
  /**
    * whether support checked
    */
  var checkable: js.UndefOr[Boolean | Element] = js.undefined
  /**
    * Controlled checked treeNodes (After setting, defaultCheckedKeys will not work).
    * Note: parent and children nodes are associated, if the parent node's key exists, it all children node will be checked, and vice versa.
    * When set checkable and checkStrictly, it should be an object, which contains checked array and halfChecked array.
    */
  var checkedKeys: js.UndefOr[js.Array[String] | AnonChecked] = js.undefined
  /**
    * additional css class of root dom node
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * default checked treeNodes
    */
  var defaultCheckedKeys: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * default expand all treeNodes
    */
  var defaultExpandAll: js.UndefOr[Boolean] = js.undefined
  /**
    * auto expand parent treeNodes when init
    */
  var defaultExpandParent: js.UndefOr[Boolean] = js.undefined
  /**
    * default expand specific treeNodes
    */
  var defaultExpandedKeys: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * default selected treeNodes
    */
  var defaultSelectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * whether disabled the tree
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * whether can drag treeNode.
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * control expanding of specific treeNodes
    */
  var expandedKeys: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * filter some treeNodes as you need.
    */
  var filterTreeNode: js.UndefOr[js.Function1[/* node */ InternalTreeNode, Boolean]] = js.undefined
  /**
    * customize icon. When you pass component, whose render will receive full TreeNode props as component props
    */
  var icon: js.UndefOr[Element | (js.Function1[/* props */ InternalTreeNodeProps, Element])] = js.undefined
  /**
    * load data asynchronously
    */
  var loadData: js.UndefOr[js.Function1[/* node */ InternalTreeNode, js.Promise[_]]] = js.undefined
  /**
    * whether multiple select
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /**
    * click the treeNode/checkbox to fire
    */
  var onCheck: js.UndefOr[js.Function2[/* checkedKeys */ js.Array[String], /* e */ CheckData, Unit]] = js.undefined
  /**
    * it execs when fire the tree's dragend event
    */
  var onDragEnd: js.UndefOr[js.Function1[/* props */ OnDragEndData, Unit]] = js.undefined
  /**
    * event on drag enter
    */
  var onDragEnter: js.UndefOr[js.Function1[/* props */ OnDragEnterData, Unit]] = js.undefined
  /**
    * it execs when fire the tree's dragleave event
    */
  var onDragLeave: js.UndefOr[js.Function1[/* props */ OnDragLeaveData, Unit]] = js.undefined
  /**
    * it execs when fire the tree's dragover event
    */
  var onDragOver: js.UndefOr[js.Function1[/* props */ OnDragOverData, Unit]] = js.undefined
  /**
    * event on drag start
    */
  var onDragStart: js.UndefOr[js.Function1[/* props */ OnDragStartData, Unit]] = js.undefined
  /**
    * event on drag drop
    */
  var onDrop: js.UndefOr[js.Function1[/* props */ OnDropData, Unit]] = js.undefined
  /**
    * fire on treeNode expand or not
    */
  var onExpand: js.UndefOr[js.Function2[/* expandedKeys */ js.Array[String], /* e */ ExpandData, Unit]] = js.undefined
  /**
    * call when mouse enter a treeNode
    */
  var onMouseEnter: js.UndefOr[js.Function1[/* props */ OnMouseEnterData, Unit]] = js.undefined
  /**
    * call when mouse leave a treeNode
    */
  var onMouseLeave: js.UndefOr[js.Function1[/* props */ OnMouseLeaveData, Unit]] = js.undefined
  /**
    * select current treeNode and show customized contextmenu
    */
  var onRightClick: js.UndefOr[js.Function1[/* props */ OnRightClickData, Unit]] = js.undefined
  /**
    * click the treeNode to fire
    */
  var onSelect: js.UndefOr[js.Function2[/* selectedKeys */ js.Array[String], /* e */ SelectData, Unit]] = js.undefined
  /**
    * prefix class
    */
  var prefixCls: js.UndefOr[String] = js.undefined
  /**
    * whether can be selected
    */
  var selectable: js.UndefOr[Boolean] = js.undefined
  /**
    * Controlled selected treeNodes(After setting, defaultSelectedKeys will not work)
    */
  var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * whether show icon
    */
  var showIcon: js.UndefOr[Boolean] = js.undefined
  /**
    * whether show line
    */
  var showLine: js.UndefOr[Boolean] = js.undefined
}

object TreeProps {
  @scala.inline
  def apply(
    autoExpandParent: js.UndefOr[Boolean] = js.undefined,
    checkStrictly: js.UndefOr[Boolean] = js.undefined,
    checkable: Boolean | Element = null,
    checkedKeys: js.Array[String] | AnonChecked = null,
    className: String = null,
    defaultCheckedKeys: js.Array[String] = null,
    defaultExpandAll: js.UndefOr[Boolean] = js.undefined,
    defaultExpandParent: js.UndefOr[Boolean] = js.undefined,
    defaultExpandedKeys: js.Array[String] = null,
    defaultSelectedKeys: js.Array[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    expandedKeys: js.Array[String] = null,
    filterTreeNode: /* node */ InternalTreeNode => Boolean = null,
    icon: Element | (js.Function1[/* props */ InternalTreeNodeProps, Element]) = null,
    loadData: /* node */ InternalTreeNode => js.Promise[_] = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onCheck: (/* checkedKeys */ js.Array[String], /* e */ CheckData) => Unit = null,
    onDragEnd: /* props */ OnDragEndData => Unit = null,
    onDragEnter: /* props */ OnDragEnterData => Unit = null,
    onDragLeave: /* props */ OnDragLeaveData => Unit = null,
    onDragOver: /* props */ OnDragOverData => Unit = null,
    onDragStart: /* props */ OnDragStartData => Unit = null,
    onDrop: /* props */ OnDropData => Unit = null,
    onExpand: (/* expandedKeys */ js.Array[String], /* e */ ExpandData) => Unit = null,
    onMouseEnter: /* props */ OnMouseEnterData => Unit = null,
    onMouseLeave: /* props */ OnMouseLeaveData => Unit = null,
    onRightClick: /* props */ OnRightClickData => Unit = null,
    onSelect: (/* selectedKeys */ js.Array[String], /* e */ SelectData) => Unit = null,
    prefixCls: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectedKeys: js.Array[String] = null,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    showLine: js.UndefOr[Boolean] = js.undefined
  ): TreeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoExpandParent)) __obj.updateDynamic("autoExpandParent")(autoExpandParent.asInstanceOf[js.Any])
    if (!js.isUndefined(checkStrictly)) __obj.updateDynamic("checkStrictly")(checkStrictly.asInstanceOf[js.Any])
    if (checkable != null) __obj.updateDynamic("checkable")(checkable.asInstanceOf[js.Any])
    if (checkedKeys != null) __obj.updateDynamic("checkedKeys")(checkedKeys.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultCheckedKeys != null) __obj.updateDynamic("defaultCheckedKeys")(defaultCheckedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandAll)) __obj.updateDynamic("defaultExpandAll")(defaultExpandAll.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandParent)) __obj.updateDynamic("defaultExpandParent")(defaultExpandParent.asInstanceOf[js.Any])
    if (defaultExpandedKeys != null) __obj.updateDynamic("defaultExpandedKeys")(defaultExpandedKeys.asInstanceOf[js.Any])
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys.asInstanceOf[js.Any])
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(js.Any.fromFunction1(filterTreeNode))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1(loadData))
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onCheck != null) __obj.updateDynamic("onCheck")(js.Any.fromFunction2(onCheck))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onRightClick != null) __obj.updateDynamic("onRightClick")(js.Any.fromFunction1(onRightClick))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showLine)) __obj.updateDynamic("showLine")(showLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeProps]
  }
}

