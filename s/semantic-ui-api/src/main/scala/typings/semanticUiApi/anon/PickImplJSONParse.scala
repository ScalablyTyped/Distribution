package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'JSONParse'> */
trait PickImplJSONParse extends StObject {
  
  var JSONParse: String
}
object PickImplJSONParse {
  
  @scala.inline
  def apply(JSONParse: String): PickImplJSONParse = {
    val __obj = js.Dynamic.literal(JSONParse = JSONParse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplJSONParse]
  }
  
  @scala.inline
  implicit class PickImplJSONParseMutableBuilder[Self <: PickImplJSONParse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJSONParse(value: String): Self = StObject.set(x, "JSONParse", value.asInstanceOf[js.Any])
  }
}
