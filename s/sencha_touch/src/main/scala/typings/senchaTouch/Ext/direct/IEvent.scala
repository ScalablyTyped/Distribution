package typings.senchaTouch.Ext.direct

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEvent extends IBase {
  
  /** [Config Option] (Object) */
  var data: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the value of code
    * @returns Object
    */
  var getCode: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of data
    * @returns Object
    */
  var getData: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of message
    * @returns String
    */
  var getMessage: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of name
    * @returns String
    */
  var getName: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of result
    * @returns Object
    */
  var getResult: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of status
    * @returns Boolean
    */
  var getStatus: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of transaction
    * @returns Object
    */
  var getTransaction: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of xhr
    * @returns Object
    */
  var getXhr: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of code
    * @param code Object The new value.
    */
  var setCode: js.UndefOr[js.Function1[/* code */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of data
    * @param data Object The new value.
    */
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of message
    * @param message String The new value.
    */
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of name
    * @param name String The new value.
    */
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of result
    * @param result Object The new value.
    */
  var setResult: js.UndefOr[js.Function1[/* result */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of status
    * @param status Boolean The new value.
    */
  var setStatus: js.UndefOr[js.Function1[/* status */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of transaction
    * @param transaction Object The new value.
    */
  var setTransaction: js.UndefOr[js.Function1[/* transaction */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of xhr
    * @param xhr Object The new value.
    */
  var setXhr: js.UndefOr[js.Function1[/* xhr */ js.UndefOr[js.Any], Unit]] = js.native
}
object IEvent {
  
  @scala.inline
  def apply(): IEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEvent]
  }
  
  @scala.inline
  implicit class IEventOps[Self <: IEvent] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setGetCode(value: () => _): Self = this.set("getCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCode: Self = this.set("getCode", js.undefined)
    
    @scala.inline
    def setGetData(value: () => _): Self = this.set("getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetData: Self = this.set("getData", js.undefined)
    
    @scala.inline
    def setGetMessage(value: () => String): Self = this.set("getMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMessage: Self = this.set("getMessage", js.undefined)
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetName: Self = this.set("getName", js.undefined)
    
    @scala.inline
    def setGetResult(value: () => _): Self = this.set("getResult", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetResult: Self = this.set("getResult", js.undefined)
    
    @scala.inline
    def setGetStatus(value: () => Boolean): Self = this.set("getStatus", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStatus: Self = this.set("getStatus", js.undefined)
    
    @scala.inline
    def setGetTransaction(value: () => _): Self = this.set("getTransaction", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTransaction: Self = this.set("getTransaction", js.undefined)
    
    @scala.inline
    def setGetXhr(value: () => _): Self = this.set("getXhr", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetXhr: Self = this.set("getXhr", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSetCode(value: /* code */ js.UndefOr[js.Any] => Unit): Self = this.set("setCode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCode: Self = this.set("setCode", js.undefined)
    
    @scala.inline
    def setSetData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetData: Self = this.set("setData", js.undefined)
    
    @scala.inline
    def setSetMessage(value: /* message */ js.UndefOr[String] => Unit): Self = this.set("setMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMessage: Self = this.set("setMessage", js.undefined)
    
    @scala.inline
    def setSetName(value: /* name */ js.UndefOr[String] => Unit): Self = this.set("setName", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetName: Self = this.set("setName", js.undefined)
    
    @scala.inline
    def setSetResult(value: /* result */ js.UndefOr[js.Any] => Unit): Self = this.set("setResult", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetResult: Self = this.set("setResult", js.undefined)
    
    @scala.inline
    def setSetStatus(value: /* status */ js.UndefOr[Boolean] => Unit): Self = this.set("setStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStatus: Self = this.set("setStatus", js.undefined)
    
    @scala.inline
    def setSetTransaction(value: /* transaction */ js.UndefOr[js.Any] => Unit): Self = this.set("setTransaction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTransaction: Self = this.set("setTransaction", js.undefined)
    
    @scala.inline
    def setSetXhr(value: /* xhr */ js.UndefOr[js.Any] => Unit): Self = this.set("setXhr", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetXhr: Self = this.set("setXhr", js.undefined)
  }
}
