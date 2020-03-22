package typings.rcTreeSelect

import typings.rcTreeSelect.interfaceMod.DataNode
import typings.rcTreeSelect.optionListMod.OptionListProps
import typings.react.mod.ComponentType
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcTreeSelectComponents extends rcTreeSelectProps {
  @scala.inline
  def Lib[ValueType]: ComponentType[LibProps[ValueType]] = js.constructorOf[typings.rcTreeSelect.mod.default[ValueType]].asInstanceOf[typings.react.mod.ComponentType[LibProps[ValueType]]]
  @scala.inline
  def LibTreeNode: ComponentType[LibTreeNodeProps] = typings.rcTreeSelect.mod.default.TreeNode.asInstanceOf[typings.react.mod.ComponentType[LibTreeNodeProps]]
  @scala.inline
  def OptionList: ComponentType[OptionListProps[js.Array[DataNode]] with RefAttributes[js.Any]] = typings.rcTreeSelect.optionListMod.default.asInstanceOf[typings.react.mod.ComponentType[
  typings.rcTreeSelect.optionListMod.OptionListProps[js.Array[typings.rcTreeSelect.interfaceMod.DataNode]] with typings.react.mod.RefAttributes[js.Any]]]
  @scala.inline
  def TreeNode: ComponentType[TreeNodeProps] = typings.rcTreeSelect.treeNodeMod.default.asInstanceOf[typings.react.mod.ComponentType[TreeNodeProps]]
  @scala.inline
  def TreeSelect[ValueType]: ComponentType[TreeSelectProps[ValueType]] = js.constructorOf[typings.rcTreeSelect.treeSelectMod.default[ValueType]].asInstanceOf[typings.react.mod.ComponentType[TreeSelectProps[ValueType]]]
  @scala.inline
  def TreeSelectTreeNode: ComponentType[TreeSelectTreeNodeProps] = typings.rcTreeSelect.treeSelectMod.default.TreeNode.asInstanceOf[typings.react.mod.ComponentType[TreeSelectTreeNodeProps]]
}

