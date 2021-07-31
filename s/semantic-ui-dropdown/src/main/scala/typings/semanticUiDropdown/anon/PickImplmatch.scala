package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.semanticUiDropdownStrings.both
import typings.semanticUiDropdown.semanticUiDropdownStrings.text
import typings.semanticUiDropdown.semanticUiDropdownStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'match'> */
trait PickImplmatch extends StObject {
  
  var `match`: both | value | text
}
object PickImplmatch {
  
  @scala.inline
  def apply(`match`: both | value | text): PickImplmatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmatch]
  }
  
  @scala.inline
  implicit class PickImplmatchMutableBuilder[Self <: PickImplmatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatch(value: both | value | text): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
  }
}
