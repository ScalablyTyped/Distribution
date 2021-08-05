package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleSheetProperties extends StObject {
  
  def flatten[T /* <: String */](style: T): T
  
  var hairlineWidth: Double
}
object StyleSheetProperties {
  
  inline def apply(flatten: js.Any => js.Any, hairlineWidth: Double): StyleSheetProperties = {
    val __obj = js.Dynamic.literal(flatten = js.Any.fromFunction1(flatten), hairlineWidth = hairlineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheetProperties]
  }
  
  extension [Self <: StyleSheetProperties](x: Self) {
    
    inline def setFlatten(value: js.Any => js.Any): Self = StObject.set(x, "flatten", js.Any.fromFunction1(value))
    
    inline def setHairlineWidth(value: Double): Self = StObject.set(x, "hairlineWidth", value.asInstanceOf[js.Any])
  }
}
