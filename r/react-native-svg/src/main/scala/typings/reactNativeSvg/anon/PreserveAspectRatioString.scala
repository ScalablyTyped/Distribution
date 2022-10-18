package typings.reactNativeSvg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreserveAspectRatioString extends StObject {
  
  var preserveAspectRatio: String
}
object PreserveAspectRatioString {
  
  inline def apply(preserveAspectRatio: String): PreserveAspectRatioString = {
    val __obj = js.Dynamic.literal(preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreserveAspectRatioString]
  }
  
  extension [Self <: PreserveAspectRatioString](x: Self) {
    
    inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
  }
}
