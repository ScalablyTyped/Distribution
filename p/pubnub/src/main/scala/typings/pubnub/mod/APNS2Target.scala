package typings.pubnub.mod

import typings.pubnub.pubnubStrings.development
import typings.pubnub.pubnubStrings.production
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APNS2Target extends StObject {
  
  var environment: js.UndefOr[development | production] = js.native
  
  var excludedDevices: js.UndefOr[js.Array[String]] = js.native
  
  var topic: String = js.native
}
object APNS2Target {
  
  @scala.inline
  def apply(topic: String): APNS2Target = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNS2Target]
  }
  
  @scala.inline
  implicit class APNS2TargetMutableBuilder[Self <: APNS2Target] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: development | production): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setExcludedDevices(value: js.Array[String]): Self = StObject.set(x, "excludedDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedDevicesUndefined: Self = StObject.set(x, "excludedDevices", js.undefined)
    
    @scala.inline
    def setExcludedDevicesVarargs(value: String*): Self = StObject.set(x, "excludedDevices", js.Array(value :_*))
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
