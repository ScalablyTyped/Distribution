package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typings.relayRuntime.relayRuntimeStrings.networkDotunsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'network.unsubscribe',   networkRequestId :number}> */
trait Readonlynamenetworkunsubs
  extends StObject
     with LogEvent {
  
  val name: networkDotunsubscribe
  
  val networkRequestId: Double
}
object Readonlynamenetworkunsubs {
  
  inline def apply(networkRequestId: Double): Readonlynamenetworkunsubs = {
    val __obj = js.Dynamic.literal(name = "network.unsubscribe", networkRequestId = networkRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamenetworkunsubs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonlynamenetworkunsubs] (val x: Self) extends AnyVal {
    
    inline def setName(value: networkDotunsubscribe): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNetworkRequestId(value: Double): Self = StObject.set(x, "networkRequestId", value.asInstanceOf[js.Any])
  }
}
