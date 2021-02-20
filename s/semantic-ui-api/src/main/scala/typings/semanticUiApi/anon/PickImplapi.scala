package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'api'> */
@js.native
trait PickImplapi extends StObject {
  
  var api: StringDictionary[String] = js.native
}
object PickImplapi {
  
  @scala.inline
  def apply(api: StringDictionary[String]): PickImplapi = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplapi]
  }
  
  @scala.inline
  implicit class PickImplapiMutableBuilder[Self <: PickImplapi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi(value: StringDictionary[String]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
  }
}
