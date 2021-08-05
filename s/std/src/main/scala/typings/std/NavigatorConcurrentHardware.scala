package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorConcurrentHardware extends StObject {
  
  val hardwareConcurrency: Double
}
object NavigatorConcurrentHardware {
  
  inline def apply(hardwareConcurrency: Double): NavigatorConcurrentHardware = {
    val __obj = js.Dynamic.literal(hardwareConcurrency = hardwareConcurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorConcurrentHardware]
  }
  
  extension [Self <: NavigatorConcurrentHardware](x: Self) {
    
    inline def setHardwareConcurrency(value: Double): Self = StObject.set(x, "hardwareConcurrency", value.asInstanceOf[js.Any])
  }
}
