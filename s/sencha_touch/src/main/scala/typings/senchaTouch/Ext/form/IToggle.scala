package typings.senchaTouch.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToggle
  extends typings.senchaTouch.Ext.field.ISlider {
  /** [Config Option] (String) */
  var activeLabel: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_IToggle: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of activeLabel
    * @returns String
    */
  var getActiveLabel: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of inactiveLabel
    * @returns String
    */
  var getInactiveLabel: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of maxValueCls
    * @returns String
    */
  var getMaxValueCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of minValueCls
    * @returns String
    */
  var getMinValueCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (String) */
  var inactiveLabel: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var maxValueCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var minValueCls: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of activeLabel
    * @param activeLabel String The new value.
    */
  var setActiveLabel: js.UndefOr[js.Function1[/* activeLabel */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of inactiveLabel
    * @param inactiveLabel String The new value.
    */
  var setInactiveLabel: js.UndefOr[js.Function1[/* inactiveLabel */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of maxValueCls
    * @param maxValueCls String The new value.
    */
  var setMaxValueCls: js.UndefOr[js.Function1[/* maxValueCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of minValueCls
    * @param minValueCls String The new value.
    */
  var setMinValueCls: js.UndefOr[js.Function1[/* minValueCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of the toggle
    * @param newValue Number 1 for toggled, 0 for untoggled.
    * @returns Object this
    */
  @JSName("setValue")
  var setValue_IToggle: js.UndefOr[js.Function1[/* newValue */ js.UndefOr[Double], _]] = js.undefined
  /** [Method] Toggles the value of this toggle field
    * @returns Object this
    */
  var toggle: js.UndefOr[js.Function0[_]] = js.undefined
}

object IToggle {
  @scala.inline
  def apply(
    ISlider: typings.senchaTouch.Ext.field.ISlider = null,
    activeLabel: String = null,
    cls: String = null,
    getActiveLabel: () => String = null,
    getInactiveLabel: () => String = null,
    getMaxValueCls: () => String = null,
    getMinValueCls: () => String = null,
    inactiveLabel: String = null,
    maxValueCls: String = null,
    minValueCls: String = null,
    setActiveLabel: /* activeLabel */ js.UndefOr[String] => Unit = null,
    setInactiveLabel: /* inactiveLabel */ js.UndefOr[String] => Unit = null,
    setMaxValueCls: /* maxValueCls */ js.UndefOr[String] => Unit = null,
    setMinValueCls: /* minValueCls */ js.UndefOr[String] => Unit = null,
    setValue: /* newValue */ js.UndefOr[Double] => _ = null,
    toggle: () => _ = null
  ): IToggle = {
    val __obj = js.Dynamic.literal()
    if (ISlider != null) js.Dynamic.global.Object.assign(__obj, ISlider)
    if (activeLabel != null) __obj.updateDynamic("activeLabel")(activeLabel.asInstanceOf[js.Any])
    if (cls != null) __obj.updateDynamic("cls")(cls.asInstanceOf[js.Any])
    if (getActiveLabel != null) __obj.updateDynamic("getActiveLabel")(js.Any.fromFunction0(getActiveLabel))
    if (getInactiveLabel != null) __obj.updateDynamic("getInactiveLabel")(js.Any.fromFunction0(getInactiveLabel))
    if (getMaxValueCls != null) __obj.updateDynamic("getMaxValueCls")(js.Any.fromFunction0(getMaxValueCls))
    if (getMinValueCls != null) __obj.updateDynamic("getMinValueCls")(js.Any.fromFunction0(getMinValueCls))
    if (inactiveLabel != null) __obj.updateDynamic("inactiveLabel")(inactiveLabel.asInstanceOf[js.Any])
    if (maxValueCls != null) __obj.updateDynamic("maxValueCls")(maxValueCls.asInstanceOf[js.Any])
    if (minValueCls != null) __obj.updateDynamic("minValueCls")(minValueCls.asInstanceOf[js.Any])
    if (setActiveLabel != null) __obj.updateDynamic("setActiveLabel")(js.Any.fromFunction1(setActiveLabel))
    if (setInactiveLabel != null) __obj.updateDynamic("setInactiveLabel")(js.Any.fromFunction1(setInactiveLabel))
    if (setMaxValueCls != null) __obj.updateDynamic("setMaxValueCls")(js.Any.fromFunction1(setMaxValueCls))
    if (setMinValueCls != null) __obj.updateDynamic("setMinValueCls")(js.Any.fromFunction1(setMinValueCls))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[IToggle]
  }
}

