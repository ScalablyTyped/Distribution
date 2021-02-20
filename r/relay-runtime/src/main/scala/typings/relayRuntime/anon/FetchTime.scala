package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.available
import typings.relayRuntime.relayStoreTypesMod.OperationAvailability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchTime extends OperationAvailability {
  
  var fetchTime: js.UndefOr[Double | Null] = js.native
  
  var status: available = js.native
}
object FetchTime {
  
  @scala.inline
  def apply(status: available): FetchTime = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchTime]
  }
  
  @scala.inline
  implicit class FetchTimeMutableBuilder[Self <: FetchTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetchTime(value: Double): Self = StObject.set(x, "fetchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchTimeNull: Self = StObject.set(x, "fetchTime", null)
    
    @scala.inline
    def setFetchTimeUndefined: Self = StObject.set(x, "fetchTime", js.undefined)
    
    @scala.inline
    def setStatus(value: available): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
