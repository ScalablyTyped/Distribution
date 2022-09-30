package typings.reactQuery

import org.scalablytyped.runtime.Instantiable2
import typings.reactQuery.queryClientMod.QueryClient
import typings.reactQuery.queryObserverMod.QueryObserver
import typings.reactQuery.reactTypesMod.UseBaseQueryOptions
import typings.reactQuery.typesMod.QueryKey
import typings.reactQuery.typesMod.QueryObserverOptions
import typings.reactQuery.typesMod.QueryObserverResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useBaseQueryMod {
  
  @JSImport("react-query/types/react/useBaseQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useBaseQuery[TQueryFnData, TError, TData, TQueryData, TQueryKey /* <: QueryKey */](
    options: UseBaseQueryOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey],
    Observer: Instantiable2[
      /* client */ QueryClient, 
      /* options */ QueryObserverOptions[
        /* import warning: RewrittenClass.unapply cls was tparam TQueryFnData */ Any, 
        /* import warning: RewrittenClass.unapply cls was tparam TError */ Any, 
        /* import warning: RewrittenClass.unapply cls was tparam TData */ Any, 
        /* import warning: RewrittenClass.unapply cls was tparam TQueryData */ Any, 
        /* import warning: RewrittenClass.unapply cls was tparam TQueryKey */ Any
      ], 
      QueryObserver[js.Object, js.Object, js.Object, js.Object, QueryKey]
    ]
  ): QueryObserverResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useBaseQuery")(options.asInstanceOf[js.Any], Observer.asInstanceOf[js.Any])).asInstanceOf[QueryObserverResult[TData, TError]]
}
