package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl, 'url'> */
trait PickImplurlUrl extends StObject {
  
  var url: String
}
object PickImplurlUrl {
  
  inline def apply(url: String): PickImplurlUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplurlUrl]
  }
  
  extension [Self <: PickImplurlUrl](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
