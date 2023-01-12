package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.OperationAvailability
import typings.relayRuntime.relayRuntimeStrings.missing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with OperationAvailability {
  
  var status: missing
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(status = "missing")
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: missing): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
