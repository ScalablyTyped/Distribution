package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlatListProps[ItemT] extends VirtualizedListProps[ItemT] {
  /**
    * Rendered in between each item, but not at the top or bottom
    */
  var ItemSeparatorComponent: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[_] | scala.Null] = js.native
  /**
    * Optional custom style for multi-item rows generated when numColumns > 1
    */
  var columnWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * For simplicity, data is just a plain array. If you want to use something else,
    * like an immutable list, use the underlying VirtualizedList directly.
    */
  @JSName("data")
  var data_FlatListProps: js.Array[ItemT] | scala.Null = js.native
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
    js.Function2[
      /* data */ js.Array[ItemT] | scala.Null, 
      /* index */ scala.Double, 
      reactDashNativeLib.Anon_Index
    ]
  ] = js.native
  /**
    * Uses legacy MetroListView instead of default VirtualizedSectionList
    */
  var legacyImplementation: js.UndefOr[scala.Boolean] = js.native
  /**
    * Multiple columns can only be rendered with `horizontal={false}` and will zig-zag like a `flexWrap` layout.
    * Items should all be the same height - masonry layouts are not supported.
    */
  var numColumns: js.UndefOr[scala.Double] = js.native
  /**
    * See `ViewabilityHelper` for flow type and further documentation.
    */
  @JSName("viewabilityConfig")
  var viewabilityConfig_FlatListProps: js.UndefOr[js.Any] = js.native
}

