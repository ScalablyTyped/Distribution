package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.IsRefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericMenuProvided extends StObject {
  
  /** a function to generate a URL for the corresponding search state */
  def createURL(args: js.Any*): js.Any
  
  /**
    * the refinement currently applied. follow the shape of a string with a pattern of '{start}:{end}' which corresponds to the current selected item.
    * For instance, when the selected item is {start: 10, end: 20}, the searchState of the widget is '10:20'. When start isn’t defined, the searchState
    * of the widget is ':{end}', and the same way around when end isn’t defined. However, when neither start nor end are defined, the searchState is an empty string.
    */
  var currentRefinement: String
  
  /** the list of ranges the NumericMenu can display. */
  var items: js.Array[IsRefined]
  
  /** a function to select a range. */
  def refine(args: js.Any*): js.Any
}
object NumericMenuProvided {
  
  inline def apply(
    createURL: /* repeated */ js.Any => js.Any,
    currentRefinement: String,
    items: js.Array[IsRefined],
    refine: /* repeated */ js.Any => js.Any
  ): NumericMenuProvided = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), currentRefinement = currentRefinement.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], refine = js.Any.fromFunction1(refine))
    __obj.asInstanceOf[NumericMenuProvided]
  }
  
  extension [Self <: NumericMenuProvided](x: Self) {
    
    inline def setCreateURL(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "createURL", js.Any.fromFunction1(value))
    
    inline def setCurrentRefinement(value: String): Self = StObject.set(x, "currentRefinement", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[IsRefined]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: IsRefined*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setRefine(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "refine", js.Any.fromFunction1(value))
  }
}
