package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodDNSConfigOption defines DNS resolver options of a pod.
  */
trait PodDNSConfigOption extends StObject {
  
  /**
    * Required.
    */
  var name: String
  
  var value: String
}
object PodDNSConfigOption {
  
  inline def apply(name: String, value: String): PodDNSConfigOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodDNSConfigOption]
  }
  
  extension [Self <: PodDNSConfigOption](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
