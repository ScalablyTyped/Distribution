package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl, 'actionText'> */
trait PickImplactionText extends StObject {
  
  var actionText: String
}
object PickImplactionText {
  
  @scala.inline
  def apply(actionText: String): PickImplactionText = {
    val __obj = js.Dynamic.literal(actionText = actionText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactionText]
  }
  
  @scala.inline
  implicit class PickImplactionTextMutableBuilder[Self <: PickImplactionText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionText(value: String): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
  }
}
