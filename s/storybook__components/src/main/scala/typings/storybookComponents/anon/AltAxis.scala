package typings.storybookComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AltAxis extends StObject {
  
  var altAxis: Double
  
  var mainAxis: Double
}
object AltAxis {
  
  inline def apply(altAxis: Double, mainAxis: Double): AltAxis = {
    val __obj = js.Dynamic.literal(altAxis = altAxis.asInstanceOf[js.Any], mainAxis = mainAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltAxis]
  }
  
  extension [Self <: AltAxis](x: Self) {
    
    inline def setAltAxis(value: Double): Self = StObject.set(x, "altAxis", value.asInstanceOf[js.Any])
    
    inline def setMainAxis(value: Double): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
  }
}
