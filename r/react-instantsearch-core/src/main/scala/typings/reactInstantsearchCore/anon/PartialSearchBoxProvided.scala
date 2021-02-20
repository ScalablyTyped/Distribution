package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.SearchBoxProvided> */
@js.native
trait PartialSearchBoxProvided extends StObject {
  
  var currentRefinement: js.UndefOr[String] = js.native
  
  var isSearchStalled: js.UndefOr[Boolean] = js.native
  
  var refine: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}
object PartialSearchBoxProvided {
  
  @scala.inline
  def apply(): PartialSearchBoxProvided = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSearchBoxProvided]
  }
  
  @scala.inline
  implicit class PartialSearchBoxProvidedMutableBuilder[Self <: PartialSearchBoxProvided] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentRefinement(value: String): Self = StObject.set(x, "currentRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRefinementUndefined: Self = StObject.set(x, "currentRefinement", js.undefined)
    
    @scala.inline
    def setIsSearchStalled(value: Boolean): Self = StObject.set(x, "isSearchStalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSearchStalledUndefined: Self = StObject.set(x, "isSearchStalled", js.undefined)
    
    @scala.inline
    def setRefine(value: /* repeated */ js.Any => _): Self = StObject.set(x, "refine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefineUndefined: Self = StObject.set(x, "refine", js.undefined)
  }
}
