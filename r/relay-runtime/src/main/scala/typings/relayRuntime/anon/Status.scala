package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.OperationAvailability
import typings.relayRuntime.relayRuntimeStrings.stale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status
  extends StObject
     with OperationAvailability {
  
  var status: stale
}
object Status {
  
  inline def apply(): Status = {
    val __obj = js.Dynamic.literal(status = "stale")
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setStatus(value: stale): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
