package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.NumericMenuProvided> */
trait PartialNumericMenuProvide extends StObject {
  
  var createURL: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var currentRefinement: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[IsRefined]] = js.undefined
  
  var refine: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
}
object PartialNumericMenuProvide {
  
  inline def apply(): PartialNumericMenuProvide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNumericMenuProvide]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialNumericMenuProvide] (val x: Self) extends AnyVal {
    
    inline def setCreateURL(value: /* repeated */ Any => Any): Self = StObject.set(x, "createURL", js.Any.fromFunction1(value))
    
    inline def setCreateURLUndefined: Self = StObject.set(x, "createURL", js.undefined)
    
    inline def setCurrentRefinement(value: String): Self = StObject.set(x, "currentRefinement", value.asInstanceOf[js.Any])
    
    inline def setCurrentRefinementUndefined: Self = StObject.set(x, "currentRefinement", js.undefined)
    
    inline def setItems(value: js.Array[IsRefined]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: IsRefined*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setRefine(value: /* repeated */ Any => Any): Self = StObject.set(x, "refine", js.Any.fromFunction1(value))
    
    inline def setRefineUndefined: Self = StObject.set(x, "refine", js.undefined)
  }
}
