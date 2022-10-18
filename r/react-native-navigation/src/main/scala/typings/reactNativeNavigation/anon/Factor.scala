package typings.reactNativeNavigation.anon

import typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod.Interpolation
import typings.reactNativeNavigation.reactNativeNavigationStrings.accelerate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Factor
  extends StObject
     with Interpolation {
  
  var factor: js.UndefOr[Double] = js.undefined
  
  var `type`: accelerate
}
object Factor {
  
  inline def apply(): Factor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("accelerate")
    __obj.asInstanceOf[Factor]
  }
  
  extension [Self <: Factor](x: Self) {
    
    inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setType(value: accelerate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
