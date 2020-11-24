package typings.senchaTouch.Ext.fx.layout.card

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFlip extends IStyle {
  
  /** [Method] Returns the value of duration
    * @returns Number
    */
  @JSName("getDuration")
  var getDuration_IFlip: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Sets the value of duration
    * @param duration Number The new value.
    */
  @JSName("setDuration")
  var setDuration_IFlip: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.native
}
object IFlip {
  
  @scala.inline
  def apply(): IFlip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFlip]
  }
  
  @scala.inline
  implicit class IFlipOps[Self <: IFlip] (val x: Self) extends AnyVal {
    
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
    def setSetDuration(value: /* duration */ js.UndefOr[Double] => Unit): Self = this.set("setDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDuration: Self = this.set("setDuration", js.undefined)
  }
}
