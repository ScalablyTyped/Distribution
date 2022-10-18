package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedHttpApiEventAuthorizer extends StObject {
  
  var name: String
  
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}
object NamedHttpApiEventAuthorizer {
  
  inline def apply(name: String): NamedHttpApiEventAuthorizer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedHttpApiEventAuthorizer]
  }
  
  extension [Self <: NamedHttpApiEventAuthorizer](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
  }
}
