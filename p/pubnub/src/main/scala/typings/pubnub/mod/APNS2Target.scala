package typings.pubnub.mod

import typings.pubnub.pubnubStrings.development
import typings.pubnub.pubnubStrings.production
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APNS2Target extends StObject {
  
  var environment: js.UndefOr[development | production] = js.undefined
  
  var excludedDevices: js.UndefOr[js.Array[String]] = js.undefined
  
  var topic: String
}
object APNS2Target {
  
  inline def apply(topic: String): APNS2Target = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNS2Target]
  }
  
  extension [Self <: APNS2Target](x: Self) {
    
    inline def setEnvironment(value: development | production): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setExcludedDevices(value: js.Array[String]): Self = StObject.set(x, "excludedDevices", value.asInstanceOf[js.Any])
    
    inline def setExcludedDevicesUndefined: Self = StObject.set(x, "excludedDevices", js.undefined)
    
    inline def setExcludedDevicesVarargs(value: String*): Self = StObject.set(x, "excludedDevices", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
