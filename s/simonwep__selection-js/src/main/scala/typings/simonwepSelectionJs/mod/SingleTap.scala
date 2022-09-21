package typings.simonwepSelectionJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleTap extends StObject {
  
  var allow: Boolean
  
  var intersect: TapMode
}
object SingleTap {
  
  inline def apply(allow: Boolean, intersect: TapMode): SingleTap = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], intersect = intersect.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleTap]
  }
  
  extension [Self <: SingleTap](x: Self) {
    
    inline def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setIntersect(value: TapMode): Self = StObject.set(x, "intersect", value.asInstanceOf[js.Any])
  }
}
