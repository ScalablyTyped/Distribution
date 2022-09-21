package typings.reactMdTree

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactMdList.listMod.ListElement
import typings.reactMdTree.anon.BaseTreeItemvisibleIndexn
import typings.reactMdTree.anon.PickTreeItemWithContentCo
import typings.reactMdTree.anon.RequiredTreeItemSelection
import typings.reactMdTree.treeGroupMod.TreeGroupProps
import typings.reactMdTree.typesMod.BaseTreeItem
import typings.reactMdTree.typesMod.ExpandedIds
import typings.reactMdTree.typesMod.ProvidedTreeItemProps
import typings.reactMdTree.typesMod.ProvidedTreeProps
import typings.reactMdTree.typesMod.SelectedIds
import typings.reactMdTree.typesMod.TreeData
import typings.reactMdTree.typesMod.TreeItemExpansion
import typings.reactMdTree.typesMod.TreeItemId
import typings.reactMdTree.typesMod.TreeItemProps
import typings.reactMdTree.typesMod.TreeProps
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/tree", "Tree")
  @js.native
  val Tree: ForwardRefExoticComponent[TreeProps[Any] & RefAttributes[ListElement]] = js.native
  
  @JSImport("@react-md/tree", "TreeGroup")
  @js.native
  val TreeGroup: ForwardRefExoticComponent[TreeGroupProps & RefAttributes[ListElement]] = js.native
  
  @JSImport("@react-md/tree", "TreeItem")
  @js.native
  val TreeItem: ForwardRefExoticComponent[(TreeItemProps & RefAttributes[HTMLLIElement]) | PickTreeItemWithContentCo] = js.native
  
  inline def defaultTreeItemRenderer(itemProps: ProvidedTreeItemProps, item: BaseTreeItemvisibleIndexn, treeProps: ProvidedTreeProps): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultTreeItemRenderer")(itemProps.asInstanceOf[js.Any], item.asInstanceOf[js.Any], treeProps.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  inline def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: Null, recursive: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: TreeItemId): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: TreeItemId, recursive: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: Null, recursive: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: TreeItemId): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: TreeItemId, recursive: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def getItemsFrom[T /* <: BaseTreeItem */](data: TreeData[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemsFrom")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def getItemsFrom[T /* <: BaseTreeItem */](data: TreeData[T], itemId: TreeItemId): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemsFrom")(data.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def useTreeItemExpansion(defaultExpandedIds: js.Function0[ExpandedIds]): TreeItemExpansion = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemExpansion")(defaultExpandedIds.asInstanceOf[js.Any]).asInstanceOf[TreeItemExpansion]
  inline def useTreeItemExpansion(defaultExpandedIds: ExpandedIds): TreeItemExpansion = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemExpansion")(defaultExpandedIds.asInstanceOf[js.Any]).asInstanceOf[TreeItemExpansion]
  
  inline def useTreeItemSelection(defaultSelectedIds: js.Function0[SelectedIds]): RequiredTreeItemSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemSelection")(defaultSelectedIds.asInstanceOf[js.Any]).asInstanceOf[RequiredTreeItemSelection]
  inline def useTreeItemSelection(defaultSelectedIds: js.Function0[SelectedIds], multiSelect: Boolean): RequiredTreeItemSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemSelection")(defaultSelectedIds.asInstanceOf[js.Any], multiSelect.asInstanceOf[js.Any])).asInstanceOf[RequiredTreeItemSelection]
  inline def useTreeItemSelection(defaultSelectedIds: SelectedIds): RequiredTreeItemSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemSelection")(defaultSelectedIds.asInstanceOf[js.Any]).asInstanceOf[RequiredTreeItemSelection]
  inline def useTreeItemSelection(defaultSelectedIds: SelectedIds, multiSelect: Boolean): RequiredTreeItemSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemSelection")(defaultSelectedIds.asInstanceOf[js.Any], multiSelect.asInstanceOf[js.Any])).asInstanceOf[RequiredTreeItemSelection]
}
