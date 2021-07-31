package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorConcurrentHardware extends StObject {
  
  val hardwareConcurrency: Double
}
object NavigatorConcurrentHardware {
  
  @scala.inline
  def apply(hardwareConcurrency: Double): NavigatorConcurrentHardware = {
    val __obj = js.Dynamic.literal(hardwareConcurrency = hardwareConcurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorConcurrentHardware]
  }
  
  @scala.inline
  implicit class NavigatorConcurrentHardwareMutableBuilder[Self <: NavigatorConcurrentHardware] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHardwareConcurrency(value: Double): Self = StObject.set(x, "hardwareConcurrency", value.asInstanceOf[js.Any])
  }
}
