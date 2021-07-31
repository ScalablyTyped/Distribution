package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushDeviceParameters extends StObject {
  
  var device: String
  
  var pushGateway: String
}
object PushDeviceParameters {
  
  @scala.inline
  def apply(device: String, pushGateway: String): PushDeviceParameters = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], pushGateway = pushGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushDeviceParameters]
  }
  
  @scala.inline
  implicit class PushDeviceParametersMutableBuilder[Self <: PushDeviceParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushGateway(value: String): Self = StObject.set(x, "pushGateway", value.asInstanceOf[js.Any])
  }
}
