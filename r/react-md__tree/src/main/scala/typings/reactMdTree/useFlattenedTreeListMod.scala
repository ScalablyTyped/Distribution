package typings.reactMdTree

import typings.react.mod.MutableRefObject
import typings.reactMdTree.anon.NestedTreeItemUnknownTree
import typings.reactMdTree.typesMod.ExpandedIds
import typings.reactMdTree.typesMod.TreeItemId
import typings.reactMdTree.typesMod.UnknownTreeItem
import typings.std.HTMLLIElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFlattenedTreeListMod {
  
  @JSImport("@react-md/tree/types/useFlattenedTreeList", "useFlattenedTreeList")
  @js.native
  def useFlattenedTreeList(hasIdItemsRootIdExpandedIdsValueKeyGetItemValue: Options): ReturnValue = js.native
  
  @js.native
  trait ItemMetadata extends StObject {
    
    var id: String = js.native
    
    var ref: TreeItemRef = js.native
    
    var visibleIndex: Double = js.native
  }
  object ItemMetadata {
    
    @scala.inline
    def apply(id: String, ref: TreeItemRef, visibleIndex: Double): ItemMetadata = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemMetadata]
    }
    
    @scala.inline
    implicit class ItemMetadataMutableBuilder[Self <: ItemMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: TreeItemRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type MetadataRecord = Record[TreeItemId, ItemMetadata]
  
  @js.native
  trait Options extends TreeConfig {
    
    var expandedIds: ExpandedIds = js.native
    
    var id: String = js.native
    
    var items: js.Array[NestedTreeItemUnknownTree] = js.native
    
    var rootId: TreeItemId | Null = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      expandedIds: ExpandedIds,
      getItemValue: (/* item */ UnknownTreeItem, /* valueKey */ String) => String,
      id: String,
      items: js.Array[NestedTreeItemUnknownTree],
      valueKey: String
    ): Options = {
      val __obj = js.Dynamic.literal(expandedIds = expandedIds.asInstanceOf[js.Any], getItemValue = js.Any.fromFunction2(getItemValue), id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandedIds(value: ExpandedIds): Self = StObject.set(x, "expandedIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedIdsVarargs(value: TreeItemId*): Self = StObject.set(x, "expandedIds", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[NestedTreeItemUnknownTree]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: NestedTreeItemUnknownTree*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setRootId(value: TreeItemId): Self = StObject.set(x, "rootId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootIdNull: Self = StObject.set(x, "rootId", null)
    }
  }
  
  type ReturnValue = js.Tuple3[js.Array[SearchableTreeItem], MetadataRecord, js.Array[SearchableTreeItem]]
  
  @js.native
  trait SearchableTreeItem extends StObject {
    
    /**
      * A DOM Node `id` to use.
      */
    var id: String = js.native
    
    var isParent: Boolean = js.native
    
    var itemId: TreeItemId = js.native
    
    var parentId: TreeItemId | Null = js.native
    
    /**
      * A searchable value for the tree item.
      */
    var value: String = js.native
  }
  object SearchableTreeItem {
    
    @scala.inline
    def apply(id: String, isParent: Boolean, itemId: TreeItemId, value: String): SearchableTreeItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isParent = isParent.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchableTreeItem]
    }
    
    @scala.inline
    implicit class SearchableTreeItemMutableBuilder[Self <: SearchableTreeItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsParent(value: Boolean): Self = StObject.set(x, "isParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemId(value: TreeItemId): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentId(value: TreeItemId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdNull: Self = StObject.set(x, "parentId", null)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<std.Pick<@react-md/tree.@react-md/tree/types/types.TreeProps<@react-md/tree.@react-md/tree/types/types.UnknownTreeItem>, 'valueKey' | 'getItemValue'>> */
  @js.native
  trait TreeConfig extends StObject {
    
    var getItemValue: js.Function2[/* item */ UnknownTreeItem, /* valueKey */ String, String] = js.native
    
    var valueKey: String = js.native
  }
  object TreeConfig {
    
    @scala.inline
    def apply(getItemValue: (/* item */ UnknownTreeItem, /* valueKey */ String) => String, valueKey: String): TreeConfig = {
      val __obj = js.Dynamic.literal(getItemValue = js.Any.fromFunction2(getItemValue), valueKey = valueKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeConfig]
    }
    
    @scala.inline
    implicit class TreeConfigMutableBuilder[Self <: TreeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetItemValue(value: (/* item */ UnknownTreeItem, /* valueKey */ String) => String): Self = StObject.set(x, "getItemValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    }
  }
  
  type TreeItemRef = MutableRefObject[HTMLLIElement | Null]
}
