package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpRequestValidation extends StObject {
  
  var parameters: js.UndefOr[HttpRequestParametersValidation] = js.undefined
  
  var schemas: js.UndefOr[StringDictionary[Record[String, Any]]] = js.undefined
}
object HttpRequestValidation {
  
  inline def apply(): HttpRequestValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRequestValidation]
  }
  
  extension [Self <: HttpRequestValidation](x: Self) {
    
    inline def setParameters(value: HttpRequestParametersValidation): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setSchemas(value: StringDictionary[Record[String, Any]]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
  }
}
