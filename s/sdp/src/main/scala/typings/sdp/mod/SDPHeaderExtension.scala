package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPHeaderExtension extends StObject {
  
  var direction: js.UndefOr[SDPDirection] = js.undefined
  
  var id: Double
  
  var uri: String
}
object SDPHeaderExtension {
  
  inline def apply(id: Double, uri: String): SDPHeaderExtension = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPHeaderExtension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SDPHeaderExtension] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: SDPDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
