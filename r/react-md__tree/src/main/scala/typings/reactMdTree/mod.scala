package typings.reactMdTree

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactMdList.typesListMod.ListElement
import typings.reactMdTree.anon.BaseTreeItemvisibleIndexn
import typings.reactMdTree.anon.PickTreeItemWithContentCo
import typings.reactMdTree.anon.RequiredTreeItemSelection
import typings.reactMdTree.typesTreeGroupMod.TreeGroupProps
import typings.reactMdTree.typesTypesMod.BaseTreeItem
import typings.reactMdTree.typesTypesMod.ExpandedIds
import typings.reactMdTree.typesTypesMod.ProvidedTreeItemProps
import typings.reactMdTree.typesTypesMod.ProvidedTreeProps
import typings.reactMdTree.typesTypesMod.SelectedIds
import typings.reactMdTree.typesTypesMod.TreeData
import typings.reactMdTree.typesTypesMod.TreeItemExpansion
import typings.reactMdTree.typesTypesMod.TreeItemId
import typings.reactMdTree.typesTypesMod.TreeItemProps
import typings.reactMdTree.typesTypesMod.TreeProps
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
