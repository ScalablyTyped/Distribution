package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IList
  extends StObject
     with typings.senchaTouch.Ext.dataview.IDataView {
  
  /** [Property] (Number) */
  var bufferSize: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var disclosureProperty: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Returns the value of disclosureProperty
    * @returns String
    */
  var getDisclosureProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of grouped
    * @returns Boolean
    */
  var getGrouped: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of icon
    * @returns Object
    */
  var getIcon: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of indexBar
    * @returns Boolean/Object
    */
  var getIndexBar: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of infinite
    * @returns Boolean
    */
  var getInfinite: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of itemHeight
    * @returns Number
    */
  var getItemHeight: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of minimumBufferDistance
    * @returns Number
    */
  var getMinimumBufferDistance: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of onItemDisclosure
    * @returns Boolean/Function/Object
    */
  var getOnItemDisclosure: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of pinHeaders
    * @returns Boolean
    */
  var getPinHeaders: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of preventSelectionOnDisclose
    * @returns Boolean
    */
  var getPreventSelectionOnDisclose: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of refreshHeightOnUpdate
    * @returns Boolean
    */
  var getRefreshHeightOnUpdate: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns all the items that are docked in the scroller in this list
    * @returns Array An array of the scrollDock items
    */
  var getScrollDockedItems: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of striped
    * @returns Boolean
    */
  var getStriped: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of useHeaders
    * @returns Boolean
    */
  var getUseHeaders: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of useSimpleItems
    * @returns Boolean
    */
  var getUseSimpleItems: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of variableHeights
    * @returns Boolean
    */
  var getVariableHeights: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var grouped: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean/Object) */
  var indexBar: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var infinite: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var itemHeight: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean/Function/Object) */
  var onItemDisclosure: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var pinHeaders: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var preventSelectionOnDisclose: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var refreshHeightOnUpdate: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Scrolls the list so that the specified record is at the top
    * @param record Object {Ext.data.Model} Record in the lists store to scroll to
    * @param animate Object {Boolean} Determines if scrolling is animated to a cut
    * @param overscroll Object {Boolean} Determines if list can be overscrolled
    */
  var scrollToRecord: js.UndefOr[
    js.Function3[
      /* record */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* overscroll */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Sets the value of disclosureProperty
    * @param disclosureProperty String The new value.
    */
  var setDisclosureProperty: js.UndefOr[js.Function1[/* disclosureProperty */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of grouped
    * @param grouped Boolean The new value.
    */
  var setGrouped: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of icon
    * @param icon Object The new value.
    */
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of indexBar
    * @param indexBar Boolean/Object The new value.
    */
  var setIndexBar: js.UndefOr[js.Function1[/* indexBar */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of infinite
    * @param infinite Boolean The new value.
    */
  var setInfinite: js.UndefOr[js.Function1[/* infinite */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of itemHeight
    * @param itemHeight Number The new value.
    */
  var setItemHeight: js.UndefOr[js.Function1[/* itemHeight */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of minimumBufferDistance
    * @param minimumBufferDistance Number The new value.
    */
  var setMinimumBufferDistance: js.UndefOr[js.Function1[/* minimumBufferDistance */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of onItemDisclosure
    * @param onItemDisclosure Boolean/Function/Object The new value.
    */
  var setOnItemDisclosure: js.UndefOr[js.Function1[/* onItemDisclosure */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of pinHeaders
    * @param pinHeaders Boolean The new value.
    */
  var setPinHeaders: js.UndefOr[js.Function1[/* pinHeaders */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of preventSelectionOnDisclose
    * @param preventSelectionOnDisclose Boolean The new value.
    */
  var setPreventSelectionOnDisclose: js.UndefOr[js.Function1[/* preventSelectionOnDisclose */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of refreshHeightOnUpdate
    * @param refreshHeightOnUpdate Boolean The new value.
    */
  var setRefreshHeightOnUpdate: js.UndefOr[js.Function1[/* refreshHeightOnUpdate */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of striped
    * @param striped Boolean The new value.
    */
  var setStriped: js.UndefOr[js.Function1[/* striped */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of useHeaders
    * @param useHeaders Boolean The new value.
    */
  var setUseHeaders: js.UndefOr[js.Function1[/* useHeaders */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of useSimpleItems
    * @param useSimpleItems Boolean The new value.
    */
  var setUseSimpleItems: js.UndefOr[js.Function1[/* useSimpleItems */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of variableHeights
    * @param variableHeights Boolean The new value.
    */
  var setVariableHeights: js.UndefOr[js.Function1[/* variableHeights */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var striped: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var useSimpleItems: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var variableHeights: js.UndefOr[Boolean] = js.undefined
}
object IList {
  
  inline def apply(): IList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IList]
  }
  
  extension [Self <: IList](x: Self) {
    
    inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
    
    inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
    
    inline def setDisclosureProperty(value: java.lang.String): Self = StObject.set(x, "disclosureProperty", value.asInstanceOf[js.Any])
    
    inline def setDisclosurePropertyUndefined: Self = StObject.set(x, "disclosureProperty", js.undefined)
    
    inline def setGetDisclosureProperty(value: () => java.lang.String): Self = StObject.set(x, "getDisclosureProperty", js.Any.fromFunction0(value))
    
    inline def setGetDisclosurePropertyUndefined: Self = StObject.set(x, "getDisclosureProperty", js.undefined)
    
    inline def setGetGrouped(value: () => Boolean): Self = StObject.set(x, "getGrouped", js.Any.fromFunction0(value))
    
    inline def setGetGroupedUndefined: Self = StObject.set(x, "getGrouped", js.undefined)
    
    inline def setGetIcon(value: () => js.Any): Self = StObject.set(x, "getIcon", js.Any.fromFunction0(value))
    
    inline def setGetIconUndefined: Self = StObject.set(x, "getIcon", js.undefined)
    
    inline def setGetIndexBar(value: () => js.Any): Self = StObject.set(x, "getIndexBar", js.Any.fromFunction0(value))
    
    inline def setGetIndexBarUndefined: Self = StObject.set(x, "getIndexBar", js.undefined)
    
    inline def setGetInfinite(value: () => Boolean): Self = StObject.set(x, "getInfinite", js.Any.fromFunction0(value))
    
    inline def setGetInfiniteUndefined: Self = StObject.set(x, "getInfinite", js.undefined)
    
    inline def setGetItemHeight(value: () => Double): Self = StObject.set(x, "getItemHeight", js.Any.fromFunction0(value))
    
    inline def setGetItemHeightUndefined: Self = StObject.set(x, "getItemHeight", js.undefined)
    
    inline def setGetMinimumBufferDistance(value: () => Double): Self = StObject.set(x, "getMinimumBufferDistance", js.Any.fromFunction0(value))
    
    inline def setGetMinimumBufferDistanceUndefined: Self = StObject.set(x, "getMinimumBufferDistance", js.undefined)
    
    inline def setGetOnItemDisclosure(value: () => js.Any): Self = StObject.set(x, "getOnItemDisclosure", js.Any.fromFunction0(value))
    
    inline def setGetOnItemDisclosureUndefined: Self = StObject.set(x, "getOnItemDisclosure", js.undefined)
    
    inline def setGetPinHeaders(value: () => Boolean): Self = StObject.set(x, "getPinHeaders", js.Any.fromFunction0(value))
    
    inline def setGetPinHeadersUndefined: Self = StObject.set(x, "getPinHeaders", js.undefined)
    
    inline def setGetPreventSelectionOnDisclose(value: () => Boolean): Self = StObject.set(x, "getPreventSelectionOnDisclose", js.Any.fromFunction0(value))
    
    inline def setGetPreventSelectionOnDiscloseUndefined: Self = StObject.set(x, "getPreventSelectionOnDisclose", js.undefined)
    
    inline def setGetRefreshHeightOnUpdate(value: () => Boolean): Self = StObject.set(x, "getRefreshHeightOnUpdate", js.Any.fromFunction0(value))
    
    inline def setGetRefreshHeightOnUpdateUndefined: Self = StObject.set(x, "getRefreshHeightOnUpdate", js.undefined)
    
    inline def setGetScrollDockedItems(value: () => Array): Self = StObject.set(x, "getScrollDockedItems", js.Any.fromFunction0(value))
    
    inline def setGetScrollDockedItemsUndefined: Self = StObject.set(x, "getScrollDockedItems", js.undefined)
    
    inline def setGetStriped(value: () => Boolean): Self = StObject.set(x, "getStriped", js.Any.fromFunction0(value))
    
    inline def setGetStripedUndefined: Self = StObject.set(x, "getStriped", js.undefined)
    
    inline def setGetUseHeaders(value: () => Boolean): Self = StObject.set(x, "getUseHeaders", js.Any.fromFunction0(value))
    
    inline def setGetUseHeadersUndefined: Self = StObject.set(x, "getUseHeaders", js.undefined)
    
    inline def setGetUseSimpleItems(value: () => Boolean): Self = StObject.set(x, "getUseSimpleItems", js.Any.fromFunction0(value))
    
    inline def setGetUseSimpleItemsUndefined: Self = StObject.set(x, "getUseSimpleItems", js.undefined)
    
    inline def setGetVariableHeights(value: () => Boolean): Self = StObject.set(x, "getVariableHeights", js.Any.fromFunction0(value))
    
    inline def setGetVariableHeightsUndefined: Self = StObject.set(x, "getVariableHeights", js.undefined)
    
    inline def setGrouped(value: Boolean): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
    
    inline def setGroupedUndefined: Self = StObject.set(x, "grouped", js.undefined)
    
    inline def setIndexBar(value: js.Any): Self = StObject.set(x, "indexBar", value.asInstanceOf[js.Any])
    
    inline def setIndexBarUndefined: Self = StObject.set(x, "indexBar", js.undefined)
    
    inline def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    inline def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
    
    inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
    
    inline def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
    
    inline def setOnItemDisclosure(value: js.Any): Self = StObject.set(x, "onItemDisclosure", value.asInstanceOf[js.Any])
    
    inline def setOnItemDisclosureUndefined: Self = StObject.set(x, "onItemDisclosure", js.undefined)
    
    inline def setPinHeaders(value: Boolean): Self = StObject.set(x, "pinHeaders", value.asInstanceOf[js.Any])
    
    inline def setPinHeadersUndefined: Self = StObject.set(x, "pinHeaders", js.undefined)
    
    inline def setPreventSelectionOnDisclose(value: Boolean): Self = StObject.set(x, "preventSelectionOnDisclose", value.asInstanceOf[js.Any])
    
    inline def setPreventSelectionOnDiscloseUndefined: Self = StObject.set(x, "preventSelectionOnDisclose", js.undefined)
    
    inline def setRefreshHeightOnUpdate(value: Boolean): Self = StObject.set(x, "refreshHeightOnUpdate", value.asInstanceOf[js.Any])
    
    inline def setRefreshHeightOnUpdateUndefined: Self = StObject.set(x, "refreshHeightOnUpdate", js.undefined)
    
    inline def setScrollToRecord(
      value: (/* record */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* overscroll */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "scrollToRecord", js.Any.fromFunction3(value))
    
    inline def setScrollToRecordUndefined: Self = StObject.set(x, "scrollToRecord", js.undefined)
    
    inline def setSetDisclosureProperty(value: /* disclosureProperty */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDisclosureProperty", js.Any.fromFunction1(value))
    
    inline def setSetDisclosurePropertyUndefined: Self = StObject.set(x, "setDisclosureProperty", js.undefined)
    
    inline def setSetGrouped(value: /* grouped */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setGrouped", js.Any.fromFunction1(value))
    
    inline def setSetGroupedUndefined: Self = StObject.set(x, "setGrouped", js.undefined)
    
    inline def setSetIcon(value: /* icon */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
    
    inline def setSetIconUndefined: Self = StObject.set(x, "setIcon", js.undefined)
    
    inline def setSetIndexBar(value: /* indexBar */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setIndexBar", js.Any.fromFunction1(value))
    
    inline def setSetIndexBarUndefined: Self = StObject.set(x, "setIndexBar", js.undefined)
    
    inline def setSetInfinite(value: /* infinite */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setInfinite", js.Any.fromFunction1(value))
    
    inline def setSetInfiniteUndefined: Self = StObject.set(x, "setInfinite", js.undefined)
    
    inline def setSetItemHeight(value: /* itemHeight */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setItemHeight", js.Any.fromFunction1(value))
    
    inline def setSetItemHeightUndefined: Self = StObject.set(x, "setItemHeight", js.undefined)
    
    inline def setSetMinimumBufferDistance(value: /* minimumBufferDistance */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinimumBufferDistance", js.Any.fromFunction1(value))
    
    inline def setSetMinimumBufferDistanceUndefined: Self = StObject.set(x, "setMinimumBufferDistance", js.undefined)
    
    inline def setSetOnItemDisclosure(value: /* onItemDisclosure */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setOnItemDisclosure", js.Any.fromFunction1(value))
    
    inline def setSetOnItemDisclosureUndefined: Self = StObject.set(x, "setOnItemDisclosure", js.undefined)
    
    inline def setSetPinHeaders(value: /* pinHeaders */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setPinHeaders", js.Any.fromFunction1(value))
    
    inline def setSetPinHeadersUndefined: Self = StObject.set(x, "setPinHeaders", js.undefined)
    
    inline def setSetPreventSelectionOnDisclose(value: /* preventSelectionOnDisclose */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setPreventSelectionOnDisclose", js.Any.fromFunction1(value))
    
    inline def setSetPreventSelectionOnDiscloseUndefined: Self = StObject.set(x, "setPreventSelectionOnDisclose", js.undefined)
    
    inline def setSetRefreshHeightOnUpdate(value: /* refreshHeightOnUpdate */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setRefreshHeightOnUpdate", js.Any.fromFunction1(value))
    
    inline def setSetRefreshHeightOnUpdateUndefined: Self = StObject.set(x, "setRefreshHeightOnUpdate", js.undefined)
    
    inline def setSetStriped(value: /* striped */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setStriped", js.Any.fromFunction1(value))
    
    inline def setSetStripedUndefined: Self = StObject.set(x, "setStriped", js.undefined)
    
    inline def setSetUseHeaders(value: /* useHeaders */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseHeaders", js.Any.fromFunction1(value))
    
    inline def setSetUseHeadersUndefined: Self = StObject.set(x, "setUseHeaders", js.undefined)
    
    inline def setSetUseSimpleItems(value: /* useSimpleItems */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseSimpleItems", js.Any.fromFunction1(value))
    
    inline def setSetUseSimpleItemsUndefined: Self = StObject.set(x, "setUseSimpleItems", js.undefined)
    
    inline def setSetVariableHeights(value: /* variableHeights */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setVariableHeights", js.Any.fromFunction1(value))
    
    inline def setSetVariableHeightsUndefined: Self = StObject.set(x, "setVariableHeights", js.undefined)
    
    inline def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
    
    inline def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
    
    inline def setUseSimpleItems(value: Boolean): Self = StObject.set(x, "useSimpleItems", value.asInstanceOf[js.Any])
    
    inline def setUseSimpleItemsUndefined: Self = StObject.set(x, "useSimpleItems", js.undefined)
    
    inline def setVariableHeights(value: Boolean): Self = StObject.set(x, "variableHeights", value.asInstanceOf[js.Any])
    
    inline def setVariableHeightsUndefined: Self = StObject.set(x, "variableHeights", js.undefined)
  }
}
