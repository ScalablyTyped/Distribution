package typings.semanticUiApi.anon

import typings.semanticUiApi.semanticUiApiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'urlData'> */
trait PickImplurlData extends StObject {
  
  var urlData: js.Any | `false`
}
object PickImplurlData {
  
  inline def apply(urlData: js.Any | `false`): PickImplurlData = {
    val __obj = js.Dynamic.literal(urlData = urlData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplurlData]
  }
  
  extension [Self <: PickImplurlData](x: Self) {
    
    inline def setUrlData(value: js.Any | `false`): Self = StObject.set(x, "urlData", value.asInstanceOf[js.Any])
  }
}
