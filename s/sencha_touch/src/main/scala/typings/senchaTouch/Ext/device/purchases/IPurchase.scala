package typings.senchaTouch.Ext.device.purchases

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPurchase extends IModel {
  
  /** [Method] Attempts to mark this purchase as complete
    * @param config Object
    */
  var complete: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Returns the value of fields
    * @returns Array
    */
  @JSName("getFields")
  var getFields_IPurchase: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Sets the value of fields
    * @param fields Array The new value.
    */
  @JSName("setFields")
  var setFields_IPurchase: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], Unit]] = js.native
}
object IPurchase {
  
  @scala.inline
  def apply(): IPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPurchase]
  }
  
  @scala.inline
  implicit class IPurchaseOps[Self <: IPurchase] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setGetFields(value: () => Array): Self = this.set("getFields", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFields: Self = this.set("getFields", js.undefined)
    
    @scala.inline
    def setSetFields(value: /* fields */ js.UndefOr[Array] => Unit): Self = this.set("setFields", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFields: Self = this.set("setFields", js.undefined)
  }
}
