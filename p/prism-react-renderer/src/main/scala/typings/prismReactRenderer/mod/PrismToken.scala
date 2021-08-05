package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrismToken extends StObject {
  
  var content: (js.Array[PrismToken | String]) | String
  
  var `type`: String
}
object PrismToken {
  
  inline def apply(content: (js.Array[PrismToken | String]) | String, `type`: String): PrismToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrismToken]
  }
  
  extension [Self <: PrismToken](x: Self) {
    
    inline def setContent(value: (js.Array[PrismToken | String]) | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentVarargs(value: (PrismToken | String)*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
