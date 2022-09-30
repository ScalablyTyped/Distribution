package typings.reactQuery

import typings.reactQuery.queryClientMod.QueryClient
import typings.reactQuery.queryObserverMod.QueryObserver
import typings.reactQuery.typesMod.FetchNextPageOptions
import typings.reactQuery.typesMod.FetchPreviousPageOptions
import typings.reactQuery.typesMod.InfiniteData
import typings.reactQuery.typesMod.InfiniteQueryObserverOptions
import typings.reactQuery.typesMod.InfiniteQueryObserverResult
import typings.reactQuery.typesMod.QueryKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infiniteQueryObserverMod {
  
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
