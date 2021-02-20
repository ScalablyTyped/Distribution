package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'searchFullText'> */
@js.native
trait PickImplsearchFullText extends StObject {
  
  var searchFullText: Boolean = js.native
}
object PickImplsearchFullText {
  
  @scala.inline
  def apply(searchFullText: Boolean): PickImplsearchFullText = {
    val __obj = js.Dynamic.literal(searchFullText = searchFullText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsearchFullText]
  }
  
  @scala.inline
  implicit class PickImplsearchFullTextMutableBuilder[Self <: PickImplsearchFullText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearchFullText(value: Boolean): Self = StObject.set(x, "searchFullText", value.asInstanceOf[js.Any])
  }
}
