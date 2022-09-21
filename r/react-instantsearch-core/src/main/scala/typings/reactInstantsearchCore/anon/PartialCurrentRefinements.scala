package typings.reactInstantsearchCore.anon

import typings.reactInstantsearchCore.mod.Refinement
import typings.reactInstantsearchCore.mod.RefinementValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.CurrentRefinementsProvided> */
trait PartialCurrentRefinements extends StObject {
  
  var items: js.UndefOr[js.Array[Refinement]] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
  
  var refine: js.UndefOr[
    js.Function1[/* refinement */ RefinementValue | (js.Array[Refinement | RefinementValue]), Unit]
  ] = js.undefined
}
object PartialCurrentRefinements {
  
  inline def apply(): PartialCurrentRefinements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCurrentRefinements]
  }
  
  extension [Self <: PartialCurrentRefinements](x: Self) {
    
    inline def setItems(value: js.Array[Refinement]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Refinement*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRefine(value: /* refinement */ RefinementValue | (js.Array[Refinement | RefinementValue]) => Unit): Self = StObject.set(x, "refine", js.Any.fromFunction1(value))
    
    inline def setRefineUndefined: Self = StObject.set(x, "refine", js.undefined)
  }
}
