package typings.shiki.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IThemedTokenExplanation extends StObject {
  
  var content: String
  
  var scopes: js.Array[IThemedTokenScopeExplanation]
}
object IThemedTokenExplanation {
  
  inline def apply(content: String, scopes: js.Array[IThemedTokenScopeExplanation]): IThemedTokenExplanation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemedTokenExplanation]
  }
  
  extension [Self <: IThemedTokenExplanation](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: js.Array[IThemedTokenScopeExplanation]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: IThemedTokenScopeExplanation*): Self = StObject.set(x, "scopes", js.Array(value*))
  }
}
