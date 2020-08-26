package typings.reactMdTree

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactMdList.listMod.ListElement
import typings.reactMdTree.anon.BaseTreeItemvisibleIndexn
import typings.reactMdTree.anon.PickTreeGroupPropshiddenc
import typings.reactMdTree.anon.RequiredTreeItemSelection
import typings.reactMdTree.typesMod.BaseTreeItem
import typings.reactMdTree.typesMod.ExpandedIds
import typings.reactMdTree.typesMod.ProvidedTreeItemProps
import typings.reactMdTree.typesMod.ProvidedTreeProps
import typings.reactMdTree.typesMod.SelectedIds
import typings.reactMdTree.typesMod.TreeData
import typings.reactMdTree.typesMod.TreeItemExpansion
import typings.reactMdTree.typesMod.TreeItemId
import typings.reactMdTree.typesMod.TreeItemProps
import typings.reactMdTree.typesMod.TreeItemWithContentComponentProps
import typings.reactMdTree.typesMod.TreeProps
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/tree", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Creates an accessible tree widget that allows you to show hierarchical data
    * in a list presentation view. This component requires the selection and
    * expansion state to be provided/controlled but you can use the
    * `useTreeItemSelection` and `useTreeItemExpansion` hooks for a great starting
    * point for this functionality.
    */
  val Tree: ForwardRefExoticComponent[TreeProps[_] with RefAttributes[ListElement]] = js.native
  /**
    * The `TreeGroup` component is used to render a tree item's nested items
    * whenever the `expanded` prop is `true`. It uses the `Collapse` component
    * behind the scenes to animate in-and-out of view and will fully unrender when
    * the `expanded` prop is `false`.
    */
  val TreeGroup: ForwardRefExoticComponent[PickTreeGroupPropshiddenc] = js.native
  /**
    * This component renders an item within a tree with optional child items. This
    * should almost always be used from the `itemRenderer` prop from the `Tree`
    * component as it provides a lot of the required a11y props for you.
    */
  val TreeItem: ForwardRefExoticComponent[
    (TreeItemProps with RefAttributes[HTMLLIElement]) | (TreeItemWithContentComponentProps with RefAttributes[HTMLLIElement])
  ] = js.native
  def defaultTreeItemRenderer(itemProps: ProvidedTreeItemProps, item: BaseTreeItemvisibleIndexn, treeProps: ProvidedTreeProps): ReactElement = js.native
  def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T]): js.Array[T] = js.native
  def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: Null, recursive: Boolean): js.Array[T] = js.native
  def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: TreeItemId): js.Array[T] = js.native
  def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: TreeItemId, recursive: Boolean): js.Array[T] = js.native
  def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T]): js.Array[T] = js.native
  def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: Null, recursive: Boolean): js.Array[T] = js.native
  def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: TreeItemId): js.Array[T] = js.native
  def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: TreeItemId, recursive: Boolean): js.Array[T] = js.native
  def getItemsFrom[T /* <: BaseTreeItem */](data: TreeData[T]): js.Array[T] = js.native
  def getItemsFrom[T /* <: BaseTreeItem */](data: TreeData[T], itemId: TreeItemId): js.Array[T] = js.native
  def useTreeItemExpansion(defaultExpandedIds: js.Function0[ExpandedIds]): TreeItemExpansion = js.native
  def useTreeItemExpansion(defaultExpandedIds: ExpandedIds): TreeItemExpansion = js.native
  def useTreeItemSelection(defaultSelectedIds: js.Function0[SelectedIds]): RequiredTreeItemSelection = js.native
  def useTreeItemSelection(defaultSelectedIds: js.Function0[SelectedIds], multiSelect: Boolean): RequiredTreeItemSelection = js.native
  def useTreeItemSelection(defaultSelectedIds: SelectedIds): RequiredTreeItemSelection = js.native
  def useTreeItemSelection(defaultSelectedIds: SelectedIds, multiSelect: Boolean): RequiredTreeItemSelection = js.native
}

