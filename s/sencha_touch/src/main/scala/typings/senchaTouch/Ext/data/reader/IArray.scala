package typings.senchaTouch.Ext.data.reader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IArray extends IJson {
  
  /** [Method] Sets the value of successProperty
    * @param successProperty Object The new value.
    */
  @JSName("setSuccessProperty")
  var setSuccessProperty_IArray: js.UndefOr[js.Function1[/* successProperty */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of totalProperty
    * @param totalProperty Object The new value.
    */
  @JSName("setTotalProperty")
  var setTotalProperty_IArray: js.UndefOr[js.Function1[/* totalProperty */ js.UndefOr[js.Any], Unit]] = js.native
}
object IArray {
  
  @scala.inline
  def apply(): IArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArray]
  }
  
  @scala.inline
  implicit class IArrayOps[Self <: IArray] (val x: Self) extends AnyVal {
    
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
    def setSetSuccessProperty(value: /* successProperty */ js.UndefOr[js.Any] => Unit): Self = this.set("setSuccessProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSuccessProperty: Self = this.set("setSuccessProperty", js.undefined)
    
    @scala.inline
    def setSetTotalProperty(value: /* totalProperty */ js.UndefOr[js.Any] => Unit): Self = this.set("setTotalProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTotalProperty: Self = this.set("setTotalProperty", js.undefined)
  }
}
