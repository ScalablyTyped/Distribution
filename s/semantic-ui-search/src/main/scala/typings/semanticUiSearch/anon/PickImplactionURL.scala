package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl, 'actionURL'> */
trait PickImplactionURL extends StObject {
  
  var actionURL: String
}
object PickImplactionURL {
  
  @scala.inline
  def apply(actionURL: String): PickImplactionURL = {
    val __obj = js.Dynamic.literal(actionURL = actionURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactionURL]
  }
  
  @scala.inline
  implicit class PickImplactionURLMutableBuilder[Self <: PickImplactionURL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionURL(value: String): Self = StObject.set(x, "actionURL", value.asInstanceOf[js.Any])
  }
}
