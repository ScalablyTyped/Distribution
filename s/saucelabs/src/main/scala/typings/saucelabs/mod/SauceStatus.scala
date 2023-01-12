package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SauceStatus
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var service_operational: js.UndefOr[Boolean] = js.undefined
  
  var status_message: js.UndefOr[String] = js.undefined
  
  var wait_time: js.UndefOr[Double] = js.undefined
}
object SauceStatus {
  
  inline def apply(): SauceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SauceStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SauceStatus] (val x: Self) extends AnyVal {
    
    inline def setService_operational(value: Boolean): Self = StObject.set(x, "service_operational", value.asInstanceOf[js.Any])
    
    inline def setService_operationalUndefined: Self = StObject.set(x, "service_operational", js.undefined)
    
    inline def setStatus_message(value: String): Self = StObject.set(x, "status_message", value.asInstanceOf[js.Any])
    
    inline def setStatus_messageUndefined: Self = StObject.set(x, "status_message", js.undefined)
    
    inline def setWait_time(value: Double): Self = StObject.set(x, "wait_time", value.asInstanceOf[js.Any])
    
    inline def setWait_timeUndefined: Self = StObject.set(x, "wait_time", js.undefined)
  }
}
