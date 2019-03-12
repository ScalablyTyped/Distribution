package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILegend
  extends senchaUnderscoreTouchLib.ExtNs.dataviewNs.IDataView {
  /** [Method] Returns the value of horizontalHeight
  		* @returns Number
  		*/
  var getHorizontalHeight: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of inline
  		* @returns Boolean
  		*/
  @JSName("getInline")
  var getInline_ILegend: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of itemTpl
  		* @returns Array
  		*/
  @JSName("getItemTpl")
  var getItemTpl_ILegend: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of padding
  		* @returns Number
  		*/
  @JSName("getPadding")
  var getPadding_ILegend: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of toggleable
  		* @returns Boolean
  		*/
  var getToggleable: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of verticalWidth
  		* @returns Number
  		*/
  var getVerticalWidth: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (String) */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of horizontalHeight
  		* @param horizontalHeight Number The new value.
  		*/
  var setHorizontalHeight: js.UndefOr[js.Function1[/* horizontalHeight */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of inline
  		* @param inline Boolean The new value.
  		*/
  @JSName("setInline")
  var setInline_ILegend: js.UndefOr[js.Function1[/* inline */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemTpl
  		* @param itemTpl Array The new value.
  		*/
  @JSName("setItemTpl")
  var setItemTpl_ILegend: js.UndefOr[
    js.Function1[/* itemTpl */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of padding
  		* @param padding Number The new value.
  		*/
  @JSName("setPadding")
  var setPadding_ILegend: js.UndefOr[js.Function1[/* padding */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of toggleable
  		* @param toggleable Boolean The new value.
  		*/
  var setToggleable: js.UndefOr[js.Function1[/* toggleable */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of verticalWidth
  		* @param verticalWidth Number The new value.
  		*/
  var setVerticalWidth: js.UndefOr[js.Function1[/* verticalWidth */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var toggleable: js.UndefOr[scala.Boolean] = js.undefined
}

object ILegend {
  @scala.inline
  def apply(
    IDataView: senchaUnderscoreTouchLib.ExtNs.dataviewNs.IDataView = null,
    baseCls: java.lang.String = null,
    disableSelection: js.UndefOr[scala.Boolean] = js.undefined,
    docked: java.lang.String = null,
    getBaseCls: () => java.lang.String = null,
    getDisableSelection: () => scala.Boolean = null,
    getDocked: () => java.lang.String = null,
    getHorizontalHeight: () => scala.Double = null,
    getInline: () => scala.Boolean = null,
    getItemTpl: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getPadding: () => scala.Double = null,
    getToggleable: () => scala.Boolean = null,
    getVerticalWidth: () => scala.Double = null,
    `inline`: js.Any = null,
    itemTpl: js.Any = null,
    padding: js.Any = null,
    position: java.lang.String = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setDisableSelection: /* disableSelection */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setDocked: /* docked */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setHorizontalHeight: /* horizontalHeight */ js.UndefOr[scala.Double] => scala.Unit = null,
    setInline: /* inline */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setItemTpl: /* itemTpl */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => scala.Unit = null,
    setPadding: /* padding */ js.UndefOr[scala.Double] => scala.Unit = null,
    setToggleable: /* toggleable */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setVerticalWidth: /* verticalWidth */ js.UndefOr[scala.Double] => scala.Unit = null,
    toggleable: js.UndefOr[scala.Boolean] = js.undefined
  ): ILegend = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IDataView)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (!js.isUndefined(disableSelection)) __obj.updateDynamic("disableSelection")(disableSelection)
    if (docked != null) __obj.updateDynamic("docked")(docked)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getDisableSelection != null) __obj.updateDynamic("getDisableSelection")(js.Any.fromFunction0(getDisableSelection))
    if (getDocked != null) __obj.updateDynamic("getDocked")(js.Any.fromFunction0(getDocked))
    if (getHorizontalHeight != null) __obj.updateDynamic("getHorizontalHeight")(js.Any.fromFunction0(getHorizontalHeight))
    if (getInline != null) __obj.updateDynamic("getInline")(js.Any.fromFunction0(getInline))
    if (getItemTpl != null) __obj.updateDynamic("getItemTpl")(js.Any.fromFunction0(getItemTpl))
    if (getPadding != null) __obj.updateDynamic("getPadding")(js.Any.fromFunction0(getPadding))
    if (getToggleable != null) __obj.updateDynamic("getToggleable")(js.Any.fromFunction0(getToggleable))
    if (getVerticalWidth != null) __obj.updateDynamic("getVerticalWidth")(js.Any.fromFunction0(getVerticalWidth))
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`)
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (position != null) __obj.updateDynamic("position")(position)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setDisableSelection != null) __obj.updateDynamic("setDisableSelection")(js.Any.fromFunction1(setDisableSelection))
    if (setDocked != null) __obj.updateDynamic("setDocked")(js.Any.fromFunction1(setDocked))
    if (setHorizontalHeight != null) __obj.updateDynamic("setHorizontalHeight")(js.Any.fromFunction1(setHorizontalHeight))
    if (setInline != null) __obj.updateDynamic("setInline")(js.Any.fromFunction1(setInline))
    if (setItemTpl != null) __obj.updateDynamic("setItemTpl")(js.Any.fromFunction1(setItemTpl))
    if (setPadding != null) __obj.updateDynamic("setPadding")(js.Any.fromFunction1(setPadding))
    if (setToggleable != null) __obj.updateDynamic("setToggleable")(js.Any.fromFunction1(setToggleable))
    if (setVerticalWidth != null) __obj.updateDynamic("setVerticalWidth")(js.Any.fromFunction1(setVerticalWidth))
    if (!js.isUndefined(toggleable)) __obj.updateDynamic("toggleable")(toggleable)
    __obj.asInstanceOf[ILegend]
  }
}

