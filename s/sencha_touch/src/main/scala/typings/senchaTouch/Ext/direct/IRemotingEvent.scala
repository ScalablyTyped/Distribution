package typings.senchaTouch.Ext.direct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRemotingEvent extends IEvent {
  
  /** [Method] Returns the value of tid
    * @returns Object
    */
  var getTid: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Get the transaction associated with this event
    * @returns Ext.direct.Transaction The transaction
    */
  @JSName("getTransaction")
  var getTransaction_IRemotingEvent: js.UndefOr[js.Function0[ITransaction]] = js.native
  
  /** [Method] Sets the value of tid
    * @param tid Object The new value.
    */
  var setTid: js.UndefOr[js.Function1[/* tid */ js.UndefOr[js.Any], Unit]] = js.native
}
object IRemotingEvent {
  
  @scala.inline
  def apply(): IRemotingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRemotingEvent]
  }
  
  @scala.inline
  implicit class IRemotingEventOps[Self <: IRemotingEvent] (val x: Self) extends AnyVal {
    
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
    def setGetTid(value: () => _): Self = this.set("getTid", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTid: Self = this.set("getTid", js.undefined)
    
    @scala.inline
    def setGetTransaction(value: () => ITransaction): Self = this.set("getTransaction", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTransaction: Self = this.set("getTransaction", js.undefined)
    
    @scala.inline
    def setSetTid(value: /* tid */ js.UndefOr[js.Any] => Unit): Self = this.set("setTid", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTid: Self = this.set("setTid", js.undefined)
  }
}
