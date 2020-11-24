package typings.senchaTouch.Ext.fx.easing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEaseOut extends ILinear {
  
  /** [Method] Returns the value of exponent
    * @returns Number
    */
  var getExponent: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Sets the value of exponent
    * @param exponent Number The new value.
    */
  var setExponent: js.UndefOr[js.Function1[/* exponent */ js.UndefOr[Double], Unit]] = js.native
}
object IEaseOut {
  
  @scala.inline
  def apply(): IEaseOut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEaseOut]
  }
  
  @scala.inline
  implicit class IEaseOutOps[Self <: IEaseOut] (val x: Self) extends AnyVal {
    
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
    def setGetExponent(value: () => Double): Self = this.set("getExponent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetExponent: Self = this.set("getExponent", js.undefined)
    
    @scala.inline
    def setSetExponent(value: /* exponent */ js.UndefOr[Double] => Unit): Self = this.set("setExponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetExponent: Self = this.set("setExponent", js.undefined)
  }
}
