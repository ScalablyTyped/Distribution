package typings.storybookUi

import typings.fuseJs.mod.FuseResultWithMatches
import typings.fuseJs.mod.FuseResultWithScore
import typings.react.mod.ReactNode
import typings.std.Record
import typings.storybookUi.anon.GetItemProps
import typings.storybookUi.anon.Path
import typings.storybookUi.storybookUiStrings.name
import typings.storybookUi.storybookUiStrings.path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarTypesMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/types", "isClearType")
  @js.native
  def isClearType(x: js.Any): /* is @storybook/ui.@storybook/ui/dist/components/sidebar/types.ClearType */ Boolean = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/types", "isCloseType")
  @js.native
  def isCloseType(x: js.Any): /* is @storybook/ui.@storybook/ui/dist/components/sidebar/types.CloseType */ Boolean = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/types", "isExpandType")
  @js.native
  def isExpandType(x: js.Any): /* is @storybook/ui.@storybook/ui/dist/components/sidebar/types.ExpandType */ Boolean = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/types", "isSearchResult")
  @js.native
  def isSearchResult(x: js.Any): /* is @storybook/ui.@storybook/ui/dist/components/sidebar/types.SearchResult */ Boolean = js.native
  
  @js.native
  trait ClearType extends _DownshiftItem {
    
    def clearLastViewed(): Unit = js.native
  }
  object ClearType {
    
    @scala.inline
    def apply(clearLastViewed: () => Unit): ClearType = {
      val __obj = js.Dynamic.literal(clearLastViewed = js.Any.fromFunction0(clearLastViewed))
      __obj.asInstanceOf[ClearType]
    }
    
    @scala.inline
    implicit class ClearTypeMutableBuilder[Self <: ClearType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearLastViewed(value: () => Unit): Self = StObject.set(x, "clearLastViewed", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CloseType extends _DownshiftItem {
    
    def closeMenu(): Unit = js.native
  }
  object CloseType {
    
    @scala.inline
    def apply(closeMenu: () => Unit): CloseType = {
      val __obj = js.Dynamic.literal(closeMenu = js.Any.fromFunction0(closeMenu))
      __obj.asInstanceOf[CloseType]
    }
    
    @scala.inline
    implicit class CloseTypeMutableBuilder[Self <: CloseType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseMenu(value: () => Unit): Self = StObject.set(x, "closeMenu", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CombinedDataset extends StObject {
    
    var entries: js.Array[js.Tuple2[String, RefType]] = js.native
    
    var hash: Refs = js.native
  }
  object CombinedDataset {
    
    @scala.inline
    def apply(entries: js.Array[js.Tuple2[String, RefType]], hash: Refs): CombinedDataset = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[CombinedDataset]
    }
    
    @scala.inline
    implicit class CombinedDatasetMutableBuilder[Self <: CombinedDataset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntries(value: js.Array[js.Tuple2[String, RefType]]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesVarargs(value: (js.Tuple2[String, RefType])*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      @scala.inline
      def setHash(value: Refs): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  type Dataset = Record[String, Item]
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookUi.sidebarTypesMod.SearchResult
    - typings.storybookUi.sidebarTypesMod.ExpandType
    - typings.storybookUi.sidebarTypesMod.ClearType
    - typings.storybookUi.sidebarTypesMod.CloseType
  */
  type DownshiftItem = _DownshiftItem | SearchResult
  
  @js.native
  trait ExpandType extends _DownshiftItem {
    
    var moreCount: Double = js.native
    
    def showAll(): Unit = js.native
    
    var totalCount: Double = js.native
  }
  object ExpandType {
    
    @scala.inline
    def apply(moreCount: Double, showAll: () => Unit, totalCount: Double): ExpandType = {
      val __obj = js.Dynamic.literal(moreCount = moreCount.asInstanceOf[js.Any], showAll = js.Any.fromFunction0(showAll), totalCount = totalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpandType]
    }
    
    @scala.inline
    implicit class ExpandTypeMutableBuilder[Self <: ExpandType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMoreCount(value: Double): Self = StObject.set(x, "moreCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAll(value: () => Unit): Self = StObject.set(x, "showAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def args: typings.storybookUi.storybookUiStrings.args = "args".asInstanceOf[typings.storybookUi.storybookUiStrings.args]
    
    @scala.inline
    def children: typings.storybookUi.storybookUiStrings.children = "children".asInstanceOf[typings.storybookUi.storybookUiStrings.children]
    
    @scala.inline
    def depth: typings.storybookUi.storybookUiStrings.depth = "depth".asInstanceOf[typings.storybookUi.storybookUiStrings.depth]
    
    @scala.inline
    def id: typings.storybookUi.storybookUiStrings.id = "id".asInstanceOf[typings.storybookUi.storybookUiStrings.id]
    
    @scala.inline
    def isComponent: typings.storybookUi.storybookUiStrings.isComponent = "isComponent".asInstanceOf[typings.storybookUi.storybookUiStrings.isComponent]
    
    @scala.inline
    def isLeaf: typings.storybookUi.storybookUiStrings.isLeaf = "isLeaf".asInstanceOf[typings.storybookUi.storybookUiStrings.isLeaf]
    
    @scala.inline
    def isRoot: typings.storybookUi.storybookUiStrings.isRoot = "isRoot".asInstanceOf[typings.storybookUi.storybookUiStrings.isRoot]
    
    @scala.inline
    def kind: typings.storybookUi.storybookUiStrings.kind = "kind".asInstanceOf[typings.storybookUi.storybookUiStrings.kind]
    
    @scala.inline
    def name: typings.storybookUi.storybookUiStrings.name = "name".asInstanceOf[typings.storybookUi.storybookUiStrings.name]
    
    @scala.inline
    def parameters: typings.storybookUi.storybookUiStrings.parameters = "parameters".asInstanceOf[typings.storybookUi.storybookUiStrings.parameters]
    
    @scala.inline
    def parent: typings.storybookUi.storybookUiStrings.parent = "parent".asInstanceOf[typings.storybookUi.storybookUiStrings.parent]
    
    @scala.inline
    def refId: typings.storybookUi.storybookUiStrings.refId = "refId".asInstanceOf[typings.storybookUi.storybookUiStrings.refId]
  }
  
  @js.native
  trait ItemRef extends StObject {
    
    var itemId: String = js.native
    
    var refId: String = js.native
  }
  object ItemRef {
    
    @scala.inline
    def apply(itemId: String, refId: String): ItemRef = {
      val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any], refId = refId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRef]
    }
    
    @scala.inline
    implicit class ItemRefMutableBuilder[Self <: ItemRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Match extends StObject {
    
    var arrayIndex: Double = js.native
    
    var indices: js.Array[js.Tuple2[Double, Double]] = js.native
    
    var key: name | path = js.native
    
    var value: String = js.native
  }
  object Match {
    
    @scala.inline
    def apply(arrayIndex: Double, indices: js.Array[js.Tuple2[Double, Double]], key: name | path, value: String): Match = {
      val __obj = js.Dynamic.literal(arrayIndex = arrayIndex.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match]
    }
    
    @scala.inline
    implicit class MatchMutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayIndex(value: Double): Self = StObject.set(x, "arrayIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndices(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicesVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "indices", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: name | path): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RefType = /* import warning: importer.ImportType#apply Failed type conversion: @storybook/ui.@storybook/ui/dist/components/sidebar/types.Refs[keyof @storybook/ui.@storybook/ui/dist/components/sidebar/types.Refs] */ js.Any
  
  type Refs = /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['refs'] */ js.Any
  
  type SearchChildrenFn = js.Function1[/* args */ GetItemProps, ReactNode]
  
  type SearchItem = Item with Path
  
  type SearchResult = FuseResultWithMatches[SearchItem] with FuseResultWithScore[SearchItem]
  
  type Selection = StoryRef | Null
  
  @js.native
  trait StoryRef extends StObject {
    
    var refId: String = js.native
    
    var storyId: String = js.native
  }
  object StoryRef {
    
    @scala.inline
    def apply(refId: String, storyId: String): StoryRef = {
      val __obj = js.Dynamic.literal(refId = refId.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryRef]
    }
    
    @scala.inline
    implicit class StoryRefMutableBuilder[Self <: StoryRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
    }
  }
  
  trait _DownshiftItem extends StObject
  object _DownshiftItem {
    
    @scala.inline
    def ClearType(clearLastViewed: () => Unit): typings.storybookUi.sidebarTypesMod.ClearType = {
      val __obj = js.Dynamic.literal(clearLastViewed = js.Any.fromFunction0(clearLastViewed))
      __obj.asInstanceOf[typings.storybookUi.sidebarTypesMod.ClearType]
    }
    
    @scala.inline
    def CloseType(closeMenu: () => Unit): typings.storybookUi.sidebarTypesMod.CloseType = {
      val __obj = js.Dynamic.literal(closeMenu = js.Any.fromFunction0(closeMenu))
      __obj.asInstanceOf[typings.storybookUi.sidebarTypesMod.CloseType]
    }
    
    @scala.inline
    def ExpandType(moreCount: Double, showAll: () => Unit, totalCount: Double): typings.storybookUi.sidebarTypesMod.ExpandType = {
      val __obj = js.Dynamic.literal(moreCount = moreCount.asInstanceOf[js.Any], showAll = js.Any.fromFunction0(showAll), totalCount = totalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.storybookUi.sidebarTypesMod.ExpandType]
    }
  }
}
