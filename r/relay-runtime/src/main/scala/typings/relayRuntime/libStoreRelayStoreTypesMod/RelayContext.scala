package typings.relayRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelayContext extends StObject {
  
  var environment: Environment
}
object RelayContext {
  
  inline def apply(environment: Environment): RelayContext = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayContext]
  }
  
  extension [Self <: RelayContext](x: Self) {
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
  }
}
