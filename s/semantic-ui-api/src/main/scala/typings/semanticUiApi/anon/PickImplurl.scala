package typings.semanticUiApi.anon

import typings.semanticUiApi.semanticUiApiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'url'> */
trait PickImplurl extends StObject {
  
  var url: String | `false`
}
object PickImplurl {
  
  inline def apply(url: String | `false`): PickImplurl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplurl]
  }
  
  extension [Self <: PickImplurl](x: Self) {
    
    inline def setUrl(value: String | `false`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
