package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetedEvent extends StObject {
  
  var target: Double
}
object TargetedEvent {
  
  inline def apply(target: Double): TargetedEvent = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedEvent]
  }
  
  extension [Self <: TargetedEvent](x: Self) {
    
    inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
