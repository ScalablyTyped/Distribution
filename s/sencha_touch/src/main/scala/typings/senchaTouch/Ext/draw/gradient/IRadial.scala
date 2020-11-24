package typings.senchaTouch.Ext.draw.gradient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRadial extends IGradient {
  
  /** [Config Option] (Object) */
  var end: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the value of end
    * @returns Object
    */
  var getEnd: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of start
    * @returns Object
    */
  var getStart: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Sets the value of end
    * @param end Object The new value.
    */
  var setEnd: js.UndefOr[js.Function1[/* end */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of start
    * @param start Object The new value.
    */
  var setStart: js.UndefOr[js.Function1[/* start */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Object) */
  var start: js.UndefOr[js.Any] = js.native
}
object IRadial {
  
  @scala.inline
  def apply(): IRadial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRadial]
  }
  
  @scala.inline
  implicit class IRadialOps[Self <: IRadial] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: js.Any): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setGetEnd(value: () => _): Self = this.set("getEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEnd: Self = this.set("getEnd", js.undefined)
    
    @scala.inline
    def setGetStart(value: () => _): Self = this.set("getStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStart: Self = this.set("getStart", js.undefined)
    
    @scala.inline
    def setSetEnd(value: /* end */ js.UndefOr[js.Any] => Unit): Self = this.set("setEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEnd: Self = this.set("setEnd", js.undefined)
    
    @scala.inline
    def setSetStart(value: /* start */ js.UndefOr[js.Any] => Unit): Self = this.set("setStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStart: Self = this.set("setStart", js.undefined)
    
    @scala.inline
    def setStart(value: js.Any): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
