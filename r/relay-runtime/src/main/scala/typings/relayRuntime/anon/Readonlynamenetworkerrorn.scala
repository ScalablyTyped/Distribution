package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typings.relayRuntime.relayRuntimeStrings.networkDoterror
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'network.error',   networkRequestId :number,   error :std.Error}> */
trait Readonlynamenetworkerrorn
  extends StObject
     with LogEvent {
  
  val error: js.Error
  
  val name: networkDoterror
  
  val networkRequestId: Double
}
object Readonlynamenetworkerrorn {
  
  inline def apply(error: js.Error, networkRequestId: Double): Readonlynamenetworkerrorn = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "network.error", networkRequestId = networkRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamenetworkerrorn]
  }
  
  extension [Self <: Readonlynamenetworkerrorn](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setName(value: networkDoterror): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNetworkRequestId(value: Double): Self = StObject.set(x, "networkRequestId", value.asInstanceOf[js.Any])
  }
}
