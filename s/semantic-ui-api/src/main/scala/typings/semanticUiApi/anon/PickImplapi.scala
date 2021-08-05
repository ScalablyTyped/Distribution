package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'api'> */
trait PickImplapi extends StObject {
  
  var api: StringDictionary[String]
}
object PickImplapi {
  
  inline def apply(api: StringDictionary[String]): PickImplapi = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplapi]
  }
  
  extension [Self <: PickImplapi](x: Self) {
    
    inline def setApi(value: StringDictionary[String]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
  }
}
