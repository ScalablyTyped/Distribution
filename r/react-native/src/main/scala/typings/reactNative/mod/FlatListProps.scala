package typings.reactNative.mod

import typings.react.mod.ComponentType
import typings.reactNative.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlatListProps[ItemT]
  extends StObject
     with VirtualizedListProps[ItemT] {
  
  /**
    * Rendered in between each item, but not at the top or bottom
    */
  var ItemSeparatorComponent: js.UndefOr[ComponentType[Any] | Null] = js.undefined
  
  /**
    * Styling for internal View for ListFooterComponent
    */
  var ListFooterComponentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Styling for internal View for ListHeaderComponent
    */
  var ListHeaderComponentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Optional custom style for multi-item rows generated when numColumns > 1
    */
  var columnWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * For simplicity, data is just a plain array. If you want to use something else,
    * like an immutable list, use the underlying VirtualizedList directly.
    */
  @JSName("data")
  var data_FlatListProps: js.UndefOr[js.Array[ItemT] | Null] = js.undefined
  
  /**
    * `getItemLayout` is an optional optimization that lets us skip measurement of dynamic
    * content if you know the height of items a priori. getItemLayout is the most efficient,
    * and is easy to use if you have fixed height items, for example:
    * ```
    * getItemLayout={(data, index) => (
    *   {length: ITEM_HEIGHT, offset: ITEM_HEIGHT * index, index}
    * )}
    * ```
    * Remember to include separator length (height or width) in your offset calculation if you specify
    * `ItemSeparatorComponent`.
    */
  @JSName("getItemLayout")
  var getItemLayout_FlatListProps: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Array[ItemT] | Null], /* index */ Double, Index]
  ] = js.undefined
  
  /**
    * Uses legacy MetroListView instead of default VirtualizedSectionList
    */
  var legacyImplementation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Multiple columns can only be rendered with `horizontal={false}` and will zig-zag like a `flexWrap` layout.
    * Items should all be the same height - masonry layouts are not supported.
    */
  var numColumns: js.UndefOr[Double] = js.undefined
  
  /**
    * See `ViewabilityHelper` for flow type and further documentation.
    */
  @JSName("viewabilityConfig")
  var viewabilityConfig_FlatListProps: js.UndefOr[Any] = js.undefined
}
object FlatListProps {
  
  inline def apply[ItemT](): FlatListProps[ItemT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlatListProps[ItemT]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlatListProps[?], ItemT] (val x: Self & FlatListProps[ItemT]) extends AnyVal {
    
    inline def setColumnWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "columnWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setColumnWrapperStyleNull: Self = StObject.set(x, "columnWrapperStyle", null)
    
    inline def setColumnWrapperStyleUndefined: Self = StObject.set(x, "columnWrapperStyle", js.undefined)
    
    inline def setData(value: js.Array[ItemT]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: ItemT*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setGetItemLayout(value: (/* data */ js.UndefOr[js.Array[ItemT] | Null], /* index */ Double) => Index): Self = StObject.set(x, "getItemLayout", js.Any.fromFunction2(value))
    
    inline def setGetItemLayoutUndefined: Self = StObject.set(x, "getItemLayout", js.undefined)
    
    inline def setItemSeparatorComponent(value: ComponentType[Any]): Self = StObject.set(x, "ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    inline def setItemSeparatorComponentNull: Self = StObject.set(x, "ItemSeparatorComponent", null)
    
    inline def setItemSeparatorComponentUndefined: Self = StObject.set(x, "ItemSeparatorComponent", js.undefined)
    
    inline def setLegacyImplementation(value: Boolean): Self = StObject.set(x, "legacyImplementation", value.asInstanceOf[js.Any])
    
    inline def setLegacyImplementationUndefined: Self = StObject.set(x, "legacyImplementation", js.undefined)
    
    inline def setListFooterComponentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "ListFooterComponentStyle", value.asInstanceOf[js.Any])
    
    inline def setListFooterComponentStyleNull: Self = StObject.set(x, "ListFooterComponentStyle", null)
    
    inline def setListFooterComponentStyleUndefined: Self = StObject.set(x, "ListFooterComponentStyle", js.undefined)
    
    inline def setListHeaderComponentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "ListHeaderComponentStyle", value.asInstanceOf[js.Any])
    
    inline def setListHeaderComponentStyleNull: Self = StObject.set(x, "ListHeaderComponentStyle", null)
    
    inline def setListHeaderComponentStyleUndefined: Self = StObject.set(x, "ListHeaderComponentStyle", js.undefined)
    
    inline def setNumColumns(value: Double): Self = StObject.set(x, "numColumns", value.asInstanceOf[js.Any])
    
    inline def setNumColumnsUndefined: Self = StObject.set(x, "numColumns", js.undefined)
    
    inline def setViewabilityConfig(value: Any): Self = StObject.set(x, "viewabilityConfig", value.asInstanceOf[js.Any])
    
    inline def setViewabilityConfigUndefined: Self = StObject.set(x, "viewabilityConfig", js.undefined)
  }
}
