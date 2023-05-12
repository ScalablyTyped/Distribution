package typings.reactTypesShared

import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Iterable
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCollectionsMod {
  
  trait AsyncLoadable extends StObject {
    
    /** Whether the items are currently loading. */
    var isLoading: js.UndefOr[Boolean] = js.undefined
    
    // possibly isLoadingMore
    /** Handler that is called when more items should be loaded, e.g. while scrolling near the bottom. */
    var onLoadMore: js.UndefOr[js.Function0[Any]] = js.undefined
  }
  object AsyncLoadable {
    
    inline def apply(): AsyncLoadable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncLoadable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncLoadable] (val x: Self) extends AnyVal {
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      inline def setOnLoadMore(value: () => Any): Self = StObject.set(x, "onLoadMore", js.Any.fromFunction0(value))
      
      inline def setOnLoadMoreUndefined: Self = StObject.set(x, "onLoadMore", js.undefined)
    }
  }
  
  @js.native
  trait Collection[T]
    extends StObject
       with Iterable[T] {
    
    /** Get an item by the index of its key. */
    def at(idx: Double): T | Null = js.native
    
    /** Iterate over the child items of the given key. */
    var getChildren: js.UndefOr[js.Function1[/* key */ Key, js.Iterable[T]]] = js.native
    
    /** Get the first key in the collection. */
    def getFirstKey(): Key | Null = js.native
    
    /** Get an item by its key. */
    def getItem(key: Key): T | Null = js.native
    
    /** Get the key that comes after the given key in the collection. */
    def getKeyAfter(key: Key): Key | Null = js.native
    
    /** Get the key that comes before the given key in the collection. */
    def getKeyBefore(key: Key): Key | Null = js.native
    
    /** Iterate over all keys in the collection. */
    def getKeys(): js.Iterable[Key] = js.native
    
    /** Get the last key in the collection. */
    def getLastKey(): Key | Null = js.native
    
    /** Returns a string representation of the item's contents. */
    var getTextValue: js.UndefOr[js.Function1[/* key */ Key, String]] = js.native
    
    /** The number of items in the collection. */
    val size: Double = js.native
  }
  
  trait CollectionBase[T] extends StObject {
    
    /** The contents of the collection. */
    var children: CollectionChildren[T]
    
    /** The item keys that are disabled. These items cannot be selected, focused, or otherwise interacted with. */
    var disabledKeys: js.UndefOr[js.Iterable[Key]] = js.undefined
    
    /** Item objects in the collection. */
    var items: js.UndefOr[js.Iterable[T]] = js.undefined
  }
  object CollectionBase {
    
    inline def apply[T](children: CollectionChildren[T]): CollectionBase[T] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionBase[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectionBase[?], T] (val x: Self & CollectionBase[T]) extends AnyVal {
      
      inline def setChildren(value: CollectionChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: T => CollectionElement[T]): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenVarargs(value: CollectionElement[T]*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDisabledKeys(value: js.Iterable[Key]): Self = StObject.set(x, "disabledKeys", value.asInstanceOf[js.Any])
      
      inline def setDisabledKeysUndefined: Self = StObject.set(x, "disabledKeys", js.undefined)
      
      inline def setItems(value: js.Iterable[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    }
  }
  
  type CollectionChildren[T] = CollectionElement[T] | js.Array[CollectionElement[T]] | (js.Function1[/* item */ T, CollectionElement[T]])
  
  type CollectionElement[T] = SectionElement[T] | ItemElement[T]
  
  /* Inlined parent std.Partial<@react-types/shared.@react-types/shared/src/collections.CollectionBase<T>> */
  trait CollectionStateBase[T, C /* <: Collection[Node[T]] */] extends StObject {
    
    var children: js.UndefOr[CollectionChildren[T]] = js.undefined
    
    /** A pre-constructed collection to use instead of building one from items and children. */
    var collection: js.UndefOr[C] = js.undefined
    
    var disabledKeys: js.UndefOr[js.Iterable[Key]] = js.undefined
    
    var items: js.UndefOr[js.Iterable[T]] = js.undefined
  }
  object CollectionStateBase {
    
    inline def apply[T, C /* <: Collection[Node[T]] */](): CollectionStateBase[T, C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectionStateBase[T, C]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectionStateBase[?, ?], T, C /* <: Collection[Node[T]] */] (val x: Self & (CollectionStateBase[T, C])) extends AnyVal {
      
      inline def setChildren(value: CollectionChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: T => CollectionElement[T]): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: CollectionElement[T]*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setCollection(value: C): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
      
      inline def setDisabledKeys(value: js.Iterable[Key]): Self = StObject.set(x, "disabledKeys", value.asInstanceOf[js.Any])
      
      inline def setDisabledKeysUndefined: Self = StObject.set(x, "disabledKeys", js.undefined)
      
      inline def setItems(value: js.Iterable[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    }
  }
  
  trait Expandable extends StObject {
    
    /** The initial expanded keys in the collection (uncontrolled). */
    var defaultExpandedKeys: js.UndefOr[js.Iterable[Key]] = js.undefined
    
    /** The currently expanded keys in the collection (controlled). */
    var expandedKeys: js.UndefOr[js.Iterable[Key]] = js.undefined
    
    /** Handler that is called when items are expanded or collapsed. */
    var onExpandedChange: js.UndefOr[js.Function1[/* keys */ Set[Key], Any]] = js.undefined
  }
  object Expandable {
    
    inline def apply(): Expandable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Expandable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Expandable] (val x: Self) extends AnyVal {
      
      inline def setDefaultExpandedKeys(value: js.Iterable[Key]): Self = StObject.set(x, "defaultExpandedKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedKeysUndefined: Self = StObject.set(x, "defaultExpandedKeys", js.undefined)
      
      inline def setExpandedKeys(value: js.Iterable[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      inline def setOnExpandedChange(value: /* keys */ Set[Key] => Any): Self = StObject.set(x, "onExpandedChange", js.Any.fromFunction1(value))
      
      inline def setOnExpandedChangeUndefined: Self = StObject.set(x, "onExpandedChange", js.undefined)
    }
  }
  
  type ItemElement[T] = ReactElement
  
  trait ItemProps[T] extends StObject {
    
    /** An accessibility label for this item. */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /** A list of child item objects. Used for dynamic collections. */
    var childItems: js.UndefOr[js.Iterable[T]] = js.undefined
    
    /** Rendered contents of the item or child items. */
    var children: ReactNode
    
    /** Whether this item has children, even if not loaded yet. */
    var hasChildItems: js.UndefOr[Boolean] = js.undefined
    
    // label?? contents?
    /** A string representation of the item's contents, used for features like typeahead. */
    var textValue: js.UndefOr[String] = js.undefined
    
    /** Rendered contents of the item if `children` contains child items. */
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object ItemProps {
    
    inline def apply[T](): ItemProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemProps[?], T] (val x: Self & ItemProps[T]) extends AnyVal {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setChildItems(value: js.Iterable[T]): Self = StObject.set(x, "childItems", value.asInstanceOf[js.Any])
      
      inline def setChildItemsUndefined: Self = StObject.set(x, "childItems", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHasChildItems(value: Boolean): Self = StObject.set(x, "hasChildItems", value.asInstanceOf[js.Any])
      
      inline def setHasChildItemsUndefined: Self = StObject.set(x, "hasChildItems", js.undefined)
      
      inline def setTextValue(value: String): Self = StObject.set(x, "textValue", value.asInstanceOf[js.Any])
      
      inline def setTextValueUndefined: Self = StObject.set(x, "textValue", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type ItemRenderer[T] = js.Function1[/* item */ T, ItemElement[T]]
  
  trait KeyboardDelegate extends StObject {
    
    /** Returns the first key, or `null` for none. */
    var getFirstKey: js.UndefOr[
        js.Function2[/* key */ js.UndefOr[Key], /* global */ js.UndefOr[Boolean], Key | Null]
      ] = js.undefined
    
    /** Returns the key visually above the given one, or `null` for none. */
    var getKeyAbove: js.UndefOr[js.Function1[/* key */ Key, Key | Null]] = js.undefined
    
    /** Returns the key visually below the given one, or `null` for none. */
    var getKeyBelow: js.UndefOr[js.Function1[/* key */ Key, Key | Null]] = js.undefined
    
    /** Returns the next key after `fromKey` that matches the given search string, or `null` for none. */
    var getKeyForSearch: js.UndefOr[js.Function2[/* search */ String, /* fromKey */ js.UndefOr[Key], Key | Null]] = js.undefined
    
    /** Returns the key visually to the left of the given one, or `null` for none. */
    var getKeyLeftOf: js.UndefOr[js.Function1[/* key */ Key, Key | Null]] = js.undefined
    
    /** Returns the key visually one page above the given one, or `null` for none. */
    var getKeyPageAbove: js.UndefOr[js.Function1[/* key */ Key, Key | Null]] = js.undefined
    
    /** Returns the key visually one page below the given one, or `null` for none. */
    var getKeyPageBelow: js.UndefOr[js.Function1[/* key */ Key, Key | Null]] = js.undefined
    
    /** Returns the key visually to the right of the given one, or `null` for none. */
    var getKeyRightOf: js.UndefOr[js.Function1[/* key */ Key, Key | Null]] = js.undefined
    
    /** Returns the last key, or `null` for none. */
    var getLastKey: js.UndefOr[
        js.Function2[/* key */ js.UndefOr[Key], /* global */ js.UndefOr[Boolean], Key | Null]
      ] = js.undefined
  }
  object KeyboardDelegate {
    
    inline def apply(): KeyboardDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardDelegate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyboardDelegate] (val x: Self) extends AnyVal {
      
      inline def setGetFirstKey(value: (/* key */ js.UndefOr[Key], /* global */ js.UndefOr[Boolean]) => Key | Null): Self = StObject.set(x, "getFirstKey", js.Any.fromFunction2(value))
      
      inline def setGetFirstKeyUndefined: Self = StObject.set(x, "getFirstKey", js.undefined)
      
      inline def setGetKeyAbove(value: /* key */ Key => Key | Null): Self = StObject.set(x, "getKeyAbove", js.Any.fromFunction1(value))
      
      inline def setGetKeyAboveUndefined: Self = StObject.set(x, "getKeyAbove", js.undefined)
      
      inline def setGetKeyBelow(value: /* key */ Key => Key | Null): Self = StObject.set(x, "getKeyBelow", js.Any.fromFunction1(value))
      
      inline def setGetKeyBelowUndefined: Self = StObject.set(x, "getKeyBelow", js.undefined)
      
      inline def setGetKeyForSearch(value: (/* search */ String, /* fromKey */ js.UndefOr[Key]) => Key | Null): Self = StObject.set(x, "getKeyForSearch", js.Any.fromFunction2(value))
      
      inline def setGetKeyForSearchUndefined: Self = StObject.set(x, "getKeyForSearch", js.undefined)
      
      inline def setGetKeyLeftOf(value: /* key */ Key => Key | Null): Self = StObject.set(x, "getKeyLeftOf", js.Any.fromFunction1(value))
      
      inline def setGetKeyLeftOfUndefined: Self = StObject.set(x, "getKeyLeftOf", js.undefined)
      
      inline def setGetKeyPageAbove(value: /* key */ Key => Key | Null): Self = StObject.set(x, "getKeyPageAbove", js.Any.fromFunction1(value))
      
      inline def setGetKeyPageAboveUndefined: Self = StObject.set(x, "getKeyPageAbove", js.undefined)
      
      inline def setGetKeyPageBelow(value: /* key */ Key => Key | Null): Self = StObject.set(x, "getKeyPageBelow", js.Any.fromFunction1(value))
      
      inline def setGetKeyPageBelowUndefined: Self = StObject.set(x, "getKeyPageBelow", js.undefined)
      
      inline def setGetKeyRightOf(value: /* key */ Key => Key | Null): Self = StObject.set(x, "getKeyRightOf", js.Any.fromFunction1(value))
      
      inline def setGetKeyRightOfUndefined: Self = StObject.set(x, "getKeyRightOf", js.undefined)
      
      inline def setGetLastKey(value: (/* key */ js.UndefOr[Key], /* global */ js.UndefOr[Boolean]) => Key | Null): Self = StObject.set(x, "getLastKey", js.Any.fromFunction2(value))
      
      inline def setGetLastKeyUndefined: Self = StObject.set(x, "getLastKey", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTypesShared.reactTypesSharedStrings.loading
    - typings.reactTypesShared.reactTypesSharedStrings.sorting
    - typings.reactTypesShared.reactTypesSharedStrings.loadingMore
    - typings.reactTypesShared.reactTypesSharedStrings.error
    - typings.reactTypesShared.reactTypesSharedStrings.idle
    - typings.reactTypesShared.reactTypesSharedStrings.filtering
  */
  trait LoadingState extends StObject
  object LoadingState {
    
    inline def error: typings.reactTypesShared.reactTypesSharedStrings.error = "error".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.error]
    
    inline def filtering: typings.reactTypesShared.reactTypesSharedStrings.filtering = "filtering".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.filtering]
    
    inline def idle: typings.reactTypesShared.reactTypesSharedStrings.idle = "idle".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.idle]
    
    inline def loading: typings.reactTypesShared.reactTypesSharedStrings.loading = "loading".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.loading]
    
    inline def loadingMore: typings.reactTypesShared.reactTypesSharedStrings.loadingMore = "loadingMore".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.loadingMore]
    
    inline def sorting: typings.reactTypesShared.reactTypesSharedStrings.sorting = "sorting".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.sorting]
  }
  
  trait Node[T] extends StObject {
    
    /** An accessibility label for this node. */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /**
      * The loaded children of this node.
      * @deprecated Use `collection.getChildren(node.key)` instead.
      */
    var childNodes: js.Iterable[Node[T]]
    
    /** Whether this item has children, even if not loaded yet. */
    var hasChildNodes: Boolean
    
    /** The index of this node within its parent. */
    var index: js.UndefOr[Double] = js.undefined
    
    /** A unique key for the node. */
    var key: Key
    
    /** The level of depth this node is at in the heirarchy. */
    var level: Double
    
    /** The key of the node after this node. */
    var nextKey: js.UndefOr[Key | Null] = js.undefined
    
    /** The key of the parent node. */
    var parentKey: js.UndefOr[Key | Null] = js.undefined
    
    /** The key of the node before this node. */
    var prevKey: js.UndefOr[Key | Null] = js.undefined
    
    /** Additional properties specific to a particular node type. */
    var props: js.UndefOr[Any] = js.undefined
    
    /** The rendered contents of this node (e.g. JSX). */
    var rendered: ReactNode
    
    /** @private */
    var shouldInvalidate: js.UndefOr[js.Function1[/* context */ Any, Boolean]] = js.undefined
    
    /** A string value for this node, used for features like typeahead. */
    var textValue: String
    
    /** The type of item this node represents. */
    var `type`: String
    
    /** The object value the node was created from. */
    var value: T | Null
    
    /** A function that should be called to wrap the rendered node. */
    var wrapper: js.UndefOr[js.Function1[/* element */ ReactElement, ReactElement]] = js.undefined
  }
  object Node {
    
    inline def apply[T](
      childNodes: js.Iterable[Node[T]],
      hasChildNodes: Boolean,
      key: Key,
      level: Double,
      textValue: String,
      `type`: String
    ): Node[T] = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], hasChildNodes = hasChildNodes.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], textValue = textValue.asInstanceOf[js.Any], value = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Node[?], T] (val x: Self & Node[T]) extends AnyVal {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setChildNodes(value: js.Iterable[Node[T]]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setHasChildNodes(value: Boolean): Self = StObject.set(x, "hasChildNodes", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setNextKey(value: Key): Self = StObject.set(x, "nextKey", value.asInstanceOf[js.Any])
      
      inline def setNextKeyNull: Self = StObject.set(x, "nextKey", null)
      
      inline def setNextKeyUndefined: Self = StObject.set(x, "nextKey", js.undefined)
      
      inline def setParentKey(value: Key): Self = StObject.set(x, "parentKey", value.asInstanceOf[js.Any])
      
      inline def setParentKeyNull: Self = StObject.set(x, "parentKey", null)
      
      inline def setParentKeyUndefined: Self = StObject.set(x, "parentKey", js.undefined)
      
      inline def setPrevKey(value: Key): Self = StObject.set(x, "prevKey", value.asInstanceOf[js.Any])
      
      inline def setPrevKeyNull: Self = StObject.set(x, "prevKey", null)
      
      inline def setPrevKeyUndefined: Self = StObject.set(x, "prevKey", js.undefined)
      
      inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setRendered(value: ReactNode): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
      
      inline def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
      
      inline def setShouldInvalidate(value: /* context */ Any => Boolean): Self = StObject.set(x, "shouldInvalidate", js.Any.fromFunction1(value))
      
      inline def setShouldInvalidateUndefined: Self = StObject.set(x, "shouldInvalidate", js.undefined)
      
      inline def setTextValue(value: String): Self = StObject.set(x, "textValue", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setWrapper(value: /* element */ ReactElement => ReactElement): Self = StObject.set(x, "wrapper", js.Any.fromFunction1(value))
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  type SectionElement[T] = ReactElement
  
  trait SectionProps[T] extends StObject {
    
    /** An accessibility label for the section. */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /** Static child items or a function to render children. */
    var children: ItemElement[T] | js.Array[ItemElement[T]] | ItemRenderer[T]
    
    /** Item objects in the section. */
    var items: js.UndefOr[js.Iterable[T]] = js.undefined
    
    /** Rendered contents of the section, e.g. a header. */
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object SectionProps {
    
    inline def apply[T](children: ItemElement[T] | js.Array[ItemElement[T]] | ItemRenderer[T]): SectionProps[T] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[SectionProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SectionProps[?], T] (val x: Self & SectionProps[T]) extends AnyVal {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setChildren(value: ItemElement[T] | js.Array[ItemElement[T]] | ItemRenderer[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: T => ItemElement[T]): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenVarargs(value: ItemElement[T]*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setItems(value: js.Iterable[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait SortDescriptor extends StObject {
    
    /** The key of the column to sort by. */
    var column: js.UndefOr[Key] = js.undefined
    
    /** The direction to sort by. */
    var direction: js.UndefOr[SortDirection] = js.undefined
  }
  object SortDescriptor {
    
    inline def apply(): SortDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SortDescriptor] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Key): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setDirection(value: SortDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTypesShared.reactTypesSharedStrings.ascending
    - typings.reactTypesShared.reactTypesSharedStrings.descending
  */
  trait SortDirection extends StObject
  object SortDirection {
    
    inline def ascending: typings.reactTypesShared.reactTypesSharedStrings.ascending = "ascending".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.ascending]
    
    inline def descending: typings.reactTypesShared.reactTypesSharedStrings.descending = "descending".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.descending]
  }
  
  trait Sortable extends StObject {
    
    /** Handler that is called when the sorted column or direction changes. */
    var onSortChange: js.UndefOr[js.Function1[/* descriptor */ SortDescriptor, Any]] = js.undefined
    
    /** The current sorted column and direction. */
    var sortDescriptor: js.UndefOr[SortDescriptor] = js.undefined
  }
  object Sortable {
    
    inline def apply(): Sortable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sortable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sortable] (val x: Self) extends AnyVal {
      
      inline def setOnSortChange(value: /* descriptor */ SortDescriptor => Any): Self = StObject.set(x, "onSortChange", js.Any.fromFunction1(value))
      
      inline def setOnSortChangeUndefined: Self = StObject.set(x, "onSortChange", js.undefined)
      
      inline def setSortDescriptor(value: SortDescriptor): Self = StObject.set(x, "sortDescriptor", value.asInstanceOf[js.Any])
      
      inline def setSortDescriptorUndefined: Self = StObject.set(x, "sortDescriptor", js.undefined)
    }
  }
}
