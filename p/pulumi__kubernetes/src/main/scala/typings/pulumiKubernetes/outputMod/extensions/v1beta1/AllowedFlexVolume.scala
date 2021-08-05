package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AllowedFlexVolume represents a single Flexvolume that is allowed to be used. Deprecated: use AllowedFlexVolume from policy API Group instead.
  */
trait AllowedFlexVolume extends StObject {
  
  /**
    * driver is the name of the Flexvolume driver.
    */
  var driver: String
}
object AllowedFlexVolume {
  
  inline def apply(driver: String): AllowedFlexVolume = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedFlexVolume]
  }
  
  extension [Self <: AllowedFlexVolume](x: Self) {
    
    inline def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
  }
}
