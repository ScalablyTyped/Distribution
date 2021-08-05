package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.executeDotunsubscribe
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.unsubscribe',   transactionID :number}> */
trait Readonlynameexecuteunsubs
  extends StObject
     with LogEvent {
  
  val name: executeDotunsubscribe
  
  val transactionID: Double
}
object Readonlynameexecuteunsubs {
  
  inline def apply(transactionID: Double): Readonlynameexecuteunsubs = {
    val __obj = js.Dynamic.literal(name = "execute.unsubscribe", transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameexecuteunsubs]
  }
  
  extension [Self <: Readonlynameexecuteunsubs](x: Self) {
    
    inline def setName(value: executeDotunsubscribe): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTransactionID(value: Double): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
  }
}
