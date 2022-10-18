package typings.reactQuery

import typings.reactQuery.typesCoreQueryClientMod.QueryClient
import typings.reactQuery.typesCoreQueryObserverMod.QueryObserver
import typings.reactQuery.typesCoreTypesMod.FetchNextPageOptions
import typings.reactQuery.typesCoreTypesMod.FetchPreviousPageOptions
import typings.reactQuery.typesCoreTypesMod.InfiniteData
import typings.reactQuery.typesCoreTypesMod.InfiniteQueryObserverOptions
import typings.reactQuery.typesCoreTypesMod.InfiniteQueryObserverResult
import typings.reactQuery.typesCoreTypesMod.QueryKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreInfiniteQueryObserverMod {
  
  @JSImport("react-query/types/core/infiniteQueryObserver", "InfiniteQueryObserver")
  @js.native
  open class InfiniteQueryObserver[TQueryFnData, TError, TData, TQueryData] protected () extends QueryObserver[TQueryFnData, TError, InfiniteData[TData], InfiniteData[TQueryData], QueryKey] {
    def this(
      client: QueryClient,
      options: InfiniteQueryObserverOptions[TQueryFnData, TError, TData, TQueryData, QueryKey]
    ) = this()
    
    def fetchNextPage(): js.Promise[InfiniteQueryObserverResult[TData, TError]] = js.native
    def fetchNextPage(options: FetchNextPageOptions): js.Promise[InfiniteQueryObserverResult[TData, TError]] = js.native
    
    def fetchPreviousPage(): js.Promise[InfiniteQueryObserverResult[TData, TError]] = js.native
    def fetchPreviousPage(options: FetchPreviousPageOptions): js.Promise[InfiniteQueryObserverResult[TData, TError]] = js.native
  }
  
  type InfiniteQueryObserverListener[TData, TError] = js.Function1[/* result */ InfiniteQueryObserverResult[TData, TError], Unit]
}
