package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITransactionReceipt extends StObject {
  
  /** TransactionReceipt data */
  var data: js.UndefOr[js.Array[Uint8Array] | Null] = js.undefined
  
  /** TransactionReceipt events */
  var events: js.UndefOr[js.Array[IEvent] | Null] = js.undefined
  
  /** TransactionReceipt stateChanges */
  var stateChanges: js.UndefOr[js.Array[IStateChange] | Null] = js.undefined
  
  /** TransactionReceipt transactionId */
  var transactionId: js.UndefOr[String | Null] = js.undefined
}
object ITransactionReceipt {
  
  @scala.inline
  def apply(): ITransactionReceipt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransactionReceipt]
  }
  
  @scala.inline
  implicit class ITransactionReceiptMutableBuilder[Self <: ITransactionReceipt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Uint8Array]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: Uint8Array*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[IEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsNull: Self = StObject.set(x, "events", null)
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: IEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setStateChanges(value: js.Array[IStateChange]): Self = StObject.set(x, "stateChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangesNull: Self = StObject.set(x, "stateChanges", null)
    
    @scala.inline
    def setStateChangesUndefined: Self = StObject.set(x, "stateChanges", js.undefined)
    
    @scala.inline
    def setStateChangesVarargs(value: IStateChange*): Self = StObject.set(x, "stateChanges", js.Array(value :_*))
    
    @scala.inline
    def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
