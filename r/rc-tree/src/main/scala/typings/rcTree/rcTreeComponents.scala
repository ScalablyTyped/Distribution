package typings.rcTree

import typings.rcTree.mod.default
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcTreeComponents extends rcTreeProps {
  @scala.inline
  def RcTree: ComponentType[RcTreeProps] = js.constructorOf[default].asInstanceOf[ComponentType[RcTreeProps]]
  @scala.inline
  def TreeNode: ComponentType[TreeNodeProps] = js.constructorOf[typings.rcTree.mod.TreeNode].asInstanceOf[ComponentType[TreeNodeProps]]
}

