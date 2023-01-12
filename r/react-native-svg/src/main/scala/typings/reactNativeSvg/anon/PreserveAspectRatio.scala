package typings.reactNativeSvg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreserveAspectRatio extends StObject {
  
  var preserveAspectRatio: String
}
object PreserveAspectRatio {
  
  inline def apply(preserveAspectRatio: String): PreserveAspectRatio = {
    val __obj = js.Dynamic.literal(preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreserveAspectRatio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreserveAspectRatio] (val x: Self) extends AnyVal {
    
    inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
  }
}
