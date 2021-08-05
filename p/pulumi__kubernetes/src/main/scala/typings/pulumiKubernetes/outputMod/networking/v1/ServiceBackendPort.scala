package typings.pulumiKubernetes.outputMod.networking.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceBackendPort is the service port being referenced.
  */
trait ServiceBackendPort extends StObject {
  
  /**
    * Name is the name of the port on the Service. This is a mutually exclusive setting with "Number".
    */
  var name: String
  
  /**
    * Number is the numerical port number (e.g. 80) on the Service. This is a mutually exclusive setting with "Name".
    */
  var number: Double
}
object ServiceBackendPort {
  
  inline def apply(name: String, number: Double): ServiceBackendPort = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceBackendPort]
  }
  
  extension [Self <: ServiceBackendPort](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
