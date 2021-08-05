package typings.reactOnsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifiersNumber extends StObject {
  
  var default: js.UndefOr[Double] = js.undefined
  
  var material: js.UndefOr[Double] = js.undefined
}
object ModifiersNumber {
  
  inline def apply(): ModifiersNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifiersNumber]
  }
  
  extension [Self <: ModifiersNumber](x: Self) {
    
    inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setMaterial(value: Double): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
  }
}
