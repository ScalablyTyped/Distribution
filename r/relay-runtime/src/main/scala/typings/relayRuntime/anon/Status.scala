package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.stale
import typings.relayRuntime.relayStoreTypesMod.OperationAvailability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Status extends OperationAvailability {
  
  var status: stale = js.native
}
object Status {
  
  @scala.inline
  def apply(status: stale): Status = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: stale): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
