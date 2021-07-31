package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, 'api'> */
trait PickImplapi extends StObject {
  
  var api: String
}
object PickImplapi {
  
  @scala.inline
  def apply(api: String): PickImplapi = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplapi]
  }
  
  @scala.inline
  implicit class PickImplapiMutableBuilder[Self <: PickImplapi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
  }
}
