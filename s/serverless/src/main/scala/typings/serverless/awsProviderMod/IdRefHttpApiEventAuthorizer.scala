package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdRefHttpApiEventAuthorizer extends StObject {
  
  var id: String = js.native
  
  var scopes: js.UndefOr[js.Array[String]] = js.native
}
object IdRefHttpApiEventAuthorizer {
  
  @scala.inline
  def apply(id: String): IdRefHttpApiEventAuthorizer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdRefHttpApiEventAuthorizer]
  }
  
  @scala.inline
  implicit class IdRefHttpApiEventAuthorizerMutableBuilder[Self <: IdRefHttpApiEventAuthorizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
  }
}
