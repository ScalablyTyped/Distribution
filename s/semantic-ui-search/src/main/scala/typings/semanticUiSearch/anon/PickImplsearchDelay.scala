package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'searchDelay'> */
@js.native
trait PickImplsearchDelay extends StObject {
  
  var searchDelay: Double = js.native
}
object PickImplsearchDelay {
  
  @scala.inline
  def apply(searchDelay: Double): PickImplsearchDelay = {
    val __obj = js.Dynamic.literal(searchDelay = searchDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsearchDelay]
  }
  
  @scala.inline
  implicit class PickImplsearchDelayMutableBuilder[Self <: PickImplsearchDelay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearchDelay(value: Double): Self = StObject.set(x, "searchDelay", value.asInstanceOf[js.Any])
  }
}
