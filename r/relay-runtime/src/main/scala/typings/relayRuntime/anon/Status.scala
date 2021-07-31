package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.stale
import typings.relayRuntime.relayStoreTypesMod.OperationAvailability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status
  extends StObject
     with OperationAvailability {
  
  var status: stale
}
object Status {
  
  @scala.inline
  def apply(): Status = {
    val __obj = js.Dynamic.literal(status = "stale")
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: stale): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
