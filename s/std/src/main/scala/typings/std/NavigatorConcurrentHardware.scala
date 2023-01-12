package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorConcurrentHardware extends StObject {
  
  /* standard dom */
  val hardwareConcurrency: Double
}
object NavigatorConcurrentHardware {
  
  inline def apply(hardwareConcurrency: Double): NavigatorConcurrentHardware = {
    val __obj = js.Dynamic.literal(hardwareConcurrency = hardwareConcurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorConcurrentHardware]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigatorConcurrentHardware] (val x: Self) extends AnyVal {
    
    inline def setHardwareConcurrency(value: Double): Self = StObject.set(x, "hardwareConcurrency", value.asInstanceOf[js.Any])
  }
}
