package typings.senchaTouch.Ext.direct

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransaction extends IBase {
  
  /** [Method] Returns the value of action
    * @returns Object
    */
  var getAction: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of args
    * @returns Object
    */
  var getArgs: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of callback
    * @returns Object
    */
  var getCallback: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of data
    * @returns Object
    */
  var getData: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of form
    * @returns Object
    */
  var getForm: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of id
    * @returns Object
    */
  var getId: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of method
    * @returns Object
    */
  var getMethod: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of provider
    * @returns Object
    */
  var getProvider: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of retryCount
    * @returns Number
    */
  var getRetryCount: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Sets the value of action
    * @param action Object The new value.
    */
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of args
    * @param args Object The new value.
    */
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of callback
    * @param callback Object The new value.
    */
  var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of data
    * @param data Object The new value.
    */
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of form
    * @param form Object The new value.
    */
  var setForm: js.UndefOr[js.Function1[/* form */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of id
    * @param id Object The new value.
    */
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of method
    * @param method Object The new value.
    */
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of provider
    * @param provider Object The new value.
    */
  var setProvider: js.UndefOr[js.Function1[/* provider */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of retryCount
    * @param retryCount Number The new value.
    */
  var setRetryCount: js.UndefOr[js.Function1[/* retryCount */ js.UndefOr[Double], Unit]] = js.native
}
object ITransaction {
  
  @scala.inline
  def apply(): ITransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransaction]
  }
  
  @scala.inline
  implicit class ITransactionOps[Self <: ITransaction] (val x: Self) extends AnyVal {
    
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
    def setGetAction(value: () => _): Self = this.set("getAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAction: Self = this.set("getAction", js.undefined)
    
    @scala.inline
    def setGetArgs(value: () => _): Self = this.set("getArgs", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetArgs: Self = this.set("getArgs", js.undefined)
    
    @scala.inline
    def setGetCallback(value: () => _): Self = this.set("getCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCallback: Self = this.set("getCallback", js.undefined)
    
    @scala.inline
    def setGetData(value: () => _): Self = this.set("getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetData: Self = this.set("getData", js.undefined)
    
    @scala.inline
    def setGetForm(value: () => _): Self = this.set("getForm", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetForm: Self = this.set("getForm", js.undefined)
    
    @scala.inline
    def setGetId(value: () => _): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetId: Self = this.set("getId", js.undefined)
    
    @scala.inline
    def setGetMethod(value: () => _): Self = this.set("getMethod", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMethod: Self = this.set("getMethod", js.undefined)
    
    @scala.inline
    def setGetProvider(value: () => _): Self = this.set("getProvider", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetProvider: Self = this.set("getProvider", js.undefined)
    
    @scala.inline
    def setGetRetryCount(value: () => Double): Self = this.set("getRetryCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRetryCount: Self = this.set("getRetryCount", js.undefined)
    
    @scala.inline
    def setSetAction(value: /* action */ js.UndefOr[js.Any] => Unit): Self = this.set("setAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAction: Self = this.set("setAction", js.undefined)
    
    @scala.inline
    def setSetArgs(value: /* args */ js.UndefOr[js.Any] => Unit): Self = this.set("setArgs", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetArgs: Self = this.set("setArgs", js.undefined)
    
    @scala.inline
    def setSetCallback(value: /* callback */ js.UndefOr[js.Any] => Unit): Self = this.set("setCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCallback: Self = this.set("setCallback", js.undefined)
    
    @scala.inline
    def setSetData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetData: Self = this.set("setData", js.undefined)
    
    @scala.inline
    def setSetForm(value: /* form */ js.UndefOr[js.Any] => Unit): Self = this.set("setForm", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetForm: Self = this.set("setForm", js.undefined)
    
    @scala.inline
    def setSetId(value: /* id */ js.UndefOr[js.Any] => Unit): Self = this.set("setId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetId: Self = this.set("setId", js.undefined)
    
    @scala.inline
    def setSetMethod(value: /* method */ js.UndefOr[js.Any] => Unit): Self = this.set("setMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMethod: Self = this.set("setMethod", js.undefined)
    
    @scala.inline
    def setSetProvider(value: /* provider */ js.UndefOr[js.Any] => Unit): Self = this.set("setProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetProvider: Self = this.set("setProvider", js.undefined)
    
    @scala.inline
    def setSetRetryCount(value: /* retryCount */ js.UndefOr[Double] => Unit): Self = this.set("setRetryCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRetryCount: Self = this.set("setRetryCount", js.undefined)
  }
}
