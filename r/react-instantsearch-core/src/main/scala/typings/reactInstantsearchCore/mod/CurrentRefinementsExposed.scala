package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentRefinementsExposed extends StObject {
  
  /** Pass true to also clear the search query */
  var clearsQuery: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Function to modify the items being displayed, e.g. for filtering or sorting them.
    * Takes an items as parameter and expects it back in return.
    */
  var transformItems: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
}
object CurrentRefinementsExposed {
  
  inline def apply(): CurrentRefinementsExposed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentRefinementsExposed]
  }
  
  extension [Self <: CurrentRefinementsExposed](x: Self) {
    
    inline def setClearsQuery(value: Boolean): Self = StObject.set(x, "clearsQuery", value.asInstanceOf[js.Any])
    
    inline def setClearsQueryUndefined: Self = StObject.set(x, "clearsQuery", js.undefined)
    
    inline def setTransformItems(value: /* repeated */ Any => Any): Self = StObject.set(x, "transformItems", js.Any.fromFunction1(value))
    
    inline def setTransformItemsUndefined: Self = StObject.set(x, "transformItems", js.undefined)
  }
}
