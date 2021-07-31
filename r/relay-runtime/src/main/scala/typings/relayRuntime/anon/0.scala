package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.missing
import typings.relayRuntime.relayStoreTypesMod.OperationAvailability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with OperationAvailability {
  
  var status: missing
}
object `0` {
  
  @scala.inline
  def apply(): `0` = {
    val __obj = js.Dynamic.literal(status = "missing")
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: missing): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
