package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransactionReceipt extends js.Object {
  
  /** TransactionReceipt data */
  var data: js.UndefOr[js.Array[Uint8Array] | Null] = js.native
  
  /** TransactionReceipt events */
  var events: js.UndefOr[js.Array[IEvent] | Null] = js.native
  
  /** TransactionReceipt stateChanges */
  var stateChanges: js.UndefOr[js.Array[IStateChange] | Null] = js.native
  
  /** TransactionReceipt transactionId */
  var transactionId: js.UndefOr[String | Null] = js.native
}
object ITransactionReceipt {
  
  @scala.inline
  def apply(): ITransactionReceipt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransactionReceipt]
  }
  
  @scala.inline
  implicit class ITransactionReceiptOps[Self <: ITransactionReceipt] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: Uint8Array*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[Uint8Array]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    
    @scala.inline
    def setEventsVarargs(value: IEvent*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[IEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setEventsNull: Self = this.set("events", null)
    
    @scala.inline
    def setStateChangesVarargs(value: IStateChange*): Self = this.set("stateChanges", js.Array(value :_*))
    
    @scala.inline
    def setStateChanges(value: js.Array[IStateChange]): Self = this.set("stateChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateChanges: Self = this.set("stateChanges", js.undefined)
    
    @scala.inline
    def setStateChangesNull: Self = this.set("stateChanges", null)
    
    @scala.inline
    def setTransactionId(value: String): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionId: Self = this.set("transactionId", js.undefined)
    
    @scala.inline
    def setTransactionIdNull: Self = this.set("transactionId", null)
  }
}
