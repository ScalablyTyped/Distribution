package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedHttpApiEventAuthorizer extends StObject {
  
  var name: String = js.native
  
  var scopes: js.UndefOr[js.Array[String]] = js.native
}
object NamedHttpApiEventAuthorizer {
  
  @scala.inline
  def apply(name: String): NamedHttpApiEventAuthorizer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedHttpApiEventAuthorizer]
  }
  
  @scala.inline
  implicit class NamedHttpApiEventAuthorizerMutableBuilder[Self <: NamedHttpApiEventAuthorizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
  }
}
