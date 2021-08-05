package typings.reactRelay.anon

import typings.reactRelay.reactRelayStrings.reset
import typings.reactRelay.useRefetchableFragmentNodeMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment
  extends StObject
     with Action {
  
  var environment: typings.relayRuntime.relayStoreTypesMod.Environment
  
  var fragmentIdentifier: String
  
  var `type`: reset
}
object Environment {
  
  inline def apply(environment: typings.relayRuntime.relayStoreTypesMod.Environment, fragmentIdentifier: String): Environment = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reset")
    __obj.asInstanceOf[Environment]
  }
  
  extension [Self <: Environment](x: Self) {
    
    inline def setEnvironment(value: typings.relayRuntime.relayStoreTypesMod.Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setFragmentIdentifier(value: String): Self = StObject.set(x, "fragmentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setType(value: reset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
