package typings.semanticUiNag.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'speed'> */
trait PickImplspeed extends StObject {
  
  var speed: Double
}
object PickImplspeed {
  
  inline def apply(speed: Double): PickImplspeed = {
    val __obj = js.Dynamic.literal(speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplspeed]
  }
  
  extension [Self <: PickImplspeed](x: Self) {
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
  }
}
