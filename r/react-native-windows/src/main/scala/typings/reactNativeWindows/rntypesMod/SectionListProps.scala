package typings.reactNativeWindows.rntypesMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactNativeWindows.anon.Index
import typings.reactNativeWindows.anon.Section
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionListProps[ItemT, SectionT]
  extends StObject
     with VirtualizedListWithoutRenderItemProps[ItemT] {
  
  /**
    * Rendered in between adjacent Items within each section.
    */
  var ItemSeparatorComponent: js.UndefOr[ComponentType[Any] | Null] = js.undefined
  
  /**
    * Styling for internal View for ListFooterComponent
    */
  var ListFooterComponentStyle: js.UndefOr[StyleProp[ViewStyle] | Null] = js.undefined
  
  /**
    * Styling for internal View for ListHeaderComponent
    */
  var ListHeaderComponentStyle: js.UndefOr[StyleProp[ViewStyle] | Null] = js.undefined
  
  /**
    * Rendered in between each section.
    */
  var SectionSeparatorComponent: js.UndefOr[ComponentType[Any] | ReactElement | Null] = js.undefined
  
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
      /* data */ (js.Array[SectionListData[ItemT, SectionT]]) | Null, 
      /* index */ Double, 
      Index
    ]
  ] = js.undefined
  
  /**
    * Uses legacy MetroListView instead of default VirtualizedSectionList
    */
  var legacyImplementation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default renderer for every item in every section. Can be over-ridden on a per-section basis.
    */
  var renderItem: js.UndefOr[SectionListRenderItem[ItemT, SectionT]] = js.undefined
  
  /**
    * Rendered at the bottom of each section.
    */
  var renderSectionFooter: js.UndefOr[js.Function1[/* info */ Section[ItemT, SectionT], ReactElement | Null]] = js.undefined
  
  /**
    * Rendered at the top of each section. Sticky headers are not yet supported.
    */
  var renderSectionHeader: js.UndefOr[js.Function1[/* info */ Section[ItemT, SectionT], ReactElement | Null]] = js.undefined
  
  /**
    * An array of objects with data for each section.
    */
  var sections: js.Array[SectionListData[ItemT, SectionT]]
  
  /**
    * Makes section headers stick to the top of the screen until the next one pushes it off.
    * Only enabled by default on iOS because that is the platform standard there.
    */
  var stickySectionHeadersEnabled: js.UndefOr[Boolean] = js.undefined
}
object SectionListProps {
  
  inline def apply[ItemT, SectionT](sections: js.Array[SectionListData[ItemT, SectionT]]): SectionListProps[ItemT, SectionT] = {
    val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionListProps[ItemT, SectionT]]
  }
  
  extension [Self <: SectionListProps[?, ?], ItemT, SectionT](x: Self & (SectionListProps[ItemT, SectionT])) {
    
    inline def setGetItemLayout(
      value: (/* data */ (js.Array[SectionListData[ItemT, SectionT]]) | Null, /* index */ Double) => Index
    ): Self = StObject.set(x, "getItemLayout", js.Any.fromFunction2(value))
    
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
    
    inline def setRenderItem(value: /* info */ SectionListRenderItemInfo[ItemT, SectionT] => ReactElement | Null): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
    
    inline def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
    
    inline def setRenderSectionFooter(value: /* info */ Section[ItemT, SectionT] => ReactElement | Null): Self = StObject.set(x, "renderSectionFooter", js.Any.fromFunction1(value))
    
    inline def setRenderSectionFooterUndefined: Self = StObject.set(x, "renderSectionFooter", js.undefined)
    
    inline def setRenderSectionHeader(value: /* info */ Section[ItemT, SectionT] => ReactElement | Null): Self = StObject.set(x, "renderSectionHeader", js.Any.fromFunction1(value))
    
    inline def setRenderSectionHeaderUndefined: Self = StObject.set(x, "renderSectionHeader", js.undefined)
    
    inline def setSectionSeparatorComponent(value: ComponentType[Any] | ReactElement): Self = StObject.set(x, "SectionSeparatorComponent", value.asInstanceOf[js.Any])
    
    inline def setSectionSeparatorComponentNull: Self = StObject.set(x, "SectionSeparatorComponent", null)
    
    inline def setSectionSeparatorComponentUndefined: Self = StObject.set(x, "SectionSeparatorComponent", js.undefined)
    
    inline def setSections(value: js.Array[SectionListData[ItemT, SectionT]]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsVarargs(value: (SectionListData[ItemT, SectionT])*): Self = StObject.set(x, "sections", js.Array(value*))
    
    inline def setStickySectionHeadersEnabled(value: Boolean): Self = StObject.set(x, "stickySectionHeadersEnabled", value.asInstanceOf[js.Any])
    
    inline def setStickySectionHeadersEnabledUndefined: Self = StObject.set(x, "stickySectionHeadersEnabled", js.undefined)
  }
}
