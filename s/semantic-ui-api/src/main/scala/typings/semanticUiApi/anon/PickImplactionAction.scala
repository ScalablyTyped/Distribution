package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl, 'action'> */
trait PickImplactionAction extends StObject {
  
  var action: String
}
object PickImplactionAction {
  
  @scala.inline
  def apply(action: String): PickImplactionAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactionAction]
  }
  
  @scala.inline
  implicit class PickImplactionActionMutableBuilder[Self <: PickImplactionAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
