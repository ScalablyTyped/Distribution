package typings
package rcDashTreeLib.rcDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TreeNodeProps extends js.Object {
  /**
       * additional css class for treeNode
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * whether treeNode's checkbox is disabled
       */
  var disableCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * whether treeNode is disabled
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * customize icon. When you pass component, whose render will receive full TreeNode props as component props
       */
  var icon: js.UndefOr[
    reactLib.reactMod.Global.JSXNs.Element | (js.Function1[/* props */ InternalTreeNodeProps, reactLib.reactMod.Global.JSXNs.Element])
  ] = js.undefined
  /**
       * whether it is a leaf node
       */
  var isLeaf: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * tree / subTree's title
       */
  var title: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
}

