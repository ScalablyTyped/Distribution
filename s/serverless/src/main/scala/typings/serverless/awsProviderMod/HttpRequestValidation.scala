package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpRequestValidation extends StObject {
  
  var parameters: js.UndefOr[HttpRequestParametersValidation] = js.undefined
  
  var schema: js.UndefOr[StringDictionary[Record[String, js.Any]]] = js.undefined
}
object HttpRequestValidation {
  
  inline def apply(): HttpRequestValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRequestValidation]
  }
  
  extension [Self <: HttpRequestValidation](x: Self) {
    
    inline def setParameters(value: HttpRequestParametersValidation): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setSchema(value: StringDictionary[Record[String, js.Any]]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
