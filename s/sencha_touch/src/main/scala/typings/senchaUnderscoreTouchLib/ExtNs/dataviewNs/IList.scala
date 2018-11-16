package typings
package senchaUnderscoreTouchLib.ExtNs.dataviewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IList extends IDataView {
  /** [Property] (Number) */
  var bufferSize: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var disclosureProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of disclosureProperty
  		* @returns String
  		*/
  var getDisclosureProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of grouped
  		* @returns Boolean
  		*/
  var getGrouped: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
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
  var getInfinite: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of itemHeight
  		* @returns Number
  		*/
  var getItemHeight: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minimumBufferDistance
  		* @returns Number
  		*/
  var getMinimumBufferDistance: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of onItemDisclosure
  		* @returns Boolean/Function/Object
  		*/
  var getOnItemDisclosure: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of pinHeaders
  		* @returns Boolean
  		*/
  var getPinHeaders: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of preventSelectionOnDisclose
  		* @returns Boolean
  		*/
  var getPreventSelectionOnDisclose: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of refreshHeightOnUpdate
  		* @returns Boolean
  		*/
  var getRefreshHeightOnUpdate: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns all the items that are docked in the scroller in this list
  		* @returns Array An array of the scrollDock items
  		*/
  var getScrollDockedItems: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of striped
  		* @returns Boolean
  		*/
  var getStriped: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of useHeaders
  		* @returns Boolean
  		*/
  var getUseHeaders: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of useSimpleItems
  		* @returns Boolean
  		*/
  var getUseSimpleItems: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of variableHeights
  		* @returns Boolean
  		*/
  var getVariableHeights: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var grouped: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var indexBar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var infinite: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var itemHeight: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean/Function/Object) */
  var onItemDisclosure: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var pinHeaders: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var preventSelectionOnDisclose: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var refreshHeightOnUpdate: js.UndefOr[scala.Boolean] = js.undefined
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
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of disclosureProperty
  		* @param disclosureProperty String The new value.
  		*/
  var setDisclosureProperty: js.UndefOr[js.Function1[/* disclosureProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of grouped
  		* @param grouped Boolean The new value.
  		*/
  var setGrouped: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of icon
  		* @param icon Object The new value.
  		*/
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of indexBar
  		* @param indexBar Boolean/Object The new value.
  		*/
  var setIndexBar: js.UndefOr[js.Function1[/* indexBar */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of infinite
  		* @param infinite Boolean The new value.
  		*/
  var setInfinite: js.UndefOr[js.Function1[/* infinite */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemHeight
  		* @param itemHeight Number The new value.
  		*/
  var setItemHeight: js.UndefOr[js.Function1[/* itemHeight */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minimumBufferDistance
  		* @param minimumBufferDistance Number The new value.
  		*/
  var setMinimumBufferDistance: js.UndefOr[js.Function1[/* minimumBufferDistance */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of onItemDisclosure
  		* @param onItemDisclosure Boolean/Function/Object The new value.
  		*/
  var setOnItemDisclosure: js.UndefOr[js.Function1[/* onItemDisclosure */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pinHeaders
  		* @param pinHeaders Boolean The new value.
  		*/
  var setPinHeaders: js.UndefOr[js.Function1[/* pinHeaders */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of preventSelectionOnDisclose
  		* @param preventSelectionOnDisclose Boolean The new value.
  		*/
  var setPreventSelectionOnDisclose: js.UndefOr[
    js.Function1[/* preventSelectionOnDisclose */ js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of refreshHeightOnUpdate
  		* @param refreshHeightOnUpdate Boolean The new value.
  		*/
  var setRefreshHeightOnUpdate: js.UndefOr[js.Function1[/* refreshHeightOnUpdate */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of striped
  		* @param striped Boolean The new value.
  		*/
  var setStriped: js.UndefOr[js.Function1[/* striped */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useHeaders
  		* @param useHeaders Boolean The new value.
  		*/
  var setUseHeaders: js.UndefOr[js.Function1[/* useHeaders */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useSimpleItems
  		* @param useSimpleItems Boolean The new value.
  		*/
  var setUseSimpleItems: js.UndefOr[js.Function1[/* useSimpleItems */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of variableHeights
  		* @param variableHeights Boolean The new value.
  		*/
  var setVariableHeights: js.UndefOr[js.Function1[/* variableHeights */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var striped: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var useSimpleItems: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var variableHeights: js.UndefOr[scala.Boolean] = js.undefined
}

