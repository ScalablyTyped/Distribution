package typings.reactMove

import typings.react.mod.ComponentType
import typings.reactMove.animateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactMoveComponents extends reactMoveProps {
  @scala.inline
  def Animate: ComponentType[AnimateProps] = js.constructorOf[default].asInstanceOf[ComponentType[AnimateProps]]
  @scala.inline
  def INodeGroup: ComponentType[INodeGroupProps] = js.constructorOf[typings.reactMove.nodeGroupMod.INodeGroup].asInstanceOf[ComponentType[INodeGroupProps]]
  @scala.inline
  def NodeGroup: ComponentType[NodeGroupProps] = js.constructorOf[typings.reactMove.nodeGroupMod.default].asInstanceOf[ComponentType[NodeGroupProps]]
}

