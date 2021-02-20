package typings.reactInstantsearchCore.anon

import typings.reactInstantsearchCore.mod.Refinement
import typings.reactInstantsearchCore.mod.RefinementValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.CurrentRefinementsProvided> */
@js.native
trait PartialCurrentRefinements extends StObject {
  
  var items: js.UndefOr[js.Array[Refinement]] = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var refine: js.UndefOr[
    js.Function1[/* refinement */ RefinementValue | (js.Array[Refinement | RefinementValue]), Unit]
  ] = js.native
}
object PartialCurrentRefinements {
  
  @scala.inline
  def apply(): PartialCurrentRefinements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCurrentRefinements]
  }
  
  @scala.inline
  implicit class PartialCurrentRefinementsMutableBuilder[Self <: PartialCurrentRefinements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Refinement]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Refinement*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRefine(value: /* refinement */ RefinementValue | (js.Array[Refinement | RefinementValue]) => Unit): Self = StObject.set(x, "refine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefineUndefined: Self = StObject.set(x, "refine", js.undefined)
  }
}
