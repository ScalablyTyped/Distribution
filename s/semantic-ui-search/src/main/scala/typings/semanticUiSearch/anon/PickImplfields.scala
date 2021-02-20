package typings.semanticUiSearch.anon

import typings.semanticUiSearch.SemanticUI.Search.FieldsSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'fields'> */
@js.native
trait PickImplfields extends StObject {
  
  var fields: FieldsSettings = js.native
}
object PickImplfields {
  
  @scala.inline
  def apply(fields: FieldsSettings): PickImplfields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfields]
  }
  
  @scala.inline
  implicit class PickImplfieldsMutableBuilder[Self <: PickImplfields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: FieldsSettings): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
  }
}
