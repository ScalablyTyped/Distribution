package typings.reactQuery.anon

import typings.reactQuery.mutationMod.Mutation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-query.react-query/types/core/utils.MutationFilters, 'mutationKey'> */
trait OmitMutationFiltersmutati extends StObject {
  
  var exact: js.UndefOr[Boolean] = js.undefined
  
  var fetching: js.UndefOr[Boolean] = js.undefined
  
  var predicate: js.UndefOr[js.Function1[/* mutation */ Mutation[Any, Any, Any, Any], Boolean]] = js.undefined
}
object OmitMutationFiltersmutati {
  
  inline def apply(): OmitMutationFiltersmutati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitMutationFiltersmutati]
  }
  
  extension [Self <: OmitMutationFiltersmutati](x: Self) {
    
    inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setFetching(value: Boolean): Self = StObject.set(x, "fetching", value.asInstanceOf[js.Any])
    
    inline def setFetchingUndefined: Self = StObject.set(x, "fetching", js.undefined)
    
    inline def setPredicate(value: /* mutation */ Mutation[Any, Any, Any, Any] => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
    
    inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
  }
}
