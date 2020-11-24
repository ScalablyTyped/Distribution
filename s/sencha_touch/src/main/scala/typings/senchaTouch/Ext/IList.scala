package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IList
  extends typings.senchaTouch.Ext.dataview.IDataView {
  
  /** [Property] (Number) */
  var bufferSize: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var disclosureProperty: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Returns the value of disclosureProperty
    * @returns String
    */
  var getDisclosureProperty: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of grouped
    * @returns Boolean
    */
  var getGrouped: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of icon
    * @returns Object
    */
  var getIcon: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of indexBar
    * @returns Boolean/Object
    */
  var getIndexBar: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of infinite
    * @returns Boolean
    */
  var getInfinite: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of itemHeight
    * @returns Number
    */
  var getItemHeight: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of minimumBufferDistance
    * @returns Number
    */
  var getMinimumBufferDistance: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of onItemDisclosure
    * @returns Boolean/Function/Object
    */
  var getOnItemDisclosure: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of pinHeaders
    * @returns Boolean
    */
  var getPinHeaders: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of preventSelectionOnDisclose
    * @returns Boolean
    */
  var getPreventSelectionOnDisclose: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of refreshHeightOnUpdate
    * @returns Boolean
    */
  var getRefreshHeightOnUpdate: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns all the items that are docked in the scroller in this list
    * @returns Array An array of the scrollDock items
    */
  var getScrollDockedItems: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the value of striped
    * @returns Boolean
    */
  var getStriped: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of useHeaders
    * @returns Boolean
    */
  var getUseHeaders: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of useSimpleItems
    * @returns Boolean
    */
  var getUseSimpleItems: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of variableHeights
    * @returns Boolean
    */
  var getVariableHeights: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (Boolean) */
  var grouped: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean/Object) */
  var indexBar: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var infinite: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var itemHeight: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean/Function/Object) */
  var onItemDisclosure: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var pinHeaders: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var preventSelectionOnDisclose: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var refreshHeightOnUpdate: js.UndefOr[Boolean] = js.native
  
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
  ] = js.native
  
  /** [Method] Sets the value of disclosureProperty
    * @param disclosureProperty String The new value.
    */
  var setDisclosureProperty: js.UndefOr[js.Function1[/* disclosureProperty */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of grouped
    * @param grouped Boolean The new value.
    */
  var setGrouped: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of icon
    * @param icon Object The new value.
    */
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of indexBar
    * @param indexBar Boolean/Object The new value.
    */
  var setIndexBar: js.UndefOr[js.Function1[/* indexBar */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of infinite
    * @param infinite Boolean The new value.
    */
  var setInfinite: js.UndefOr[js.Function1[/* infinite */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of itemHeight
    * @param itemHeight Number The new value.
    */
  var setItemHeight: js.UndefOr[js.Function1[/* itemHeight */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of minimumBufferDistance
    * @param minimumBufferDistance Number The new value.
    */
  var setMinimumBufferDistance: js.UndefOr[js.Function1[/* minimumBufferDistance */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of onItemDisclosure
    * @param onItemDisclosure Boolean/Function/Object The new value.
    */
  var setOnItemDisclosure: js.UndefOr[js.Function1[/* onItemDisclosure */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of pinHeaders
    * @param pinHeaders Boolean The new value.
    */
  var setPinHeaders: js.UndefOr[js.Function1[/* pinHeaders */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of preventSelectionOnDisclose
    * @param preventSelectionOnDisclose Boolean The new value.
    */
  var setPreventSelectionOnDisclose: js.UndefOr[js.Function1[/* preventSelectionOnDisclose */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of refreshHeightOnUpdate
    * @param refreshHeightOnUpdate Boolean The new value.
    */
  var setRefreshHeightOnUpdate: js.UndefOr[js.Function1[/* refreshHeightOnUpdate */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of striped
    * @param striped Boolean The new value.
    */
  var setStriped: js.UndefOr[js.Function1[/* striped */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of useHeaders
    * @param useHeaders Boolean The new value.
    */
  var setUseHeaders: js.UndefOr[js.Function1[/* useHeaders */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of useSimpleItems
    * @param useSimpleItems Boolean The new value.
    */
  var setUseSimpleItems: js.UndefOr[js.Function1[/* useSimpleItems */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of variableHeights
    * @param variableHeights Boolean The new value.
    */
  var setVariableHeights: js.UndefOr[js.Function1[/* variableHeights */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var striped: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var useSimpleItems: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var variableHeights: js.UndefOr[Boolean] = js.native
}
object IList {
  
  @scala.inline
  def apply(): IList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IList]
  }
  
  @scala.inline
  implicit class IListOps[Self <: IList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferSize: Self = this.set("bufferSize", js.undefined)
    
    @scala.inline
    def setDisclosureProperty(value: java.lang.String): Self = this.set("disclosureProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisclosureProperty: Self = this.set("disclosureProperty", js.undefined)
    
    @scala.inline
    def setGetDisclosureProperty(value: () => java.lang.String): Self = this.set("getDisclosureProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDisclosureProperty: Self = this.set("getDisclosureProperty", js.undefined)
    
    @scala.inline
    def setGetGrouped(value: () => Boolean): Self = this.set("getGrouped", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetGrouped: Self = this.set("getGrouped", js.undefined)
    
    @scala.inline
    def setGetIcon(value: () => _): Self = this.set("getIcon", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetIcon: Self = this.set("getIcon", js.undefined)
    
    @scala.inline
    def setGetIndexBar(value: () => _): Self = this.set("getIndexBar", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetIndexBar: Self = this.set("getIndexBar", js.undefined)
    
    @scala.inline
    def setGetInfinite(value: () => Boolean): Self = this.set("getInfinite", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInfinite: Self = this.set("getInfinite", js.undefined)
    
    @scala.inline
    def setGetItemHeight(value: () => Double): Self = this.set("getItemHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetItemHeight: Self = this.set("getItemHeight", js.undefined)
    
    @scala.inline
    def setGetMinimumBufferDistance(value: () => Double): Self = this.set("getMinimumBufferDistance", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMinimumBufferDistance: Self = this.set("getMinimumBufferDistance", js.undefined)
    
    @scala.inline
    def setGetOnItemDisclosure(value: () => _): Self = this.set("getOnItemDisclosure", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOnItemDisclosure: Self = this.set("getOnItemDisclosure", js.undefined)
    
    @scala.inline
    def setGetPinHeaders(value: () => Boolean): Self = this.set("getPinHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPinHeaders: Self = this.set("getPinHeaders", js.undefined)
    
    @scala.inline
    def setGetPreventSelectionOnDisclose(value: () => Boolean): Self = this.set("getPreventSelectionOnDisclose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPreventSelectionOnDisclose: Self = this.set("getPreventSelectionOnDisclose", js.undefined)
    
    @scala.inline
    def setGetRefreshHeightOnUpdate(value: () => Boolean): Self = this.set("getRefreshHeightOnUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRefreshHeightOnUpdate: Self = this.set("getRefreshHeightOnUpdate", js.undefined)
    
    @scala.inline
    def setGetScrollDockedItems(value: () => Array): Self = this.set("getScrollDockedItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetScrollDockedItems: Self = this.set("getScrollDockedItems", js.undefined)
    
    @scala.inline
    def setGetStriped(value: () => Boolean): Self = this.set("getStriped", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStriped: Self = this.set("getStriped", js.undefined)
    
    @scala.inline
    def setGetUseHeaders(value: () => Boolean): Self = this.set("getUseHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUseHeaders: Self = this.set("getUseHeaders", js.undefined)
    
    @scala.inline
    def setGetUseSimpleItems(value: () => Boolean): Self = this.set("getUseSimpleItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUseSimpleItems: Self = this.set("getUseSimpleItems", js.undefined)
    
    @scala.inline
    def setGetVariableHeights(value: () => Boolean): Self = this.set("getVariableHeights", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetVariableHeights: Self = this.set("getVariableHeights", js.undefined)
    
    @scala.inline
    def setGrouped(value: Boolean): Self = this.set("grouped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrouped: Self = this.set("grouped", js.undefined)
    
    @scala.inline
    def setIndexBar(value: js.Any): Self = this.set("indexBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexBar: Self = this.set("indexBar", js.undefined)
    
    @scala.inline
    def setInfinite(value: Boolean): Self = this.set("infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfinite: Self = this.set("infinite", js.undefined)
    
    @scala.inline
    def setItemHeight(value: Double): Self = this.set("itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemHeight: Self = this.set("itemHeight", js.undefined)
    
    @scala.inline
    def setOnItemDisclosure(value: js.Any): Self = this.set("onItemDisclosure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnItemDisclosure: Self = this.set("onItemDisclosure", js.undefined)
    
    @scala.inline
    def setPinHeaders(value: Boolean): Self = this.set("pinHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinHeaders: Self = this.set("pinHeaders", js.undefined)
    
    @scala.inline
    def setPreventSelectionOnDisclose(value: Boolean): Self = this.set("preventSelectionOnDisclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventSelectionOnDisclose: Self = this.set("preventSelectionOnDisclose", js.undefined)
    
    @scala.inline
    def setRefreshHeightOnUpdate(value: Boolean): Self = this.set("refreshHeightOnUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshHeightOnUpdate: Self = this.set("refreshHeightOnUpdate", js.undefined)
    
    @scala.inline
    def setScrollToRecord(
      value: (/* record */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* overscroll */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("scrollToRecord", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteScrollToRecord: Self = this.set("scrollToRecord", js.undefined)
    
    @scala.inline
    def setSetDisclosureProperty(value: /* disclosureProperty */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setDisclosureProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisclosureProperty: Self = this.set("setDisclosureProperty", js.undefined)
    
    @scala.inline
    def setSetGrouped(value: /* grouped */ js.UndefOr[Boolean] => Unit): Self = this.set("setGrouped", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetGrouped: Self = this.set("setGrouped", js.undefined)
    
    @scala.inline
    def setSetIcon(value: /* icon */ js.UndefOr[js.Any] => Unit): Self = this.set("setIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetIcon: Self = this.set("setIcon", js.undefined)
    
    @scala.inline
    def setSetIndexBar(value: /* indexBar */ js.UndefOr[js.Any] => Unit): Self = this.set("setIndexBar", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetIndexBar: Self = this.set("setIndexBar", js.undefined)
    
    @scala.inline
    def setSetInfinite(value: /* infinite */ js.UndefOr[Boolean] => Unit): Self = this.set("setInfinite", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetInfinite: Self = this.set("setInfinite", js.undefined)
    
    @scala.inline
    def setSetItemHeight(value: /* itemHeight */ js.UndefOr[Double] => Unit): Self = this.set("setItemHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetItemHeight: Self = this.set("setItemHeight", js.undefined)
    
    @scala.inline
    def setSetMinimumBufferDistance(value: /* minimumBufferDistance */ js.UndefOr[Double] => Unit): Self = this.set("setMinimumBufferDistance", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMinimumBufferDistance: Self = this.set("setMinimumBufferDistance", js.undefined)
    
    @scala.inline
    def setSetOnItemDisclosure(value: /* onItemDisclosure */ js.UndefOr[js.Any] => Unit): Self = this.set("setOnItemDisclosure", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetOnItemDisclosure: Self = this.set("setOnItemDisclosure", js.undefined)
    
    @scala.inline
    def setSetPinHeaders(value: /* pinHeaders */ js.UndefOr[Boolean] => Unit): Self = this.set("setPinHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPinHeaders: Self = this.set("setPinHeaders", js.undefined)
    
    @scala.inline
    def setSetPreventSelectionOnDisclose(value: /* preventSelectionOnDisclose */ js.UndefOr[Boolean] => Unit): Self = this.set("setPreventSelectionOnDisclose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPreventSelectionOnDisclose: Self = this.set("setPreventSelectionOnDisclose", js.undefined)
    
    @scala.inline
    def setSetRefreshHeightOnUpdate(value: /* refreshHeightOnUpdate */ js.UndefOr[Boolean] => Unit): Self = this.set("setRefreshHeightOnUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRefreshHeightOnUpdate: Self = this.set("setRefreshHeightOnUpdate", js.undefined)
    
    @scala.inline
    def setSetStriped(value: /* striped */ js.UndefOr[Boolean] => Unit): Self = this.set("setStriped", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStriped: Self = this.set("setStriped", js.undefined)
    
    @scala.inline
    def setSetUseHeaders(value: /* useHeaders */ js.UndefOr[Boolean] => Unit): Self = this.set("setUseHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUseHeaders: Self = this.set("setUseHeaders", js.undefined)
    
    @scala.inline
    def setSetUseSimpleItems(value: /* useSimpleItems */ js.UndefOr[Boolean] => Unit): Self = this.set("setUseSimpleItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUseSimpleItems: Self = this.set("setUseSimpleItems", js.undefined)
    
    @scala.inline
    def setSetVariableHeights(value: /* variableHeights */ js.UndefOr[Boolean] => Unit): Self = this.set("setVariableHeights", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetVariableHeights: Self = this.set("setVariableHeights", js.undefined)
    
    @scala.inline
    def setStriped(value: Boolean): Self = this.set("striped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStriped: Self = this.set("striped", js.undefined)
    
    @scala.inline
    def setUseSimpleItems(value: Boolean): Self = this.set("useSimpleItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSimpleItems: Self = this.set("useSimpleItems", js.undefined)
    
    @scala.inline
    def setVariableHeights(value: Boolean): Self = this.set("variableHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableHeights: Self = this.set("variableHeights", js.undefined)
  }
}
