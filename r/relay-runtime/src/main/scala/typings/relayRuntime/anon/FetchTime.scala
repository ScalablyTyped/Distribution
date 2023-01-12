package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.OperationAvailability
import typings.relayRuntime.relayRuntimeStrings.available
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchTime
  extends StObject
     with OperationAvailability {
  
  var fetchTime: js.UndefOr[Double | Null] = js.undefined
  
  var status: available
}
object FetchTime {
  
  inline def apply(): FetchTime = {
    val __obj = js.Dynamic.literal(status = "available")
    __obj.asInstanceOf[FetchTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchTime] (val x: Self) extends AnyVal {
    
    inline def setFetchTime(value: Double): Self = StObject.set(x, "fetchTime", value.asInstanceOf[js.Any])
    
    inline def setFetchTimeNull: Self = StObject.set(x, "fetchTime", null)
    
    inline def setFetchTimeUndefined: Self = StObject.set(x, "fetchTime", js.undefined)
    
    inline def setStatus(value: available): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
