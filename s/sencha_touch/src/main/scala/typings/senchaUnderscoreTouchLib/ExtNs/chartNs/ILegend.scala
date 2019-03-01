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
    getBaseCls: js.Function0[java.lang.String] = null,
    getDisableSelection: js.Function0[scala.Boolean] = null,
    getDocked: js.Function0[java.lang.String] = null,
    getHorizontalHeight: js.Function0[scala.Double] = null,
    getInline: js.Function0[scala.Boolean] = null,
    getItemTpl: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getPadding: js.Function0[scala.Double] = null,
    getToggleable: js.Function0[scala.Boolean] = null,
    getVerticalWidth: js.Function0[scala.Double] = null,
    `inline`: js.Any = null,
    itemTpl: js.Any = null,
    padding: js.Any = null,
    position: java.lang.String = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDisableSelection: js.Function1[/* disableSelection */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setDocked: js.Function1[/* docked */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setHorizontalHeight: js.Function1[/* horizontalHeight */ js.UndefOr[scala.Double], scala.Unit] = null,
    setInline: js.Function1[/* inline */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setItemTpl: js.Function1[/* itemTpl */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setPadding: js.Function1[/* padding */ js.UndefOr[scala.Double], scala.Unit] = null,
    setToggleable: js.Function1[/* toggleable */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setVerticalWidth: js.Function1[/* verticalWidth */ js.UndefOr[scala.Double], scala.Unit] = null,
    toggleable: js.UndefOr[scala.Boolean] = js.undefined
  ): ILegend = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IDataView)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (!js.isUndefined(disableSelection)) __obj.updateDynamic("disableSelection")(disableSelection)
    if (docked != null) __obj.updateDynamic("docked")(docked)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getDisableSelection != null) __obj.updateDynamic("getDisableSelection")(getDisableSelection)
    if (getDocked != null) __obj.updateDynamic("getDocked")(getDocked)
    if (getHorizontalHeight != null) __obj.updateDynamic("getHorizontalHeight")(getHorizontalHeight)
    if (getInline != null) __obj.updateDynamic("getInline")(getInline)
    if (getItemTpl != null) __obj.updateDynamic("getItemTpl")(getItemTpl)
    if (getPadding != null) __obj.updateDynamic("getPadding")(getPadding)
    if (getToggleable != null) __obj.updateDynamic("getToggleable")(getToggleable)
    if (getVerticalWidth != null) __obj.updateDynamic("getVerticalWidth")(getVerticalWidth)
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`)
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (position != null) __obj.updateDynamic("position")(position)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setDisableSelection != null) __obj.updateDynamic("setDisableSelection")(setDisableSelection)
    if (setDocked != null) __obj.updateDynamic("setDocked")(setDocked)
    if (setHorizontalHeight != null) __obj.updateDynamic("setHorizontalHeight")(setHorizontalHeight)
    if (setInline != null) __obj.updateDynamic("setInline")(setInline)
    if (setItemTpl != null) __obj.updateDynamic("setItemTpl")(setItemTpl)
    if (setPadding != null) __obj.updateDynamic("setPadding")(setPadding)
    if (setToggleable != null) __obj.updateDynamic("setToggleable")(setToggleable)
    if (setVerticalWidth != null) __obj.updateDynamic("setVerticalWidth")(setVerticalWidth)
    if (!js.isUndefined(toggleable)) __obj.updateDynamic("toggleable")(toggleable)
    __obj.asInstanceOf[ILegend]
  }
}

