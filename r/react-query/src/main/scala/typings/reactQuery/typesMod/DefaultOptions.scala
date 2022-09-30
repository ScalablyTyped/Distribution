package typings.reactQuery.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultOptions[TError] extends StObject {
  
  var mutations: js.UndefOr[MutationObserverOptions[Any, TError, Any, Any]] = js.undefined
  
  var queries: js.UndefOr[QueryObserverOptions[Any, TError, Any, Any, QueryKey]] = js.undefined
}
object DefaultOptions {
  
  inline def apply[TError](): DefaultOptions[TError] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultOptions[TError]]
  }
  
  extension [Self <: DefaultOptions[?], TError](x: Self & DefaultOptions[TError]) {
    
    inline def setMutations(value: MutationObserverOptions[Any, TError, Any, Any]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    inline def setMutationsUndefined: Self = StObject.set(x, "mutations", js.undefined)
    
    inline def setQueries(value: QueryObserverOptions[Any, TError, Any, Any, QueryKey]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
  }
}
