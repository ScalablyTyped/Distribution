package typings.senchaTouch.Ext.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INumber extends IText {
  /** [Method] Returns the value of maxValue
    * @returns Number
    */
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minValue
    * @returns Number
    */
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of stepValue
    * @returns Number
    */
  var getStepValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of maxValue
    * @param maxValue Number The new value.
    */
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minValue
    * @param minValue Number The new value.
    */
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of stepValue
    * @param stepValue Number The new value.
    */
  var setStepValue: js.UndefOr[js.Function1[/* stepValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Config Option] (Number) */
  var stepValue: js.UndefOr[Double] = js.native
}

object INumber {
  @scala.inline
  def apply(): INumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INumber]
  }
  @scala.inline
  implicit class INumberOps[Self <: INumber] (val x: Self) extends AnyVal {
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
    def setGetMaxValue(value: () => Double): Self = this.set("getMaxValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaxValue: Self = this.set("getMaxValue", js.undefined)
    @scala.inline
    def setGetMinValue(value: () => Double): Self = this.set("getMinValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMinValue: Self = this.set("getMinValue", js.undefined)
    @scala.inline
    def setGetStepValue(value: () => Double): Self = this.set("getStepValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStepValue: Self = this.set("getStepValue", js.undefined)
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setSetMaxValue(value: /* maxValue */ js.UndefOr[Double] => Unit): Self = this.set("setMaxValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxValue: Self = this.set("setMaxValue", js.undefined)
    @scala.inline
    def setSetMinValue(value: /* minValue */ js.UndefOr[Double] => Unit): Self = this.set("setMinValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinValue: Self = this.set("setMinValue", js.undefined)
    @scala.inline
    def setSetStepValue(value: /* stepValue */ js.UndefOr[Double] => Unit): Self = this.set("setStepValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStepValue: Self = this.set("setStepValue", js.undefined)
    @scala.inline
    def setStepValue(value: Double): Self = this.set("stepValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepValue: Self = this.set("stepValue", js.undefined)
  }
  
}

