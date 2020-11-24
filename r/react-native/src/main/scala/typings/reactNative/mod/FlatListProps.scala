package typings.reactNative.mod

import typings.react.mod.ComponentType
import typings.reactNative.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlatListProps[ItemT] extends VirtualizedListProps[ItemT] {
  
  /**
    * Rendered in between each item, but not at the top or bottom
    */
  var ItemSeparatorComponent: js.UndefOr[ComponentType[_] | Null] = js.native
  
  /**
    * Styling for internal View for ListFooterComponent
    */
  var ListFooterComponentStyle: js.UndefOr[ViewStyle | Null] = js.native
  
  /**
    * Styling for internal View for ListHeaderComponent
    */
  var ListHeaderComponentStyle: js.UndefOr[ViewStyle | Null] = js.native
  
  /**
    * Optional custom style for multi-item rows generated when numColumns > 1
    */
  var columnWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * For simplicity, data is just a plain array. If you want to use something else,
    * like an immutable list, use the underlying VirtualizedList directly.
    */
  @JSName("data")
  var data_FlatListProps: js.UndefOr[js.Array[ItemT] | Null] = js.native
  
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
  ] = js.native
  
  /**
    * Uses legacy MetroListView instead of default VirtualizedSectionList
    */
  var legacyImplementation: js.UndefOr[Boolean] = js.native
  
  /**
    * Multiple columns can only be rendered with `horizontal={false}` and will zig-zag like a `flexWrap` layout.
    * Items should all be the same height - masonry layouts are not supported.
    */
  var numColumns: js.UndefOr[Double] = js.native
  
  /**
    * See `ViewabilityHelper` for flow type and further documentation.
    */
  @JSName("viewabilityConfig")
  var viewabilityConfig_FlatListProps: js.UndefOr[js.Any] = js.native
}
object FlatListProps {
  
  @scala.inline
  def apply[ItemT](): FlatListProps[ItemT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlatListProps[ItemT]]
  }
  
  @scala.inline
  implicit class FlatListPropsOps[Self <: FlatListProps[_], ItemT] (val x: Self with FlatListProps[ItemT]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItemSeparatorComponent(value: ComponentType[_]): Self = this.set("ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemSeparatorComponent: Self = this.set("ItemSeparatorComponent", js.undefined)
    
    @scala.inline
    def setItemSeparatorComponentNull: Self = this.set("ItemSeparatorComponent", null)
    
    @scala.inline
    def setListFooterComponentStyle(value: ViewStyle): Self = this.set("ListFooterComponentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListFooterComponentStyle: Self = this.set("ListFooterComponentStyle", js.undefined)
    
    @scala.inline
    def setListFooterComponentStyleNull: Self = this.set("ListFooterComponentStyle", null)
    
    @scala.inline
    def setListHeaderComponentStyle(value: ViewStyle): Self = this.set("ListHeaderComponentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListHeaderComponentStyle: Self = this.set("ListHeaderComponentStyle", js.undefined)
    
    @scala.inline
    def setListHeaderComponentStyleNull: Self = this.set("ListHeaderComponentStyle", null)
    
    @scala.inline
    def setColumnWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("columnWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWrapperStyle: Self = this.set("columnWrapperStyle", js.undefined)
    
    @scala.inline
    def setColumnWrapperStyleNull: Self = this.set("columnWrapperStyle", null)
    
    @scala.inline
    def setDataVarargs(value: ItemT*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[ItemT]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    
    @scala.inline
    def setGetItemLayout(value: (/* data */ js.UndefOr[js.Array[ItemT] | Null], /* index */ Double) => Index): Self = this.set("getItemLayout", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetItemLayout: Self = this.set("getItemLayout", js.undefined)
    
    @scala.inline
    def setLegacyImplementation(value: Boolean): Self = this.set("legacyImplementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegacyImplementation: Self = this.set("legacyImplementation", js.undefined)
    
    @scala.inline
    def setNumColumns(value: Double): Self = this.set("numColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumColumns: Self = this.set("numColumns", js.undefined)
    
    @scala.inline
    def setViewabilityConfig(value: js.Any): Self = this.set("viewabilityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewabilityConfig: Self = this.set("viewabilityConfig", js.undefined)
  }
}
