package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITransactionReceipt extends StObject {
  
  /** TransactionReceipt data */
  var data: js.UndefOr[js.Array[js.typedarray.Uint8Array] | Null] = js.undefined
  
  /** TransactionReceipt events */
  var events: js.UndefOr[js.Array[IEvent] | Null] = js.undefined
  
  /** TransactionReceipt stateChanges */
  var stateChanges: js.UndefOr[js.Array[IStateChange] | Null] = js.undefined
  
  /** TransactionReceipt transactionId */
  var transactionId: js.UndefOr[String | Null] = js.undefined
}
object ITransactionReceipt {
  
  inline def apply(): ITransactionReceipt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransactionReceipt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITransactionReceipt] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setEvents(value: js.Array[IEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsNull: Self = StObject.set(x, "events", null)
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: IEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setStateChanges(value: js.Array[IStateChange]): Self = StObject.set(x, "stateChanges", value.asInstanceOf[js.Any])
    
    inline def setStateChangesNull: Self = StObject.set(x, "stateChanges", null)
    
    inline def setStateChangesUndefined: Self = StObject.set(x, "stateChanges", js.undefined)
    
    inline def setStateChangesVarargs(value: IStateChange*): Self = StObject.set(x, "stateChanges", js.Array(value*))
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
