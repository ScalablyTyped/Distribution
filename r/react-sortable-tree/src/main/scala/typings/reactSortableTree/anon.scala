package typings.reactSortableTree

import typings.react.mod.ReactNode
import typings.reactSortableTree.mod.GetTreeItemChildren
import typings.reactSortableTree.mod.GetTreeItemChildrenFn
import typings.reactSortableTree.mod.NodeData
import typings.reactSortableTree.mod.SearchData
import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.reactSortableTreeStrings.children
import typings.reactSortableTree.utilsTreeDataUtilsMod.GetNodeKeyFunction
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddAsFirstChild[T] extends StObject {
    
    var addAsFirstChild: js.UndefOr[Boolean] = js.undefined
    
    var expandParent: js.UndefOr[Boolean] = js.undefined
    
    var getNodeKey: GetNodeKeyFunction[T]
    
    var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
    
    var newNode: TreeItem[T]
    
    var parentKey: js.UndefOr[Double | String] = js.undefined
  }
  object AddAsFirstChild {
    
    inline def apply[T](getNodeKey: /* data */ TreeIndex & TreeNode[T] => String | Double, newNode: TreeItem[T]): AddAsFirstChild[T] = {
      val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), newNode = newNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddAsFirstChild[T]]
    }
    
    extension [Self <: AddAsFirstChild[?], T](x: Self & AddAsFirstChild[T]) {
      
      inline def setAddAsFirstChild(value: Boolean): Self = StObject.set(x, "addAsFirstChild", value.asInstanceOf[js.Any])
      
      inline def setAddAsFirstChildUndefined: Self = StObject.set(x, "addAsFirstChild", js.undefined)
      
      inline def setExpandParent(value: Boolean): Self = StObject.set(x, "expandParent", value.asInstanceOf[js.Any])
      
      inline def setExpandParentUndefined: Self = StObject.set(x, "expandParent", js.undefined)
      
      inline def setGetNodeKey(value: /* data */ TreeIndex & TreeNode[T] => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
      
      inline def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
      
      inline def setNewNode(value: TreeItem[T]): Self = StObject.set(x, "newNode", value.asInstanceOf[js.Any])
      
      inline def setParentKey(value: Double | String): Self = StObject.set(x, "parentKey", value.asInstanceOf[js.Any])
      
      inline def setParentKeyUndefined: Self = StObject.set(x, "parentKey", js.undefined)
    }
  }
  
  trait Children[T] extends StObject {
    
    var children: js.UndefOr[js.Array[TreeItem[T]] | GetTreeItemChildrenFn[T]] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object Children {
    
    inline def apply[T](): Children[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children[T]]
    }
    
    extension [Self <: Children[?], T](x: Self & Children[T]) {
      
      inline def setChildren(value: js.Array[TreeItem[T]] | GetTreeItemChildrenFn[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* data */ GetTreeItemChildren[T] => Unit): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: TreeItem[T]*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Depth[T] extends StObject {
    
    var depth: Double
    
    var expandParent: js.UndefOr[Boolean] = js.undefined
    
    var getNodeKey: GetNodeKeyFunction[T]
    
    var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
    
    var minimumTreeIndex: Double
    
    var newNode: TreeItem[T]
  }
  object Depth {
    
    inline def apply[T](
      depth: Double,
      getNodeKey: /* data */ TreeIndex & TreeNode[T] => String | Double,
      minimumTreeIndex: Double,
      newNode: TreeItem[T]
    ): Depth[T] = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], getNodeKey = js.Any.fromFunction1(getNodeKey), minimumTreeIndex = minimumTreeIndex.asInstanceOf[js.Any], newNode = newNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Depth[T]]
    }
    
    extension [Self <: Depth[?], T](x: Self & Depth[T]) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setExpandParent(value: Boolean): Self = StObject.set(x, "expandParent", value.asInstanceOf[js.Any])
      
      inline def setExpandParentUndefined: Self = StObject.set(x, "expandParent", js.undefined)
      
      inline def setGetNodeKey(value: /* data */ TreeIndex & TreeNode[T] => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
      
      inline def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
      
      inline def setMinimumTreeIndex(value: Double): Self = StObject.set(x, "minimumTreeIndex", value.asInstanceOf[js.Any])
      
      inline def setNewNode(value: TreeItem[T]): Self = StObject.set(x, "newNode", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExpandAllMatchPaths[T] extends StObject {
    
    var expandAllMatchPaths: js.UndefOr[Boolean] = js.undefined
    
    var expandFocusMatchPaths: js.UndefOr[Boolean] = js.undefined
    
    var getNodeKey: GetNodeKeyFunction[T]
    
    var searchFocusOffset: js.UndefOr[Double] = js.undefined
    
    def searchMethod(data: SearchData[T]): Boolean
    
    var searchQuery: js.UndefOr[String | Double] = js.undefined
  }
  object ExpandAllMatchPaths {
    
    inline def apply[T](
      getNodeKey: /* data */ TreeIndex & TreeNode[T] => String | Double,
      searchMethod: SearchData[T] => Boolean
    ): ExpandAllMatchPaths[T] = {
      val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), searchMethod = js.Any.fromFunction1(searchMethod))
      __obj.asInstanceOf[ExpandAllMatchPaths[T]]
    }
    
    extension [Self <: ExpandAllMatchPaths[?], T](x: Self & ExpandAllMatchPaths[T]) {
      
      inline def setExpandAllMatchPaths(value: Boolean): Self = StObject.set(x, "expandAllMatchPaths", value.asInstanceOf[js.Any])
      
      inline def setExpandAllMatchPathsUndefined: Self = StObject.set(x, "expandAllMatchPaths", js.undefined)
      
      inline def setExpandFocusMatchPaths(value: Boolean): Self = StObject.set(x, "expandFocusMatchPaths", value.asInstanceOf[js.Any])
      
      inline def setExpandFocusMatchPathsUndefined: Self = StObject.set(x, "expandFocusMatchPaths", js.undefined)
      
      inline def setGetNodeKey(value: /* data */ TreeIndex & TreeNode[T] => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
      
      inline def setSearchFocusOffset(value: Double): Self = StObject.set(x, "searchFocusOffset", value.asInstanceOf[js.Any])
      
      inline def setSearchFocusOffsetUndefined: Self = StObject.set(x, "searchFocusOffset", js.undefined)
      
      inline def setSearchMethod(value: SearchData[T] => Boolean): Self = StObject.set(x, "searchMethod", js.Any.fromFunction1(value))
      
      inline def setSearchQuery(value: String | Double): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
      
      inline def setSearchQueryUndefined: Self = StObject.set(x, "searchQuery", js.undefined)
    }
  }
  
  trait Expanded extends StObject {
    
    var expanded: js.UndefOr[Boolean] = js.undefined
  }
  object Expanded {
    
    inline def apply(): Expanded = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Expanded]
    }
    
    extension [Self <: Expanded](x: Self) {
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    }
  }
  
  trait FlatData[T] extends StObject {
    
    var flatData: js.Array[Omit[TreeItem[T], children]]
    
    var getKey: js.UndefOr[js.Function1[/* item */ TreeItem[T], String | Double]] = js.undefined
    
    var getParentKey: js.UndefOr[js.Function1[/* item */ TreeItem[T], String | Double | Null]] = js.undefined
    
    var rootKey: js.UndefOr[String | Double] = js.undefined
  }
  object FlatData {
    
    inline def apply[T](flatData: js.Array[Omit[TreeItem[T], children]]): FlatData[T] = {
      val __obj = js.Dynamic.literal(flatData = flatData.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlatData[T]]
    }
    
    extension [Self <: FlatData[?], T](x: Self & FlatData[T]) {
      
      inline def setFlatData(value: js.Array[Omit[TreeItem[T], children]]): Self = StObject.set(x, "flatData", value.asInstanceOf[js.Any])
      
      inline def setFlatDataVarargs(value: (Omit[TreeItem[T], children])*): Self = StObject.set(x, "flatData", js.Array(value*))
      
      inline def setGetKey(value: /* item */ TreeItem[T] => String | Double): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
      
      inline def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
      
      inline def setGetParentKey(value: /* item */ TreeItem[T] => String | Double | Null): Self = StObject.set(x, "getParentKey", js.Any.fromFunction1(value))
      
      inline def setGetParentKeyUndefined: Self = StObject.set(x, "getParentKey", js.undefined)
      
      inline def setRootKey(value: String | Double): Self = StObject.set(x, "rootKey", value.asInstanceOf[js.Any])
      
      inline def setRootKeyUndefined: Self = StObject.set(x, "rootKey", js.undefined)
    }
  }
  
  trait GetNodeKey[T] extends StObject {
    
    var getNodeKey: GetNodeKeyFunction[T]
    
    var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
    
    var newNode: js.Function | Any
  }
  object GetNodeKey {
    
    inline def apply[T](getNodeKey: /* data */ TreeIndex & TreeNode[T] => String | Double, newNode: js.Function | Any): GetNodeKey[T] = {
      val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), newNode = newNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetNodeKey[T]]
    }
    
    extension [Self <: GetNodeKey[?], T](x: Self & GetNodeKey[T]) {
      
      inline def setGetNodeKey(value: /* data */ TreeIndex & TreeNode[T] => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
      
      inline def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
      
      inline def setNewNode(value: js.Function | Any): Self = StObject.set(x, "newNode", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetNodeKeyIgnoreCollapsed[T] extends StObject {
    
    var getNodeKey: GetNodeKeyFunction[T]
    
    var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  }
  object GetNodeKeyIgnoreCollapsed {
    
    inline def apply[T](getNodeKey: /* data */ TreeIndex & TreeNode[T] => String | Double): GetNodeKeyIgnoreCollapsed[T] = {
      val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey))
      __obj.asInstanceOf[GetNodeKeyIgnoreCollapsed[T]]
    }
    
    extension [Self <: GetNodeKeyIgnoreCollapsed[?], T](x: Self & GetNodeKeyIgnoreCollapsed[T]) {
      
      inline def setGetNodeKey(value: /* data */ TreeIndex & TreeNode[T] => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
      
      inline def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
    }
  }
  
  trait IgnoreCollapsed extends StObject {
    
    var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  }
  object IgnoreCollapsed {
    
    inline def apply(): IgnoreCollapsed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IgnoreCollapsed]
    }
    
    extension [Self <: IgnoreCollapsed](x: Self) {
      
      inline def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
    }
  }
  
  trait Index[T] extends StObject {
    
    var getNodeKey: GetNodeKeyFunction[T]
    
    var index: Double
  }
  object Index {
    
    inline def apply[T](getNodeKey: /* data */ TreeIndex & TreeNode[T] => String | Double, index: Double): Index[T] = {
      val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index[T]]
    }
    
    extension [Self <: Index[?], T](x: Self & Index[T]) {
      
      inline def setGetNodeKey(value: /* data */ TreeIndex & TreeNode[T] => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait LowerSiblingsCounts extends StObject {
    
    var lowerSiblingsCounts: js.Array[Double]
  }
  object LowerSiblingsCounts {
    
    inline def apply(lowerSiblingsCounts: js.Array[Double]): LowerSiblingsCounts = {
      val __obj = js.Dynamic.literal(lowerSiblingsCounts = lowerSiblingsCounts.asInstanceOf[js.Any])
      __obj.asInstanceOf[LowerSiblingsCounts]
    }
    
    extension [Self <: LowerSiblingsCounts](x: Self) {
      
      inline def setLowerSiblingsCounts(value: js.Array[Double]): Self = StObject.set(x, "lowerSiblingsCounts", value.asInstanceOf[js.Any])
      
      inline def setLowerSiblingsCountsVarargs(value: Double*): Self = StObject.set(x, "lowerSiblingsCounts", js.Array(value*))
    }
  }
  
  trait Matches[T] extends StObject {
    
    var matches: js.Array[NodeData[T]]
  }
  object Matches {
    
    inline def apply[T](matches: js.Array[NodeData[T]]): Matches[T] = {
      val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matches[T]]
    }
    
    extension [Self <: Matches[?], T](x: Self & Matches[T]) {
      
      inline def setMatches(value: js.Array[NodeData[T]]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesVarargs(value: NodeData[T]*): Self = StObject.set(x, "matches", js.Array(value*))
    }
  }
  
  trait ParentNode[T] extends StObject {
    
    var parentNode: TreeItem[T]
  }
  object ParentNode {
    
    inline def apply[T](parentNode: TreeItem[T]): ParentNode[T] = {
      val __obj = js.Dynamic.literal(parentNode = parentNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParentNode[T]]
    }
    
    extension [Self <: ParentNode[?], T](x: Self & ParentNode[T]) {
      
      inline def setParentNode(value: TreeItem[T]): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    }
  }
}
