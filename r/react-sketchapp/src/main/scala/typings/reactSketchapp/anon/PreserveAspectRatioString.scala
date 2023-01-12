package typings.reactSketchapp.anon

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreserveAspectRatioString] (val x: Self) extends AnyVal {
    
    inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
  }
}
