package typings.reactNativeSensorManager.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Light extends StObject {
  
  var light: Double
}
object Light {
  
  inline def apply(light: Double): Light = {
    val __obj = js.Dynamic.literal(light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Light]
  }
  
  extension [Self <: Light](x: Self) {
    
    inline def setLight(value: Double): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
