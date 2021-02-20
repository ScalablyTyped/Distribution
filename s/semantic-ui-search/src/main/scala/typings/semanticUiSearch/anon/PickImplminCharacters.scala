package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'minCharacters'> */
@js.native
trait PickImplminCharacters extends StObject {
  
  var minCharacters: Double = js.native
}
object PickImplminCharacters {
  
  @scala.inline
  def apply(minCharacters: Double): PickImplminCharacters = {
    val __obj = js.Dynamic.literal(minCharacters = minCharacters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplminCharacters]
  }
  
  @scala.inline
  implicit class PickImplminCharactersMutableBuilder[Self <: PickImplminCharacters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinCharacters(value: Double): Self = StObject.set(x, "minCharacters", value.asInstanceOf[js.Any])
  }
}
