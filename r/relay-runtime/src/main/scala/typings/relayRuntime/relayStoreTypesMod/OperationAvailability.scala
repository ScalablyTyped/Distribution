package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.anon.FetchTime
  - typings.relayRuntime.anon.Status
  - typings.relayRuntime.anon.`0`
*/
trait OperationAvailability extends StObject
object OperationAvailability {
  
  inline def `0`(): typings.relayRuntime.anon.`0` = {
    val __obj = js.Dynamic.literal(status = "missing")
    __obj.asInstanceOf[typings.relayRuntime.anon.`0`]
  }
  
  inline def FetchTime(): typings.relayRuntime.anon.FetchTime = {
    val __obj = js.Dynamic.literal(status = "available")
    __obj.asInstanceOf[typings.relayRuntime.anon.FetchTime]
  }
  
  inline def Status(): typings.relayRuntime.anon.Status = {
    val __obj = js.Dynamic.literal(status = "stale")
    __obj.asInstanceOf[typings.relayRuntime.anon.Status]
  }
}
