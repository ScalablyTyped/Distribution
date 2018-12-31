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

