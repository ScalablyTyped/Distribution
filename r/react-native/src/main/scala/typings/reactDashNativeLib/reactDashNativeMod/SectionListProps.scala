package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SectionListProps[ItemT] extends VirtualizedListWithoutRenderItemProps[ItemT] {
  /**
       * Rendered in between adjacent Items within each section.
       */
  var ItemSeparatorComponent: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[_] | scala.Null] = js.undefined
  /**
       * Rendered in between each section.
       */
  var SectionSeparatorComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[_] | reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
  ] = js.undefined
  /**
       * `getItemLayout` is an optional optimization that lets us skip measurement of dynamic
       * content if you know the height of items a priori. getItemLayout is the most efficient,
       * and is easy to use if you have fixed height items, for example:
       * ```
       * getItemLayout={(data, index) => (
       *   {length: ITEM_HEIGHT, offset: ITEM_HEIGHT * index, index}
       * )}
       * ```
       */
  @JSName("getItemLayout")
  var getItemLayout_SectionListProps: js.UndefOr[
    js.Function2[
      /* data */ js.Array[SectionListData[ItemT]] | scala.Null, 
      /* index */ scala.Double, 
      reactDashNativeLib.Anon_Length
    ]
  ] = js.undefined
  /**
       * Default renderer for every item in every section. Can be over-ridden on a per-section basis.
       */
  var renderItem: js.UndefOr[SectionListRenderItem[ItemT]] = js.undefined
  /**
       * Rendered at the bottom of each section.
       */
  var renderSectionFooter: js.UndefOr[
    js.Function1[
      /* info */ reactDashNativeLib.Anon_Section[ItemT], 
      reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
    ]
  ] = js.undefined
  /**
       * Rendered at the top of each section. Sticky headers are not yet supported.
       */
  var renderSectionHeader: js.UndefOr[
    js.Function1[
      /* info */ reactDashNativeLib.Anon_Section[ItemT], 
      reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
    ]
  ] = js.undefined
  /**
       * An array of objects with data for each section.
       */
  var sections: js.Array[SectionListData[ItemT]]
  /**
       * Makes section headers stick to the top of the screen until the next one pushes it off.
       * Only enabled by default on iOS because that is the platform standard there.
       */
  var stickySectionHeadersEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

