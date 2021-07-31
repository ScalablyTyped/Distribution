package typings.reactMdTree

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.reactMdList.listMod.ListElement
import typings.reactMdTree.anon.NestedTreeItemUnknownTree
import typings.reactMdTree.typesMod.ExpandedIds
import typings.reactMdTree.typesMod.SelectedIds
import typings.reactMdTree.typesMod.TreeData
import typings.reactMdTree.typesMod.TreeItemId
import typings.reactMdTree.typesMod.TreeItemSorter
import typings.reactMdTree.typesMod.UnknownTreeItem
import typings.reactMdTree.useFlattenedTreeListMod.MetadataRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTreeMovementMod {
  
  @JSImport("@react-md/tree/types/useTreeMovement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useTreeMovement(
    hasIdDataRootIdSortOnBlurOnFocusOnKeyDownMultiSelectSelectedIdsOnItemSelectOnMultiItemSelectExpandedIdsOnItemExpansionOnMultiItemExpansionValueKeyGetItemValue: Options
  ): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeMovement")(hasIdDataRootIdSortOnBlurOnFocusOnKeyDownMultiSelectSelectedIdsOnItemSelectOnMultiItemSelectExpandedIdsOnItemExpansionOnMultiItemExpansionValueKeyGetItemValue.asInstanceOf[js.Any]).asInstanceOf[ReturnValue]
  
  /* Inlined std.Pick<@react-md/tree.@react-md/tree/types/types.TreeProps<@react-md/tree.@react-md/tree/types/types.UnknownTreeItem>, 'id' | 'data' | 'sort' | 'onBlur' | 'onFocus' | 'onKeyDown' | 'multiSelect' | 'selectedIds' | 'onItemSelect' | 'onMultiItemSelect' | 'expandedIds' | 'onItemExpansion' | 'onMultiItemExpansion'> & std.Required<std.Pick<@react-md/tree.@react-md/tree/types/types.TreeProps<@react-md/tree.@react-md/tree/types/types.UnknownTreeItem>, 'valueKey' | 'getItemValue' | 'rootId'>> */
  trait Options extends StObject {
    
    var data: TreeData[UnknownTreeItem]
    
    var expandedIds: ExpandedIds
    
    var getItemValue: js.Function2[/* item */ UnknownTreeItem, /* valueKey */ String, String]
    
    var id: String
    
    var multiSelect: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[ListElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[ListElement]] = js.undefined
    
    var onItemExpansion: js.Function2[/* itemId */ TreeItemId, /* expanded */ Boolean, Unit]
    
    var onItemSelect: js.Function1[/* itemId */ TreeItemId, Unit]
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[ListElement]] = js.undefined
    
    var onMultiItemExpansion: js.Function1[/* itemIds */ ExpandedIds, Unit]
    
    var onMultiItemSelect: js.Function1[/* itemIds */ SelectedIds, Unit]
    
    var rootId: TreeItemId
    
    var selectedIds: SelectedIds
    
    var sort: js.UndefOr[TreeItemSorter[UnknownTreeItem]] = js.undefined
    
    var valueKey: String
  }
  object Options {
    
    @scala.inline
    def apply(
      data: TreeData[UnknownTreeItem],
      expandedIds: ExpandedIds,
      getItemValue: (/* item */ UnknownTreeItem, /* valueKey */ String) => String,
      id: String,
      onItemExpansion: (/* itemId */ TreeItemId, /* expanded */ Boolean) => Unit,
      onItemSelect: /* itemId */ TreeItemId => Unit,
      onMultiItemExpansion: /* itemIds */ ExpandedIds => Unit,
      onMultiItemSelect: /* itemIds */ SelectedIds => Unit,
      rootId: TreeItemId,
      selectedIds: SelectedIds,
      valueKey: String
    ): Options = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], expandedIds = expandedIds.asInstanceOf[js.Any], getItemValue = js.Any.fromFunction2(getItemValue), id = id.asInstanceOf[js.Any], onItemExpansion = js.Any.fromFunction2(onItemExpansion), onItemSelect = js.Any.fromFunction1(onItemSelect), onMultiItemExpansion = js.Any.fromFunction1(onMultiItemExpansion), onMultiItemSelect = js.Any.fromFunction1(onMultiItemSelect), rootId = rootId.asInstanceOf[js.Any], selectedIds = selectedIds.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: TreeData[UnknownTreeItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedIds(value: ExpandedIds): Self = StObject.set(x, "expandedIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedIdsVarargs(value: TreeItemId*): Self = StObject.set(x, "expandedIds", js.Array(value :_*))
      
      @scala.inline
      def setGetItemValue(value: (/* item */ UnknownTreeItem, /* valueKey */ String) => String): Self = StObject.set(x, "getItemValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[ListElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[ListElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnItemExpansion(value: (/* itemId */ TreeItemId, /* expanded */ Boolean) => Unit): Self = StObject.set(x, "onItemExpansion", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnItemSelect(value: /* itemId */ TreeItemId => Unit): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[ListElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnMultiItemExpansion(value: /* itemIds */ ExpandedIds => Unit): Self = StObject.set(x, "onMultiItemExpansion", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMultiItemSelect(value: /* itemIds */ SelectedIds => Unit): Self = StObject.set(x, "onMultiItemSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRootId(value: TreeItemId): Self = StObject.set(x, "rootId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIds(value: SelectedIds): Self = StObject.set(x, "selectedIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIdsVarargs(value: TreeItemId*): Self = StObject.set(x, "selectedIds", js.Array(value :_*))
      
      @scala.inline
      def setSort(value: /* items */ js.Array[UnknownTreeItem] => js.Array[UnknownTreeItem]): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReturnValue extends StObject {
    
    /**
      * The current treeitem's DOM id that is currently keyboard focused.
      */
    var activeId: String
    
    /**
      * A blur handler that should be passed to the tree list element that handles
      * removing the `aria-activedescendant` when the tree is no longer within
      * focus. This will also call the optional `onBlur` prop.
      */
    var handleBlur: FocusEventHandler[ListElement]
    
    /**
      * A focus handler that should be passed to the tree element that handles
      * conditionally setting the default `aria-activedescendant` id on first
      * focus. This will also call the optional `onFocus` prop.
      */
    var handleFocus: FocusEventHandler[ListElement]
    
    /**
      * The keydown handler that should be passed to the tree list element that
      * handles all the keyboard functionality and movement.
      *
      * This will also call the optional `onKeyDown` prop.
      */
    var handleKeyDown: KeyboardEventHandler[ListElement]
    
    /**
      * A record containing the DOM ids for each tree item along with a ref object
      * to provide to the itemRenderer for that item. This is just for a quick
      * lookup to help with all the tree traversal and keyboard movement.
      */
    var itemIdRefs: MetadataRecord
    
    /**
      * A nested list representation of the provided tree data. This is used for
      * rendering all the treeitem nodes.
      */
    var items: js.Array[NestedTreeItemUnknownTree]
    
    /**
      * A function that updates the `activeId` based on the provided `itemId`. This
      * should really only be used whenever an item is clicked with a mouse or
      * touch since the `activeId` will be updated automatically for all the other
      * flows.
      */
    def setActiveId(itemId: TreeItemId): Unit
  }
  object ReturnValue {
    
    @scala.inline
    def apply(
      activeId: String,
      handleBlur: FocusEvent[ListElement] => Unit,
      handleFocus: FocusEvent[ListElement] => Unit,
      handleKeyDown: KeyboardEvent[ListElement] => Unit,
      itemIdRefs: MetadataRecord,
      items: js.Array[NestedTreeItemUnknownTree],
      setActiveId: TreeItemId => Unit
    ): ReturnValue = {
      val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], handleBlur = js.Any.fromFunction1(handleBlur), handleFocus = js.Any.fromFunction1(handleFocus), handleKeyDown = js.Any.fromFunction1(handleKeyDown), itemIdRefs = itemIdRefs.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], setActiveId = js.Any.fromFunction1(setActiveId))
      __obj.asInstanceOf[ReturnValue]
    }
    
    @scala.inline
    implicit class ReturnValueMutableBuilder[Self <: ReturnValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleBlur(value: FocusEvent[ListElement] => Unit): Self = StObject.set(x, "handleBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleFocus(value: FocusEvent[ListElement] => Unit): Self = StObject.set(x, "handleFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleKeyDown(value: KeyboardEvent[ListElement] => Unit): Self = StObject.set(x, "handleKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemIdRefs(value: MetadataRecord): Self = StObject.set(x, "itemIdRefs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[NestedTreeItemUnknownTree]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: NestedTreeItemUnknownTree*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setSetActiveId(value: TreeItemId => Unit): Self = StObject.set(x, "setActiveId", js.Any.fromFunction1(value))
    }
  }
}
