package typings.senchaTouch.Ext.chart.axis

import typings.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITime extends INumeric {
  
  /** [Config Option] (Boolean) */
  var calculateByLabelSize: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String/Boolean) */
  var dateFormat: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Date) */
  var fromDate: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the value of calculateByLabelSize
    * @returns Boolean
    */
  var getCalculateByLabelSize: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Mapping data value into coordinate
    * @param value Object
    * @returns Number
    */
  @JSName("getCoordFor")
  var getCoordFor_ITime: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Double]] = js.native
  
  /** [Method] Returns the value of dateFormat
    * @returns String/Boolean
    */
  var getDateFormat: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of fromDate
    * @returns Date
    */
  var getFromDate: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of step
    * @returns Array
    */
  var getStep: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the value of toDate
    * @returns Date
    */
  var getToDate: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Sets the value of calculateByLabelSize
    * @param calculateByLabelSize Boolean The new value.
    */
  var setCalculateByLabelSize: js.UndefOr[js.Function1[/* calculateByLabelSize */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of dateFormat
    * @param dateFormat String/Boolean The new value.
    */
  var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of fromDate
    * @param fromDate Date The new value.
    */
  var setFromDate: js.UndefOr[js.Function1[/* fromDate */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of step
    * @param step Array The new value.
    */
  var setStep: js.UndefOr[js.Function1[/* step */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Method] Sets the value of toDate
    * @param toDate Date The new value.
    */
  var setToDate: js.UndefOr[js.Function1[/* toDate */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Array) */
  var step: js.UndefOr[Array] = js.native
  
  /** [Config Option] (Date) */
  var toDate: js.UndefOr[js.Any] = js.native
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
    def setCalculateByLabelSize(value: Boolean): Self = this.set("calculateByLabelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculateByLabelSize: Self = this.set("calculateByLabelSize", js.undefined)
    
    @scala.inline
    def setDateFormat(value: js.Any): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setFromDate(value: js.Any): Self = this.set("fromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromDate: Self = this.set("fromDate", js.undefined)
    
    @scala.inline
    def setGetCalculateByLabelSize(value: () => Boolean): Self = this.set("getCalculateByLabelSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCalculateByLabelSize: Self = this.set("getCalculateByLabelSize", js.undefined)
    
    @scala.inline
    def setGetCoordFor(value: /* value */ js.UndefOr[js.Any] => Double): Self = this.set("getCoordFor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetCoordFor: Self = this.set("getCoordFor", js.undefined)
    
    @scala.inline
    def setGetDateFormat(value: () => _): Self = this.set("getDateFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDateFormat: Self = this.set("getDateFormat", js.undefined)
    
    @scala.inline
    def setGetFromDate(value: () => _): Self = this.set("getFromDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFromDate: Self = this.set("getFromDate", js.undefined)
    
    @scala.inline
    def setGetStep(value: () => Array): Self = this.set("getStep", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStep: Self = this.set("getStep", js.undefined)
    
    @scala.inline
    def setGetToDate(value: () => _): Self = this.set("getToDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetToDate: Self = this.set("getToDate", js.undefined)
    
    @scala.inline
    def setSetCalculateByLabelSize(value: /* calculateByLabelSize */ js.UndefOr[Boolean] => Unit): Self = this.set("setCalculateByLabelSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCalculateByLabelSize: Self = this.set("setCalculateByLabelSize", js.undefined)
    
    @scala.inline
    def setSetDateFormat(value: /* dateFormat */ js.UndefOr[js.Any] => Unit): Self = this.set("setDateFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDateFormat: Self = this.set("setDateFormat", js.undefined)
    
    @scala.inline
    def setSetFromDate(value: /* fromDate */ js.UndefOr[js.Any] => Unit): Self = this.set("setFromDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFromDate: Self = this.set("setFromDate", js.undefined)
    
    @scala.inline
    def setSetStep(value: /* step */ js.UndefOr[Array] => Unit): Self = this.set("setStep", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStep: Self = this.set("setStep", js.undefined)
    
    @scala.inline
    def setSetToDate(value: /* toDate */ js.UndefOr[js.Any] => Unit): Self = this.set("setToDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetToDate: Self = this.set("setToDate", js.undefined)
    
    @scala.inline
    def setStep(value: Array): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setToDate(value: js.Any): Self = this.set("toDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToDate: Self = this.set("toDate", js.undefined)
  }
}
