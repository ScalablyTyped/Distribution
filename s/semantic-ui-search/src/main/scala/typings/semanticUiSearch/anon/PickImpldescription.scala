package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl, 'description'> */
@js.native
trait PickImpldescription extends StObject {
  
  var description: String = js.native
}
object PickImpldescription {
  
  @scala.inline
  def apply(description: String): PickImpldescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldescription]
  }
  
  @scala.inline
  implicit class PickImpldescriptionMutableBuilder[Self <: PickImpldescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
  }
}
