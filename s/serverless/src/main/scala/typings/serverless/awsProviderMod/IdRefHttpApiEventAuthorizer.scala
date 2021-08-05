package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdRefHttpApiEventAuthorizer extends StObject {
  
  var id: String
  
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}
object IdRefHttpApiEventAuthorizer {
  
  inline def apply(id: String): IdRefHttpApiEventAuthorizer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdRefHttpApiEventAuthorizer]
  }
  
  extension [Self <: IdRefHttpApiEventAuthorizer](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
  }
}
