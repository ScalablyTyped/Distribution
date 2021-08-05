package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.executeDoterror
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.error',   transactionID :number,   error :std.Error}> */
trait Readonlynameexecuteerrort
  extends StObject
     with LogEvent {
  
  val error: Error
  
  val name: executeDoterror
  
  val transactionID: Double
}
object Readonlynameexecuteerrort {
  
  inline def apply(error: Error, transactionID: Double): Readonlynameexecuteerrort = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "execute.error", transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameexecuteerrort]
  }
  
  extension [Self <: Readonlynameexecuteerrort](x: Self) {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setName(value: executeDoterror): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTransactionID(value: Double): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
  }
}
