package typings.reactMdTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ExpandedIds = js.Array[typings.reactMdTree.typesMod.TreeItemId]
  
  type GetItemProps[T /* <: typings.reactMdTree.typesMod.TreeItemIds */] = js.Function1[
    /* item */ T with typings.reactMdTree.typesMod.TreeItemStates, 
    js.UndefOr[typings.reactMdTree.typesMod.ConfigurableTreeItemProps]
  ]
  
  type SelectedIds = js.Array[typings.reactMdTree.typesMod.TreeItemId]
  
  type TreeData[T /* <: typings.reactMdTree.typesMod.BaseTreeItem */] = typings.std.Record[typings.reactMdTree.typesMod.TreeItemId, T]
  
  type TreeItemId = java.lang.String
  
  type TreeItemRenderer[T /* <: typings.reactMdTree.typesMod.BaseTreeItem */] = js.Function3[
    /* providedProps */ typings.reactMdTree.typesMod.ProvidedTreeItemProps, 
    /* item */ T with typings.reactMdTree.anon.VisibleIndex, 
    /* treeProps */ typings.reactMdTree.typesMod.ProvidedTreeProps, 
    typings.react.mod.ReactElement | scala.Null
  ]
  
  type TreeItemSorter[T /* <: typings.reactMdTree.typesMod.BaseTreeItem */] = js.Function1[/* items */ js.Array[T], js.Array[T]]
}
