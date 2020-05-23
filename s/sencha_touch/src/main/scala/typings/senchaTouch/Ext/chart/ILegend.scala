package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.dataview.IDataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILegend extends IDataView {
  /** [Method] Returns the value of horizontalHeight
    * @returns Number
    */
  var getHorizontalHeight: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of inline
    * @returns Boolean
    */
  @JSName("getInline")
  var getInline_ILegend: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of itemTpl
    * @returns Array
    */
  @JSName("getItemTpl")
  var getItemTpl_ILegend: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of padding
    * @returns Number
    */
  @JSName("getPadding")
  var getPadding_ILegend: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of toggleable
    * @returns Boolean
    */
  var getToggleable: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of verticalWidth
    * @returns Number
    */
  var getVerticalWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of horizontalHeight
    * @param horizontalHeight Number The new value.
    */
  var setHorizontalHeight: js.UndefOr[js.Function1[/* horizontalHeight */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of inline
    * @param inline Boolean The new value.
    */
  @JSName("setInline")
  var setInline_ILegend: js.UndefOr[js.Function1[/* inline */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of itemTpl
    * @param itemTpl Array The new value.
    */
  @JSName("setItemTpl")
  var setItemTpl_ILegend: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of padding
    * @param padding Number The new value.
    */
  @JSName("setPadding")
  var setPadding_ILegend: js.UndefOr[js.Function1[/* padding */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of toggleable
    * @param toggleable Boolean The new value.
    */
  var setToggleable: js.UndefOr[js.Function1[/* toggleable */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of verticalWidth
    * @param verticalWidth Number The new value.
    */
  var setVerticalWidth: js.UndefOr[js.Function1[/* verticalWidth */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var toggleable: js.UndefOr[Boolean] = js.undefined
}

object ILegend {
  @scala.inline
  def apply(
    IDataView: IDataView = null,
    getHorizontalHeight: () => Double = null,
    getInline: () => Boolean = null,
    getItemTpl: () => Array = null,
    getPadding: () => Double = null,
    getToggleable: () => Boolean = null,
    getVerticalWidth: () => Double = null,
    position: String = null,
    setHorizontalHeight: /* horizontalHeight */ js.UndefOr[Double] => Unit = null,
    setInline: /* inline */ js.UndefOr[Boolean] => Unit = null,
    setItemTpl: /* itemTpl */ js.UndefOr[Array] => Unit = null,
    setPadding: /* padding */ js.UndefOr[Double] => Unit = null,
    setToggleable: /* toggleable */ js.UndefOr[Boolean] => Unit = null,
    setVerticalWidth: /* verticalWidth */ js.UndefOr[Double] => Unit = null,
    toggleable: js.UndefOr[Boolean] = js.undefined
  ): ILegend = {
    val __obj = js.Dynamic.literal()
    if (IDataView != null) js.Dynamic.global.Object.assign(__obj, IDataView)
    if (getHorizontalHeight != null) __obj.updateDynamic("getHorizontalHeight")(js.Any.fromFunction0(getHorizontalHeight))
    if (getInline != null) __obj.updateDynamic("getInline")(js.Any.fromFunction0(getInline))
    if (getItemTpl != null) __obj.updateDynamic("getItemTpl")(js.Any.fromFunction0(getItemTpl))
    if (getPadding != null) __obj.updateDynamic("getPadding")(js.Any.fromFunction0(getPadding))
    if (getToggleable != null) __obj.updateDynamic("getToggleable")(js.Any.fromFunction0(getToggleable))
    if (getVerticalWidth != null) __obj.updateDynamic("getVerticalWidth")(js.Any.fromFunction0(getVerticalWidth))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (setHorizontalHeight != null) __obj.updateDynamic("setHorizontalHeight")(js.Any.fromFunction1(setHorizontalHeight))
    if (setInline != null) __obj.updateDynamic("setInline")(js.Any.fromFunction1(setInline))
    if (setItemTpl != null) __obj.updateDynamic("setItemTpl")(js.Any.fromFunction1(setItemTpl))
    if (setPadding != null) __obj.updateDynamic("setPadding")(js.Any.fromFunction1(setPadding))
    if (setToggleable != null) __obj.updateDynamic("setToggleable")(js.Any.fromFunction1(setToggleable))
    if (setVerticalWidth != null) __obj.updateDynamic("setVerticalWidth")(js.Any.fromFunction1(setVerticalWidth))
    if (!js.isUndefined(toggleable)) __obj.updateDynamic("toggleable")(toggleable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILegend]
  }
}

