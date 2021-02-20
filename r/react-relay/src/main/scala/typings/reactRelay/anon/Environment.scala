package typings.reactRelay.anon

import typings.reactRelay.reactRelayStrings.reset
import typings.reactRelay.useRefetchableFragmentNodeMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Environment extends Action {
  
  var environment: typings.relayRuntime.relayStoreTypesMod.Environment = js.native
  
  var fragmentIdentifier: String = js.native
  
  var `type`: reset = js.native
}
object Environment {
  
  @scala.inline
  def apply(
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    fragmentIdentifier: String,
    `type`: reset
  ): Environment = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: typings.relayRuntime.relayStoreTypesMod.Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentIdentifier(value: String): Self = StObject.set(x, "fragmentIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: reset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
