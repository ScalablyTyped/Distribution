package typings.senchaTouch.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISlider
  extends typings.senchaTouch.Ext.field.IField {
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_ISlider: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of increment
    * @returns Number
    */
  var getIncrement: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of maxValue
    * @returns Number
    */
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minValue
    * @returns Number
    */
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of readOnly
    * @returns Boolean
    */
  var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Convenience method
    * @returns Object
    */
  var getValues: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** [Method] Resets the current field value back to the original value on this field when it was created
    * @returns Ext.field.Field this
    */
  @JSName("reset")
  var reset_ISlider: js.UndefOr[js.Function0[typings.senchaTouch.Ext.field.IField]] = js.native
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_ISlider: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of increment
    * @param increment Number The new value.
    */
  var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of maxValue
    * @param maxValue Number The new value.
    */
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minValue
    * @param minValue Number The new value.
    */
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of readOnly
    * @param readOnly Boolean The new value.
    */
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of tabIndex
    * @param tabIndex Object The new value.
    */
  @JSName("setTabIndex")
  var setTabIndex_ISlider: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Convenience method
    * @param value Object
    */
  var setValues: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number/Number[]) */
  var values: js.UndefOr[js.Any] = js.native
}

object ISlider {
  @scala.inline
  def apply(): ISlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISlider]
  }
  @scala.inline
  implicit class ISliderOps[Self <: ISlider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetCls(value: () => String): Self = this.set("getCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCls: Self = this.set("getCls", js.undefined)
    @scala.inline
    def setGetIncrement(value: () => Double): Self = this.set("getIncrement", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetIncrement: Self = this.set("getIncrement", js.undefined)
    @scala.inline
    def setGetMaxValue(value: () => Double): Self = this.set("getMaxValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaxValue: Self = this.set("getMaxValue", js.undefined)
    @scala.inline
    def setGetMinValue(value: () => Double): Self = this.set("getMinValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMinValue: Self = this.set("getMinValue", js.undefined)
    @scala.inline
    def setGetReadOnly(value: () => Boolean): Self = this.set("getReadOnly", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetReadOnly: Self = this.set("getReadOnly", js.undefined)
    @scala.inline
    def setGetValues(value: () => _): Self = this.set("getValues", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetValues: Self = this.set("getValues", js.undefined)
    @scala.inline
    def setIncrement(value: Double): Self = this.set("increment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncrement: Self = this.set("increment", js.undefined)
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setReset(value: () => typings.senchaTouch.Ext.field.IField): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = this.set("setCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCls: Self = this.set("setCls", js.undefined)
    @scala.inline
    def setSetIncrement(value: /* increment */ js.UndefOr[Double] => Unit): Self = this.set("setIncrement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIncrement: Self = this.set("setIncrement", js.undefined)
    @scala.inline
    def setSetMaxValue(value: /* maxValue */ js.UndefOr[Double] => Unit): Self = this.set("setMaxValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxValue: Self = this.set("setMaxValue", js.undefined)
    @scala.inline
    def setSetMinValue(value: /* minValue */ js.UndefOr[Double] => Unit): Self = this.set("setMinValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinValue: Self = this.set("setMinValue", js.undefined)
    @scala.inline
    def setSetReadOnly(value: /* readOnly */ js.UndefOr[Boolean] => Unit): Self = this.set("setReadOnly", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetReadOnly: Self = this.set("setReadOnly", js.undefined)
    @scala.inline
    def setSetTabIndex(value: /* tabIndex */ js.UndefOr[js.Any] => Unit): Self = this.set("setTabIndex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTabIndex: Self = this.set("setTabIndex", js.undefined)
    @scala.inline
    def setSetValues(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("setValues", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetValues: Self = this.set("setValues", js.undefined)
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

