package typings.senchaTouch.Ext.chart.axis.segmenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITime extends ISegmenter {
  /** [Method] Add step units to the value
    * @param value Object
    * @param step Object
    * @param unit Object
    */
  @JSName("add")
  var add_ITime: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[js.Any], 
      /* unit */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Align value with step of units
    * @param date Object
    * @param step Object
    * @param unit Object
    * @returns * Aligned value.
    */
  @JSName("align")
  var align_ITime: js.UndefOr[
    js.Function3[
      /* date */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[js.Any], 
      /* unit */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Method] Returns the value of step
    * @returns Object
    */
  var getStep: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of step
    * @param step Object The new value.
    */
  var setStep: js.UndefOr[js.Function1[/* step */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var step: js.UndefOr[js.Any] = js.native
}

object ITime {
  @scala.inline
  def apply(): ITime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITime]
  }
  @scala.inline
  implicit class ITimeOps[Self <: ITime] (val x: Self) extends AnyVal {
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
    def setAdd(
      value: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[js.Any], /* unit */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("add", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setAlign(
      value: (/* date */ js.UndefOr[js.Any], /* step */ js.UndefOr[js.Any], /* unit */ js.UndefOr[js.Any]) => _
    ): Self = this.set("align", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setGetStep(value: () => _): Self = this.set("getStep", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStep: Self = this.set("getStep", js.undefined)
    @scala.inline
    def setSetStep(value: /* step */ js.UndefOr[js.Any] => Unit): Self = this.set("setStep", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStep: Self = this.set("setStep", js.undefined)
    @scala.inline
    def setStep(value: js.Any): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
  
}

