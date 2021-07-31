package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'missingAction'> */
trait PickImplmissingAction extends StObject {
  
  var missingAction: String
}
object PickImplmissingAction {
  
  @scala.inline
  def apply(missingAction: String): PickImplmissingAction = {
    val __obj = js.Dynamic.literal(missingAction = missingAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmissingAction]
  }
  
  @scala.inline
  implicit class PickImplmissingActionMutableBuilder[Self <: PickImplmissingAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMissingAction(value: String): Self = StObject.set(x, "missingAction", value.asInstanceOf[js.Any])
  }
}
