package typings.senchaTouch.Ext.device.purchases

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISencha extends IBase {
  
  /** [Method] Checks if the current user is able to make payments
    * @param config Object
    */
  var canMakePayments: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Returns a Ext data Store instance of all purchases delivered to the current user
    * @param config Object
    */
  var getCompletedPurchases: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Returns a Ext data Store instance of all products available to purchase
    * @param config Object
    */
  var getProducts: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Returns a Ext data Store instance of all purchases the current user has been charged
    * @param config Object
    */
  var getPurchases: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}
object ISencha {
  
  @scala.inline
  def apply(): ISencha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISencha]
  }
  
  @scala.inline
  implicit class ISenchaOps[Self <: ISencha] (val x: Self) extends AnyVal {
    
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
    def setCanMakePayments(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("canMakePayments", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCanMakePayments: Self = this.set("canMakePayments", js.undefined)
    
    @scala.inline
    def setGetCompletedPurchases(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("getCompletedPurchases", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetCompletedPurchases: Self = this.set("getCompletedPurchases", js.undefined)
    
    @scala.inline
    def setGetProducts(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("getProducts", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetProducts: Self = this.set("getProducts", js.undefined)
    
    @scala.inline
    def setGetPurchases(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("getPurchases", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetPurchases: Self = this.set("getPurchases", js.undefined)
  }
}
