package typings.reactSpringCore.mod

import typings.reactSpringTypes.mod.Lookup
import typings.reactSpringTypes.mod.UnknownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  var payload: ControllerUpdate[Lookup[scala.Any], Unit]
  
  var phase: TransitionPhase
  
  var springs: SpringValues[UnknownProps]
}
object Change {
  
  inline def apply(
    payload: ControllerUpdate[Lookup[scala.Any], Unit],
    phase: TransitionPhase,
    springs: SpringValues[UnknownProps]
  ): Change = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], springs = springs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: ControllerUpdate[Lookup[scala.Any], Unit]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: TransitionPhase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setSprings(value: SpringValues[UnknownProps]): Self = StObject.set(x, "springs", value.asInstanceOf[js.Any])
  }
}
