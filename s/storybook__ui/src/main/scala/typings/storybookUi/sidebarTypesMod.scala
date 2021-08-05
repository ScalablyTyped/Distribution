package typings.storybookUi

import typings.fuseJs.mod.FuseResultWithMatches
import typings.react.mod.ReactNode
import typings.std.Record
import typings.storybookUi.anon.GetItemProps
import typings.storybookUi.anon.Path
import typings.storybookUi.storybookUiStrings.name
import typings.storybookUi.storybookUiStrings.path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarTypesMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isClearType(x: js.Any): /* is @storybook/ui.@storybook/ui/dist/components/sidebar/types.ClearType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClearType")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @storybook/ui.@storybook/ui/dist/components/sidebar/types.ClearType */ Boolean]
  
  inline def isCloseType(x: js.Any): /* is @storybook/ui.@storybook/ui/dist/components/sidebar/types.CloseType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCloseType")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @storybook/ui.@storybook/ui/dist/components/sidebar/types.CloseType */ Boolean]
  
  inline def isExpandType(x: js.Any): /* is @storybook/ui.@storybook/ui/dist/components/sidebar/types.ExpandType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpandType")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @storybook/ui.@storybook/ui/dist/components/sidebar/types.ExpandType */ Boolean]
  
  inline def isSearchResult(x: js.Any): /* is @storybook/ui.@storybook/ui/dist/components/sidebar/types.SearchResult */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSearchResult")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @storybook/ui.@storybook/ui/dist/components/sidebar/types.SearchResult */ Boolean]
  
  trait ClearType
    extends StObject
       with DownshiftItem {
    
    def clearLastViewed(): Unit
  }
  object ClearType {
    
    inline def apply(clearLastViewed: () => Unit): ClearType = {
      val __obj = js.Dynamic.literal(clearLastViewed = js.Any.fromFunction0(clearLastViewed))
      __obj.asInstanceOf[ClearType]
    }
    
    extension [Self <: ClearType](x: Self) {
      
      inline def setClearLastViewed(value: () => Unit): Self = StObject.set(x, "clearLastViewed", js.Any.fromFunction0(value))
    }
  }
  
  trait CloseType
    extends StObject
       with DownshiftItem {
    
    def closeMenu(): Unit
  }
  object CloseType {
    
    inline def apply(closeMenu: () => Unit): CloseType = {
      val __obj = js.Dynamic.literal(closeMenu = js.Any.fromFunction0(closeMenu))
      __obj.asInstanceOf[CloseType]
    }
    
    extension [Self <: CloseType](x: Self) {
      
      inline def setCloseMenu(value: () => Unit): Self = StObject.set(x, "closeMenu", js.Any.fromFunction0(value))
    }
  }
  
  trait CombinedDataset extends StObject {
    
    var entries: js.Array[js.Tuple2[String, RefType]]
    
    var hash: Refs
  }
  object CombinedDataset {
    
    inline def apply(entries: js.Array[js.Tuple2[String, RefType]], hash: Refs): CombinedDataset = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[CombinedDataset]
    }
    
    extension [Self <: CombinedDataset](x: Self) {
      
      inline def setEntries(value: js.Array[js.Tuple2[String, RefType]]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesVarargs(value: (js.Tuple2[String, RefType])*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      inline def setHash(value: Refs): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  type Dataset = Record[String, Item]
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookUi.sidebarTypesMod.SearchResult
    - typings.storybookUi.sidebarTypesMod.ExpandType
    - typings.storybookUi.sidebarTypesMod.ClearType
    - typings.storybookUi.sidebarTypesMod.CloseType
  */
  trait DownshiftItem extends StObject
  object DownshiftItem {
    
    inline def ClearType(clearLastViewed: () => Unit): typings.storybookUi.sidebarTypesMod.ClearType = {
      val __obj = js.Dynamic.literal(clearLastViewed = js.Any.fromFunction0(clearLastViewed))
      __obj.asInstanceOf[typings.storybookUi.sidebarTypesMod.ClearType]
    }
    
    inline def CloseType(closeMenu: () => Unit): typings.storybookUi.sidebarTypesMod.CloseType = {
      val __obj = js.Dynamic.literal(closeMenu = js.Any.fromFunction0(closeMenu))
      __obj.asInstanceOf[typings.storybookUi.sidebarTypesMod.CloseType]
    }
    
    inline def ExpandType(moreCount: Double, showAll: () => Unit, totalCount: Double): typings.storybookUi.sidebarTypesMod.ExpandType = {
      val __obj = js.Dynamic.literal(moreCount = moreCount.asInstanceOf[js.Any], showAll = js.Any.fromFunction0(showAll), totalCount = totalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.storybookUi.sidebarTypesMod.ExpandType]
    }
    
    inline def SearchResult(item: SearchItem, matches: js.Any, score: Double): typings.storybookUi.sidebarTypesMod.SearchResult = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.storybookUi.sidebarTypesMod.SearchResult]
    }
  }
  
  trait ExpandType
    extends StObject
       with DownshiftItem {
    
    var moreCount: Double
    
    def showAll(): Unit
    
    var totalCount: Double
  }
  object ExpandType {
    
    inline def apply(moreCount: Double, showAll: () => Unit, totalCount: Double): ExpandType = {
      val __obj = js.Dynamic.literal(moreCount = moreCount.asInstanceOf[js.Any], showAll = js.Any.fromFunction0(showAll), totalCount = totalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpandType]
    }
    
    extension [Self <: ExpandType](x: Self) {
      
      inline def setMoreCount(value: Double): Self = StObject.set(x, "moreCount", value.asInstanceOf[js.Any])
      
      inline def setShowAll(value: () => Unit): Self = StObject.set(x, "showAll", js.Any.fromFunction0(value))
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    }
  }
  
  type Highlight = ItemRef | Null
  
  /* Inlined @storybook/api.@storybook/api.StoriesHash[keyof @storybook/api.@storybook/api.StoriesHash] */
  /* Rewritten from type alias, can be one of: 
    - typings.storybookUi.storybookUiStrings.kind
    - typings.storybookUi.storybookUiStrings.children
    - typings.storybookUi.storybookUiStrings.refId
    - typings.storybookUi.storybookUiStrings.isComponent
    - typings.storybookUi.storybookUiStrings.depth
    - typings.storybookUi.storybookUiStrings.parent
    - typings.storybookUi.storybookUiStrings.isLeaf
    - typings.storybookUi.storybookUiStrings.args
    - typings.storybookUi.storybookUiStrings.parameters
    - typings.storybookUi.storybookUiStrings.name
    - typings.storybookUi.storybookUiStrings.id
    - typings.storybookUi.storybookUiStrings.isRoot
  */
  trait Item extends StObject
  object Item {
    
    inline def args: typings.storybookUi.storybookUiStrings.args = "args".asInstanceOf[typings.storybookUi.storybookUiStrings.args]
    
    inline def children: typings.storybookUi.storybookUiStrings.children = "children".asInstanceOf[typings.storybookUi.storybookUiStrings.children]
    
    inline def depth: typings.storybookUi.storybookUiStrings.depth = "depth".asInstanceOf[typings.storybookUi.storybookUiStrings.depth]
    
    inline def id: typings.storybookUi.storybookUiStrings.id = "id".asInstanceOf[typings.storybookUi.storybookUiStrings.id]
    
    inline def isComponent: typings.storybookUi.storybookUiStrings.isComponent = "isComponent".asInstanceOf[typings.storybookUi.storybookUiStrings.isComponent]
    
    inline def isLeaf: typings.storybookUi.storybookUiStrings.isLeaf = "isLeaf".asInstanceOf[typings.storybookUi.storybookUiStrings.isLeaf]
    
    inline def isRoot: typings.storybookUi.storybookUiStrings.isRoot = "isRoot".asInstanceOf[typings.storybookUi.storybookUiStrings.isRoot]
    
    inline def kind: typings.storybookUi.storybookUiStrings.kind = "kind".asInstanceOf[typings.storybookUi.storybookUiStrings.kind]
    
    inline def name: typings.storybookUi.storybookUiStrings.name = "name".asInstanceOf[typings.storybookUi.storybookUiStrings.name]
    
    inline def parameters: typings.storybookUi.storybookUiStrings.parameters = "parameters".asInstanceOf[typings.storybookUi.storybookUiStrings.parameters]
    
    inline def parent: typings.storybookUi.storybookUiStrings.parent = "parent".asInstanceOf[typings.storybookUi.storybookUiStrings.parent]
    
    inline def refId: typings.storybookUi.storybookUiStrings.refId = "refId".asInstanceOf[typings.storybookUi.storybookUiStrings.refId]
  }
  
  trait ItemRef extends StObject {
    
    var itemId: String
    
    var refId: String
  }
  object ItemRef {
    
    inline def apply(itemId: String, refId: String): ItemRef = {
      val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any], refId = refId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRef]
    }
    
    extension [Self <: ItemRef](x: Self) {
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Match extends StObject {
    
    var arrayIndex: Double
    
    var indices: js.Array[js.Tuple2[Double, Double]]
    
    var key: name | path
    
    var value: String
  }
  object Match {
    
    inline def apply(arrayIndex: Double, indices: js.Array[js.Tuple2[Double, Double]], key: name | path, value: String): Match = {
      val __obj = js.Dynamic.literal(arrayIndex = arrayIndex.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match]
    }
    
    extension [Self <: Match](x: Self) {
      
      inline def setArrayIndex(value: Double): Self = StObject.set(x, "arrayIndex", value.asInstanceOf[js.Any])
      
      inline def setIndices(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setIndicesVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "indices", js.Array(value :_*))
      
      inline def setKey(value: name | path): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RefType = /* import warning: importer.ImportType#apply Failed type conversion: @storybook/ui.@storybook/ui/dist/components/sidebar/types.Refs[keyof @storybook/ui.@storybook/ui/dist/components/sidebar/types.Refs] */ js.Any
  
  /* Inlined @storybook/api.@storybook/api.State['refs'] */
  type Refs = scala.Nothing
  
  type SearchChildrenFn = js.Function1[/* args */ GetItemProps, ReactNode]
  
  type SearchItem = Item & Path
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.fuseJs.mod.FuseResultWithScore because var conflicts: item. Inlined score */ trait SearchResult
    extends StObject
       with FuseResultWithMatches[SearchItem]
       with DownshiftItem {
    
    var score: Double
  }
  object SearchResult {
    
    inline def apply(item: SearchItem, matches: js.Any, score: Double): SearchResult = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResult]
    }
    
    extension [Self <: SearchResult](x: Self) {
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  type Selection = StoryRef | Null
  
  trait StoryRef extends StObject {
    
    var refId: String
    
    var storyId: String
  }
  object StoryRef {
    
    inline def apply(refId: String, storyId: String): StoryRef = {
      val __obj = js.Dynamic.literal(refId = refId.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryRef]
    }
    
    extension [Self <: StoryRef](x: Self) {
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
    }
  }
}
