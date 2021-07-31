package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecListenerTimeoutGrpcIdle extends StObject {
  
  /**
    * The unit of time. Valid values: `ms`, `s`.
    */
  var unit: String
  
  /**
    * The number of time units. Minimum value of `0`.
    */
  var value: Double
}
object VirtualNodeSpecListenerTimeoutGrpcIdle {
  
  @scala.inline
  def apply(unit: String, value: Double): VirtualNodeSpecListenerTimeoutGrpcIdle = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecListenerTimeoutGrpcIdle]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerTimeoutGrpcIdleMutableBuilder[Self <: VirtualNodeSpecListenerTimeoutGrpcIdle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
