package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelayContext extends StObject {
  
  var environment: Environment
}
object RelayContext {
  
  @scala.inline
  def apply(environment: Environment): RelayContext = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayContext]
  }
  
  @scala.inline
  implicit class RelayContextMutableBuilder[Self <: RelayContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
  }
}
