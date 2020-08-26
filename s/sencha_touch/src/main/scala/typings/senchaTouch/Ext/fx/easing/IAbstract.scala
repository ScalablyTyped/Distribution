package typings.senchaTouch.Ext.fx.easing

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IBase {
  /** [Method] Returns the value of startTime
    * @returns Number
    */
  var getStartTime: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of startValue
    * @returns Number
    */
  var getStartValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Sets the value of startTime
    * @param startTime Number The new value.
    */
  var setStartTime: js.UndefOr[js.Function1[/* startTime */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of startValue
    * @param startValue Number The new value.
    */
  var setStartValue: js.UndefOr[js.Function1[/* startValue */ js.UndefOr[Double], Unit]] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
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
    def setGetStartTime(value: () => Double): Self = this.set("getStartTime", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStartTime: Self = this.set("getStartTime", js.undefined)
    @scala.inline
    def setGetStartValue(value: () => Double): Self = this.set("getStartValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStartValue: Self = this.set("getStartValue", js.undefined)
    @scala.inline
    def setSetStartTime(value: /* startTime */ js.UndefOr[Double] => Unit): Self = this.set("setStartTime", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStartTime: Self = this.set("setStartTime", js.undefined)
    @scala.inline
    def setSetStartValue(value: /* startValue */ js.UndefOr[Double] => Unit): Self = this.set("setStartValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStartValue: Self = this.set("setStartValue", js.undefined)
  }
  
}

