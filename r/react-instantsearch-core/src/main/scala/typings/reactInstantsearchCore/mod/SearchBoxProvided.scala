package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBoxProvided extends StObject {
  
  /** the current query used */
  var currentRefinement: String
  
  /** a flag that indicates if InstantSearch has detected that searches are stalled */
  var isSearchStalled: Boolean
  
  /** a function to change the current query */
  def refine(args: js.Any*): js.Any
}
object SearchBoxProvided {
  
  @scala.inline
  def apply(currentRefinement: String, isSearchStalled: Boolean, refine: /* repeated */ js.Any => js.Any): SearchBoxProvided = {
    val __obj = js.Dynamic.literal(currentRefinement = currentRefinement.asInstanceOf[js.Any], isSearchStalled = isSearchStalled.asInstanceOf[js.Any], refine = js.Any.fromFunction1(refine))
    __obj.asInstanceOf[SearchBoxProvided]
  }
  
  @scala.inline
  implicit class SearchBoxProvidedMutableBuilder[Self <: SearchBoxProvided] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentRefinement(value: String): Self = StObject.set(x, "currentRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSearchStalled(value: Boolean): Self = StObject.set(x, "isSearchStalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefine(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "refine", js.Any.fromFunction1(value))
  }
}
