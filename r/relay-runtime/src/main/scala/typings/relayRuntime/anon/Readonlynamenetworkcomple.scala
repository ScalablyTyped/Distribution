package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typings.relayRuntime.relayRuntimeStrings.networkDotcomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'network.complete',   networkRequestId :number}> */
trait Readonlynamenetworkcomple
  extends StObject
     with LogEvent {
  
  val name: networkDotcomplete
  
  val networkRequestId: Double
}
object Readonlynamenetworkcomple {
  
  inline def apply(networkRequestId: Double): Readonlynamenetworkcomple = {
    val __obj = js.Dynamic.literal(name = "network.complete", networkRequestId = networkRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamenetworkcomple]
  }
  
  extension [Self <: Readonlynamenetworkcomple](x: Self) {
    
    inline def setName(value: networkDotcomplete): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNetworkRequestId(value: Double): Self = StObject.set(x, "networkRequestId", value.asInstanceOf[js.Any])
  }
}
