package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.executeDotflightDotpayload_deserialize
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.flight.payload_deserialize',   executeId :number,   operationName :string,   duration :number}> */
trait Readonlynameexecuteflight
  extends StObject
     with LogEvent {
  
  val duration: Double
  
  val executeId: Double
  
  val name: executeDotflightDotpayload_deserialize
  
  val operationName: String
}
object Readonlynameexecuteflight {
  
  inline def apply(duration: Double, executeId: Double, operationName: String): Readonlynameexecuteflight = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], executeId = executeId.asInstanceOf[js.Any], name = "execute.flight.payload_deserialize", operationName = operationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameexecuteflight]
  }
  
  extension [Self <: Readonlynameexecuteflight](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setExecuteId(value: Double): Self = StObject.set(x, "executeId", value.asInstanceOf[js.Any])
    
    inline def setName(value: executeDotflightDotpayload_deserialize): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperationName(value: String): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
  }
}
