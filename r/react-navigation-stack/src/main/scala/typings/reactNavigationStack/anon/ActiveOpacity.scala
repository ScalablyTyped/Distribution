package typings.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveOpacity extends StObject {
  
  var activeOpacity: Double
}
object ActiveOpacity {
  
  inline def apply(activeOpacity: Double): ActiveOpacity = {
    val __obj = js.Dynamic.literal(activeOpacity = activeOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveOpacity]
  }
  
  extension [Self <: ActiveOpacity](x: Self) {
    
    inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
  }
}
