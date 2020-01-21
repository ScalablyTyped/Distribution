package typings.senchaTouch.Ext.slider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToggle extends ISlider {
  /** [Method] Sets the increment configuration
  		* @returns Number
  		*/
  @JSName("applyIncrement")
  var applyIncrement_IToggle: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of maxValueCls
  		* @returns String
  		*/
  var getMaxValueCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of minValueCls
  		* @returns String
  		*/
  var getMinValueCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (String) */
  var maxValueCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var minValueCls: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of maxValueCls
  		* @param maxValueCls String The new value.
  		*/
  var setMaxValueCls: js.UndefOr[js.Function1[/* maxValueCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of minValueCls
  		* @param minValueCls String The new value.
  		*/
  var setMinValueCls: js.UndefOr[js.Function1[/* minValueCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of value
  		* @param newValue Object
  		* @param oldValue Object
  		*/
  @JSName("setValue")
  var setValue_IToggle: js.UndefOr[
    js.Function2[/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
}

object IToggle {
  @scala.inline
  def apply(
    ISlider: ISlider = null,
    applyIncrement: () => Double = null,
    getMaxValueCls: () => String = null,
    getMinValueCls: () => String = null,
    maxValueCls: String = null,
    minValueCls: String = null,
    setMaxValueCls: /* maxValueCls */ js.UndefOr[String] => Unit = null,
    setMinValueCls: /* minValueCls */ js.UndefOr[String] => Unit = null,
    setValue: (/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any]) => Unit = null
  ): IToggle = {
    val __obj = js.Dynamic.literal()
    if (ISlider != null) js.Dynamic.global.Object.assign(__obj, ISlider)
    if (applyIncrement != null) __obj.updateDynamic("applyIncrement")(js.Any.fromFunction0(applyIncrement))
    if (getMaxValueCls != null) __obj.updateDynamic("getMaxValueCls")(js.Any.fromFunction0(getMaxValueCls))
    if (getMinValueCls != null) __obj.updateDynamic("getMinValueCls")(js.Any.fromFunction0(getMinValueCls))
    if (maxValueCls != null) __obj.updateDynamic("maxValueCls")(maxValueCls.asInstanceOf[js.Any])
    if (minValueCls != null) __obj.updateDynamic("minValueCls")(minValueCls.asInstanceOf[js.Any])
    if (setMaxValueCls != null) __obj.updateDynamic("setMaxValueCls")(js.Any.fromFunction1(setMaxValueCls))
    if (setMinValueCls != null) __obj.updateDynamic("setMinValueCls")(js.Any.fromFunction1(setMinValueCls))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[IToggle]
  }
}

