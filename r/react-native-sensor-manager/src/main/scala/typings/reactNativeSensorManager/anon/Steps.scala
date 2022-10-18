package typings.reactNativeSensorManager.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Steps extends StObject {
  
  var steps: Double
}
object Steps {
  
  inline def apply(steps: Double): Steps = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Steps]
  }
  
  extension [Self <: Steps](x: Self) {
    
    inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
  }
}
