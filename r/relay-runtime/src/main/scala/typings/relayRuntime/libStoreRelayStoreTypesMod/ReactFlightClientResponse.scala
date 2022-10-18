package typings.relayRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactFlightClientResponse extends StObject {
  
  def readRoot(): Any
}
object ReactFlightClientResponse {
  
  inline def apply(readRoot: () => Any): ReactFlightClientResponse = {
    val __obj = js.Dynamic.literal(readRoot = js.Any.fromFunction0(readRoot))
    __obj.asInstanceOf[ReactFlightClientResponse]
  }
  
  extension [Self <: ReactFlightClientResponse](x: Self) {
    
    inline def setReadRoot(value: () => Any): Self = StObject.set(x, "readRoot", js.Any.fromFunction0(value))
  }
}
