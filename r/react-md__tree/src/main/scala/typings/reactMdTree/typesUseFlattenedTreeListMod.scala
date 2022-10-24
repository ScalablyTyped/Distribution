package typings.reactMdTree

import typings.react.mod.MutableRefObject
import typings.reactMdTree.anon.NestedTreeItemUnknownTree
import typings.reactMdTree.typesTypesMod.ExpandedIds
import typings.reactMdTree.typesTypesMod.TreeItemId
import typings.reactMdTree.typesTypesMod.UnknownTreeItem
import typings.std.HTMLLIElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseFlattenedTreeListMod {
  
  @JSImport("@react-md/tree/types/useFlattenedTreeList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFlattenedTreeList(param0: Options): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useFlattenedTreeList")(param0.asInstanceOf[js.Any]).asInstanceOf[ReturnValue]
  
  trait ItemMetadata extends StObject {
    
    var id: String
    
    var ref: TreeItemRef
    
    var visibleIndex: Double
  }
  object ItemMetadata {
    
    inline def apply(id: String, ref: TreeItemRef, visibleIndex: Double): ItemMetadata = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemMetadata]
    }
    
    extension [Self <: ItemMetadata](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRef(value: TreeItemRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type MetadataRecord = Record[TreeItemId, ItemMetadata]
  
  trait Options
    extends StObject
       with TreeConfig {
    
    var expandedIds: ExpandedIds
    
    var id: String
    
    var items: js.Array[NestedTreeItemUnknownTree]
    
    var rootId: TreeItemId | Null
  }
  object Options {
    
    inline def apply(
      expandedIds: ExpandedIds,
      getItemValue: (/* item */ UnknownTreeItem, /* valueKey */ String) => String,
      id: String,
      items: js.Array[NestedTreeItemUnknownTree],
      valueKey: String
    ): Options = {
      val __obj = js.Dynamic.literal(expandedIds = expandedIds.asInstanceOf[js.Any], getItemValue = js.Any.fromFunction2(getItemValue), id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any], rootId = null)
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExpandedIds(value: ExpandedIds): Self = StObject.set(x, "expandedIds", value.asInstanceOf[js.Any])
      
      inline def setExpandedIdsVarargs(value: TreeItemId*): Self = StObject.set(x, "expandedIds", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[NestedTreeItemUnknownTree]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: NestedTreeItemUnknownTree*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setRootId(value: TreeItemId): Self = StObject.set(x, "rootId", value.asInstanceOf[js.Any])
      
      inline def setRootIdNull: Self = StObject.set(x, "rootId", null)
    }
  }
  
  type ReturnValue = js.Tuple3[js.Array[SearchableTreeItem], MetadataRecord, js.Array[SearchableTreeItem]]
  
  trait SearchableTreeItem extends StObject {
    
    /**
      * A DOM Node `id` to use.
      */
    var id: String
    
    var isParent: Boolean
    
    var itemId: TreeItemId
    
    var parentId: TreeItemId | Null
    
    /**
      * A searchable value for the tree item.
      */
    var value: String
  }
  object SearchableTreeItem {
    
    inline def apply(id: String, isParent: Boolean, itemId: TreeItemId, value: String): SearchableTreeItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isParent = isParent.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], parentId = null)
      __obj.asInstanceOf[SearchableTreeItem]
    }
    
    extension [Self <: SearchableTreeItem](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsParent(value: Boolean): Self = StObject.set(x, "isParent", value.asInstanceOf[js.Any])
      
      inline def setItemId(value: TreeItemId): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setParentId(value: TreeItemId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdNull: Self = StObject.set(x, "parentId", null)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<std.Pick<@react-md/tree.@react-md/tree/types/types.TreeProps<@react-md/tree.@react-md/tree/types/types.UnknownTreeItem>, 'valueKey' | 'getItemValue'>> */
  trait TreeConfig extends StObject {
    
    var getItemValue: js.Function2[/* item */ UnknownTreeItem, /* valueKey */ String, String]
    
    var valueKey: String
  }
  object TreeConfig {
    
    inline def apply(getItemValue: (/* item */ UnknownTreeItem, /* valueKey */ String) => String, valueKey: String): TreeConfig = {
      val __obj = js.Dynamic.literal(getItemValue = js.Any.fromFunction2(getItemValue), valueKey = valueKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeConfig]
    }
    
    extension [Self <: TreeConfig](x: Self) {
      
      inline def setGetItemValue(value: (/* item */ UnknownTreeItem, /* valueKey */ String) => String): Self = StObject.set(x, "getItemValue", js.Any.fromFunction2(value))
      
      inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    }
  }
  
  type TreeItemRef = MutableRefObject[HTMLLIElement | Null]
}
