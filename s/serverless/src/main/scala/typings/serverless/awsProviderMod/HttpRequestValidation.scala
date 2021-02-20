package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRequestValidation extends StObject {
  
  var parameters: js.UndefOr[HttpRequestParametersValidation] = js.native
  
  var schema: js.UndefOr[StringDictionary[Record[String, _]]] = js.native
}
object HttpRequestValidation {
  
  @scala.inline
  def apply(): HttpRequestValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRequestValidation]
  }
  
  @scala.inline
  implicit class HttpRequestValidationMutableBuilder[Self <: HttpRequestValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: HttpRequestParametersValidation): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setSchema(value: StringDictionary[Record[String, _]]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
