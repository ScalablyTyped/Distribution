package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typings.relayRuntime.relayRuntimeStrings.executeDoterror
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.error',   executeId :number,   error :std.Error}> */
trait Readonlynameexecuteerrore
  extends StObject
     with LogEvent {
  
  val error: js.Error
  
  val executeId: Double
  
  val name: executeDoterror
}
object Readonlynameexecuteerrore {
  
  inline def apply(error: js.Error, executeId: Double): Readonlynameexecuteerrore = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], executeId = executeId.asInstanceOf[js.Any], name = "execute.error")
    __obj.asInstanceOf[Readonlynameexecuteerrore]
  }
  
  extension [Self <: Readonlynameexecuteerrore](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setExecuteId(value: Double): Self = StObject.set(x, "executeId", value.asInstanceOf[js.Any])
    
    inline def setName(value: executeDoterror): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
