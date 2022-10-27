package typings.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceType extends StObject {
  
  var name: java.lang.String
  
  var ros: typings.roslib.mod.Ros
  
  var serviceType: java.lang.String
}
object ServiceType {
  
  inline def apply(name: java.lang.String, ros: typings.roslib.mod.Ros, serviceType: java.lang.String): ServiceType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceType]
  }
  
  extension [Self <: ServiceType](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRos(value: typings.roslib.mod.Ros): Self = StObject.set(x, "ros", value.asInstanceOf[js.Any])
    
    inline def setServiceType(value: java.lang.String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
  }
}
