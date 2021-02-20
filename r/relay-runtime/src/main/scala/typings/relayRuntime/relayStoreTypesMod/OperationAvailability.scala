package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeStrings.available
import typings.relayRuntime.relayRuntimeStrings.missing
import typings.relayRuntime.relayRuntimeStrings.stale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.anon.FetchTime
  - typings.relayRuntime.anon.Status
  - typings.relayRuntime.anon.`0`
*/
trait OperationAvailability extends StObject
object OperationAvailability {
  
  @scala.inline
  def `0`(status: missing): typings.relayRuntime.anon.`0` = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.`0`]
  }
  
  @scala.inline
  def FetchTime(status: available): typings.relayRuntime.anon.FetchTime = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.FetchTime]
  }
  
  @scala.inline
  def Status(status: stale): typings.relayRuntime.anon.Status = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Status]
  }
}
