package typings.senchaUnderscoreTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IList
  extends typings.senchaUnderscoreTouch.Ext.dataview.IDataView {
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
  var getIcon: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of indexBar
  		* @returns Boolean/Object
  		*/
  var getIndexBar: js.UndefOr[js.Function0[_]] = js.undefined
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
  var getOnItemDisclosure: js.UndefOr[js.Function0[_]] = js.undefined
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
  @scala.inline
  def apply(
    IDataView: typings.senchaUnderscoreTouch.Ext.dataview.IDataView = null,
    baseCls: java.lang.String = null,
    bufferSize: Int | Double = null,
    defaultType: java.lang.String = null,
    destroy: () => Unit = null,
    disclosureProperty: java.lang.String = null,
    getBaseCls: () => java.lang.String = null,
    getDefaultType: () => java.lang.String = null,
    getDisclosureProperty: () => java.lang.String = null,
    getGrouped: () => Boolean = null,
    getIcon: () => _ = null,
    getIndexBar: () => _ = null,
    getInfinite: () => Boolean = null,
    getItemAt: /* index */ js.UndefOr[Double] => _ = null,
    getItemHeight: () => Double = null,
    getItemIndex: /* item */ js.UndefOr[Double] => Double = null,
    getMinimumBufferDistance: () => Double = null,
    getOnItemDisclosure: () => _ = null,
    getPinHeaders: () => Boolean = null,
    getPreventSelectionOnDisclose: () => Boolean = null,
    getRefreshHeightOnUpdate: () => Boolean = null,
    getScrollDockedItems: () => Array = null,
    getStriped: () => Boolean = null,
    getUi: () => java.lang.String = null,
    getUseHeaders: () => Boolean = null,
    getUseSimpleItems: () => Boolean = null,
    getVariableHeights: () => Boolean = null,
    getViewItems: () => _ = null,
    grouped: js.UndefOr[Boolean] = js.undefined,
    indexBar: js.Any = null,
    infinite: js.UndefOr[Boolean] = js.undefined,
    initialize: () => Unit = null,
    itemHeight: Int | Double = null,
    onItemDisclosure: js.Any = null,
    pinHeaders: js.UndefOr[Boolean] = js.undefined,
    preventSelectionOnDisclose: js.UndefOr[Boolean] = js.undefined,
    refreshHeightOnUpdate: js.UndefOr[Boolean] = js.undefined,
    scrollToRecord: (/* record */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* overscroll */ js.UndefOr[js.Any]) => Unit = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => Unit = null,
    setDefaultType: /* defaultType */ js.UndefOr[java.lang.String] => Unit = null,
    setDisclosureProperty: /* disclosureProperty */ js.UndefOr[java.lang.String] => Unit = null,
    setGrouped: /* grouped */ js.UndefOr[Boolean] => Unit = null,
    setIcon: /* icon */ js.UndefOr[js.Any] => Unit = null,
    setIndexBar: /* indexBar */ js.UndefOr[js.Any] => Unit = null,
    setInfinite: /* infinite */ js.UndefOr[Boolean] => Unit = null,
    setItemHeight: /* itemHeight */ js.UndefOr[Double] => Unit = null,
    setMinimumBufferDistance: /* minimumBufferDistance */ js.UndefOr[Double] => Unit = null,
    setOnItemDisclosure: /* onItemDisclosure */ js.UndefOr[js.Any] => Unit = null,
    setPinHeaders: /* pinHeaders */ js.UndefOr[Boolean] => Unit = null,
    setPreventSelectionOnDisclose: /* preventSelectionOnDisclose */ js.UndefOr[Boolean] => Unit = null,
    setRefreshHeightOnUpdate: /* refreshHeightOnUpdate */ js.UndefOr[Boolean] => Unit = null,
    setStriped: /* striped */ js.UndefOr[Boolean] => Unit = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => Unit = null,
    setUseHeaders: /* useHeaders */ js.UndefOr[Boolean] => Unit = null,
    setUseSimpleItems: /* useSimpleItems */ js.UndefOr[Boolean] => Unit = null,
    setVariableHeights: /* variableHeights */ js.UndefOr[Boolean] => Unit = null,
    striped: js.UndefOr[Boolean] = js.undefined,
    ui: java.lang.String = null,
    useSimpleItems: js.UndefOr[Boolean] = js.undefined,
    variableHeights: js.UndefOr[Boolean] = js.undefined
  ): IList = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IDataView)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (disclosureProperty != null) __obj.updateDynamic("disclosureProperty")(disclosureProperty)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getDefaultType != null) __obj.updateDynamic("getDefaultType")(js.Any.fromFunction0(getDefaultType))
    if (getDisclosureProperty != null) __obj.updateDynamic("getDisclosureProperty")(js.Any.fromFunction0(getDisclosureProperty))
    if (getGrouped != null) __obj.updateDynamic("getGrouped")(js.Any.fromFunction0(getGrouped))
    if (getIcon != null) __obj.updateDynamic("getIcon")(js.Any.fromFunction0(getIcon))
    if (getIndexBar != null) __obj.updateDynamic("getIndexBar")(js.Any.fromFunction0(getIndexBar))
    if (getInfinite != null) __obj.updateDynamic("getInfinite")(js.Any.fromFunction0(getInfinite))
    if (getItemAt != null) __obj.updateDynamic("getItemAt")(js.Any.fromFunction1(getItemAt))
    if (getItemHeight != null) __obj.updateDynamic("getItemHeight")(js.Any.fromFunction0(getItemHeight))
    if (getItemIndex != null) __obj.updateDynamic("getItemIndex")(js.Any.fromFunction1(getItemIndex))
    if (getMinimumBufferDistance != null) __obj.updateDynamic("getMinimumBufferDistance")(js.Any.fromFunction0(getMinimumBufferDistance))
    if (getOnItemDisclosure != null) __obj.updateDynamic("getOnItemDisclosure")(js.Any.fromFunction0(getOnItemDisclosure))
    if (getPinHeaders != null) __obj.updateDynamic("getPinHeaders")(js.Any.fromFunction0(getPinHeaders))
    if (getPreventSelectionOnDisclose != null) __obj.updateDynamic("getPreventSelectionOnDisclose")(js.Any.fromFunction0(getPreventSelectionOnDisclose))
    if (getRefreshHeightOnUpdate != null) __obj.updateDynamic("getRefreshHeightOnUpdate")(js.Any.fromFunction0(getRefreshHeightOnUpdate))
    if (getScrollDockedItems != null) __obj.updateDynamic("getScrollDockedItems")(js.Any.fromFunction0(getScrollDockedItems))
    if (getStriped != null) __obj.updateDynamic("getStriped")(js.Any.fromFunction0(getStriped))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (getUseHeaders != null) __obj.updateDynamic("getUseHeaders")(js.Any.fromFunction0(getUseHeaders))
    if (getUseSimpleItems != null) __obj.updateDynamic("getUseSimpleItems")(js.Any.fromFunction0(getUseSimpleItems))
    if (getVariableHeights != null) __obj.updateDynamic("getVariableHeights")(js.Any.fromFunction0(getVariableHeights))
    if (getViewItems != null) __obj.updateDynamic("getViewItems")(js.Any.fromFunction0(getViewItems))
    if (!js.isUndefined(grouped)) __obj.updateDynamic("grouped")(grouped)
    if (indexBar != null) __obj.updateDynamic("indexBar")(indexBar)
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite)
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (onItemDisclosure != null) __obj.updateDynamic("onItemDisclosure")(onItemDisclosure)
    if (!js.isUndefined(pinHeaders)) __obj.updateDynamic("pinHeaders")(pinHeaders)
    if (!js.isUndefined(preventSelectionOnDisclose)) __obj.updateDynamic("preventSelectionOnDisclose")(preventSelectionOnDisclose)
    if (!js.isUndefined(refreshHeightOnUpdate)) __obj.updateDynamic("refreshHeightOnUpdate")(refreshHeightOnUpdate)
    if (scrollToRecord != null) __obj.updateDynamic("scrollToRecord")(js.Any.fromFunction3(scrollToRecord))
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setDefaultType != null) __obj.updateDynamic("setDefaultType")(js.Any.fromFunction1(setDefaultType))
    if (setDisclosureProperty != null) __obj.updateDynamic("setDisclosureProperty")(js.Any.fromFunction1(setDisclosureProperty))
    if (setGrouped != null) __obj.updateDynamic("setGrouped")(js.Any.fromFunction1(setGrouped))
    if (setIcon != null) __obj.updateDynamic("setIcon")(js.Any.fromFunction1(setIcon))
    if (setIndexBar != null) __obj.updateDynamic("setIndexBar")(js.Any.fromFunction1(setIndexBar))
    if (setInfinite != null) __obj.updateDynamic("setInfinite")(js.Any.fromFunction1(setInfinite))
    if (setItemHeight != null) __obj.updateDynamic("setItemHeight")(js.Any.fromFunction1(setItemHeight))
    if (setMinimumBufferDistance != null) __obj.updateDynamic("setMinimumBufferDistance")(js.Any.fromFunction1(setMinimumBufferDistance))
    if (setOnItemDisclosure != null) __obj.updateDynamic("setOnItemDisclosure")(js.Any.fromFunction1(setOnItemDisclosure))
    if (setPinHeaders != null) __obj.updateDynamic("setPinHeaders")(js.Any.fromFunction1(setPinHeaders))
    if (setPreventSelectionOnDisclose != null) __obj.updateDynamic("setPreventSelectionOnDisclose")(js.Any.fromFunction1(setPreventSelectionOnDisclose))
    if (setRefreshHeightOnUpdate != null) __obj.updateDynamic("setRefreshHeightOnUpdate")(js.Any.fromFunction1(setRefreshHeightOnUpdate))
    if (setStriped != null) __obj.updateDynamic("setStriped")(js.Any.fromFunction1(setStriped))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (setUseHeaders != null) __obj.updateDynamic("setUseHeaders")(js.Any.fromFunction1(setUseHeaders))
    if (setUseSimpleItems != null) __obj.updateDynamic("setUseSimpleItems")(js.Any.fromFunction1(setUseSimpleItems))
    if (setVariableHeights != null) __obj.updateDynamic("setVariableHeights")(js.Any.fromFunction1(setVariableHeights))
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    if (!js.isUndefined(useSimpleItems)) __obj.updateDynamic("useSimpleItems")(useSimpleItems)
    if (!js.isUndefined(variableHeights)) __obj.updateDynamic("variableHeights")(variableHeights)
    __obj.asInstanceOf[IList]
  }
}

