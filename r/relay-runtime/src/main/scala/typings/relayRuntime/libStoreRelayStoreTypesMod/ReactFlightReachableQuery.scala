package typings.relayRuntime.libStoreRelayStoreTypesMod

import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactFlightReachableQuery extends StObject {
  
  val module: Any
  
  val variables: Variables
}
object ReactFlightReachableQuery {
  
  inline def apply(module: Any, variables: Variables): ReactFlightReachableQuery = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactFlightReachableQuery]
  }
  
  extension [Self <: ReactFlightReachableQuery](x: Self) {
    
    inline def setModule(value: Any): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
