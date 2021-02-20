package typings.reactNative.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactNative.anon.Index
import typings.reactNative.anon.Section
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionListProps[ItemT, SectionT] extends VirtualizedListWithoutRenderItemProps[ItemT] {
  
  /**
    * Rendered in between adjacent Items within each section.
    */
  var ItemSeparatorComponent: js.UndefOr[ComponentType[_] | Null] = js.native
  
  /**
    * Rendered in between each section.
    */
  var SectionSeparatorComponent: js.UndefOr[ComponentType[_] | ReactElement | Null] = js.native
  
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
  ] = js.native
  
  /**
    * Uses legacy MetroListView instead of default VirtualizedSectionList
    */
  var legacyImplementation: js.UndefOr[Boolean] = js.native
  
  /**
    * Default renderer for every item in every section. Can be over-ridden on a per-section basis.
    */
  var renderItem: js.UndefOr[SectionListRenderItem[ItemT, SectionT]] = js.native
  
  /**
    * Rendered at the bottom of each section.
    */
  var renderSectionFooter: js.UndefOr[js.Function1[/* info */ Section[ItemT, SectionT], ReactElement | Null]] = js.native
  
  /**
    * Rendered at the top of each section. Sticky headers are not yet supported.
    */
  var renderSectionHeader: js.UndefOr[js.Function1[/* info */ Section[ItemT, SectionT], ReactElement | Null]] = js.native
  
  /**
    * An array of objects with data for each section.
    */
  var sections: js.Array[SectionListData[ItemT, SectionT]] = js.native
  
  /**
    * Makes section headers stick to the top of the screen until the next one pushes it off.
    * Only enabled by default on iOS because that is the platform standard there.
    */
  var stickySectionHeadersEnabled: js.UndefOr[Boolean] = js.native
}
object SectionListProps {
  
  @scala.inline
  def apply[ItemT, SectionT](sections: js.Array[SectionListData[ItemT, SectionT]]): SectionListProps[ItemT, SectionT] = {
    val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionListProps[ItemT, SectionT]]
  }
  
  @scala.inline
  implicit class SectionListPropsMutableBuilder[Self <: SectionListProps[_, _], ItemT, SectionT] (val x: Self with (SectionListProps[ItemT, SectionT])) extends AnyVal {
    
    @scala.inline
    def setGetItemLayout(
      value: (/* data */ (js.Array[SectionListData[ItemT, SectionT]]) | Null, /* index */ Double) => Index
    ): Self = StObject.set(x, "getItemLayout", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetItemLayoutUndefined: Self = StObject.set(x, "getItemLayout", js.undefined)
    
    @scala.inline
    def setItemSeparatorComponent(value: ComponentType[_]): Self = StObject.set(x, "ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSeparatorComponentNull: Self = StObject.set(x, "ItemSeparatorComponent", null)
    
    @scala.inline
    def setItemSeparatorComponentUndefined: Self = StObject.set(x, "ItemSeparatorComponent", js.undefined)
    
    @scala.inline
    def setLegacyImplementation(value: Boolean): Self = StObject.set(x, "legacyImplementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacyImplementationUndefined: Self = StObject.set(x, "legacyImplementation", js.undefined)
    
    @scala.inline
    def setRenderItem(value: /* info */ SectionListRenderItemInfo[ItemT, SectionT] => ReactElement | Null): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
    
    @scala.inline
    def setRenderSectionFooter(value: /* info */ Section[ItemT, SectionT] => ReactElement | Null): Self = StObject.set(x, "renderSectionFooter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderSectionFooterUndefined: Self = StObject.set(x, "renderSectionFooter", js.undefined)
    
    @scala.inline
    def setRenderSectionHeader(value: /* info */ Section[ItemT, SectionT] => ReactElement | Null): Self = StObject.set(x, "renderSectionHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderSectionHeaderUndefined: Self = StObject.set(x, "renderSectionHeader", js.undefined)
    
    @scala.inline
    def setSectionSeparatorComponent(value: ComponentType[_] | ReactElement): Self = StObject.set(x, "SectionSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionSeparatorComponentNull: Self = StObject.set(x, "SectionSeparatorComponent", null)
    
    @scala.inline
    def setSectionSeparatorComponentUndefined: Self = StObject.set(x, "SectionSeparatorComponent", js.undefined)
    
    @scala.inline
    def setSections(value: js.Array[SectionListData[ItemT, SectionT]]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsVarargs(value: (SectionListData[ItemT, SectionT])*): Self = StObject.set(x, "sections", js.Array(value :_*))
    
    @scala.inline
    def setStickySectionHeadersEnabled(value: Boolean): Self = StObject.set(x, "stickySectionHeadersEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickySectionHeadersEnabledUndefined: Self = StObject.set(x, "stickySectionHeadersEnabled", js.undefined)
  }
}
