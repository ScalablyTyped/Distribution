package typings.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Semantic extends StObject {
  
  var semantic: String
  
  var token: String
}
object Semantic {
  
  inline def apply(semantic: String, token: String): Semantic = {
    val __obj = js.Dynamic.literal(semantic = semantic.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Semantic]
  }
  
  extension [Self <: Semantic](x: Self) {
    
    inline def setSemantic(value: String): Self = StObject.set(x, "semantic", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
