package typings.reactQuery.anon

import typings.reactQuery.typesMod.MutationOptions
import typings.reactQuery.typesMod.QueryKey
import typings.reactQuery.typesMod.QueryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mutations extends StObject {
  
  var mutations: js.UndefOr[MutationOptions[Any, Any, Unit, Any]] = js.undefined
  
  var queries: js.UndefOr[QueryOptions[Any, Any, Any, QueryKey]] = js.undefined
}
object Mutations {
  
  inline def apply(): Mutations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mutations]
  }
  
  extension [Self <: Mutations](x: Self) {
    
    inline def setMutations(value: MutationOptions[Any, Any, Unit, Any]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    inline def setMutationsUndefined: Self = StObject.set(x, "mutations", js.undefined)
    
    inline def setQueries(value: QueryOptions[Any, Any, Any, QueryKey]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
  }
}
