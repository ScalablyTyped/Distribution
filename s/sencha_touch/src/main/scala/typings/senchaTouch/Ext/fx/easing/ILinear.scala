package typings.senchaTouch.Ext.fx.easing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILinear extends IAbstract {
  
  /** [Method] Returns the value of duration
    * @returns Number
    */
  var getDuration: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of endValue
    * @returns Number
    */
  var getEndValue: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Sets the value of duration
    * @param duration Number The new value.
    */
  var setDuration: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of endValue
    * @param endValue Number The new value.
    */
  var setEndValue: js.UndefOr[js.Function1[/* endValue */ js.UndefOr[Double], Unit]] = js.native
}
object ILinear {
  
  @scala.inline
  def apply(): ILinear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILinear]
  }
  
  @scala.inline
  implicit class ILinearOps[Self <: ILinear] (val x: Self) extends AnyVal {
    
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
    def setGetDuration(value: () => Double): Self = this.set("getDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDuration: Self = this.set("getDuration", js.undefined)
    
    @scala.inline
    def setGetEndValue(value: () => Double): Self = this.set("getEndValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEndValue: Self = this.set("getEndValue", js.undefined)
    
    @scala.inline
    def setSetDuration(value: /* duration */ js.UndefOr[Double] => Unit): Self = this.set("setDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDuration: Self = this.set("setDuration", js.undefined)
    
    @scala.inline
    def setSetEndValue(value: /* endValue */ js.UndefOr[Double] => Unit): Self = this.set("setEndValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEndValue: Self = this.set("setEndValue", js.undefined)
  }
}
