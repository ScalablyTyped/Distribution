package typings.semanticUiApi.anon

import typings.semanticUiApi.semanticUiApiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'action'> */
trait PickImplaction extends StObject {
  
  var action: String | `false`
}
object PickImplaction {
  
  @scala.inline
  def apply(action: String | `false`): PickImplaction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplaction]
  }
  
  @scala.inline
  implicit class PickImplactionMutableBuilder[Self <: PickImplaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String | `false`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
