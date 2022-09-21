package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.networkDotinfo
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'network.info',   networkRequestId :number,   info :unknown}> */
trait Readonlynamenetworkinfone
  extends StObject
     with LogEvent {
  
  val info: Any
  
  val name: networkDotinfo
  
  val networkRequestId: Double
}
object Readonlynamenetworkinfone {
  
  inline def apply(info: Any, networkRequestId: Double): Readonlynamenetworkinfone = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], name = "network.info", networkRequestId = networkRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamenetworkinfone]
  }
  
  extension [Self <: Readonlynamenetworkinfone](x: Self) {
    
    inline def setInfo(value: Any): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setName(value: networkDotinfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNetworkRequestId(value: Double): Self = StObject.set(x, "networkRequestId", value.asInstanceOf[js.Any])
  }
}
