package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericMenuExposed extends StObject {
  
  /** the name of the attribute in the records */
  var attribute: String
  
  /** the value of the item selected by default, follow the shape of a string with a pattern of '{start}:{end}'. */
  var defaultRefinement: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  /** List of options. With a text label, and upper and lower bounds. */
  var items: js.Array[End]
  
  /** (...args: any[]) => any to modify the items being displayed, e.g. for filtering or sorting them. Takes an items as parameter and expects it back in return. */
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
}
object NumericMenuExposed {
  
  inline def apply(attribute: String, items: js.Array[End]): NumericMenuExposed = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericMenuExposed]
  }
  
  extension [Self <: NumericMenuExposed](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setDefaultRefinement(value: String): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
    
    inline def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItems(value: js.Array[End]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: End*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setTransformItems(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "transformItems", js.Any.fromFunction1(value))
    
    inline def setTransformItemsUndefined: Self = StObject.set(x, "transformItems", js.undefined)
  }
}
