package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOML2DeprecatedColorProperty extends StObject {
  
  var color: java.lang.String
}
object DOML2DeprecatedColorProperty {
  
  inline def apply(color: java.lang.String): DOML2DeprecatedColorProperty = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOML2DeprecatedColorProperty]
  }
  
  extension [Self <: DOML2DeprecatedColorProperty](x: Self) {
    
    inline def setColor(value: java.lang.String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
