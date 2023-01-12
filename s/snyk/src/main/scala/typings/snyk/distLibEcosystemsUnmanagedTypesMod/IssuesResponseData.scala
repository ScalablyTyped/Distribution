package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesResponseData extends StObject {
  
  var id: String
  
  var result: IssuesResponseDataResult
}
object IssuesResponseData {
  
  inline def apply(id: String, result: IssuesResponseDataResult): IssuesResponseData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesResponseData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssuesResponseData] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResult(value: IssuesResponseDataResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
