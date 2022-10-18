package typings.reactQuery.typesCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryObserverBaseResult[TData, TError] extends StObject {
  
  var data: js.UndefOr[TData] = js.native
  
  var dataUpdatedAt: Double = js.native
  
  var error: TError | Null = js.native
  
  var errorUpdateCount: Double = js.native
  
  var errorUpdatedAt: Double = js.native
  
  var failureCount: Double = js.native
  
  var isError: Boolean = js.native
  
  var isFetched: Boolean = js.native
  
  var isFetchedAfterMount: Boolean = js.native
  
  var isFetching: Boolean = js.native
  
  var isIdle: Boolean = js.native
  
  var isLoading: Boolean = js.native
  
  var isLoadingError: Boolean = js.native
  
  var isPlaceholderData: Boolean = js.native
  
  var isPreviousData: Boolean = js.native
  
  var isRefetchError: Boolean = js.native
  
  var isRefetching: Boolean = js.native
  
  var isStale: Boolean = js.native
  
  var isSuccess: Boolean = js.native
  
  def refetch[TPageData](): js.Promise[QueryObserverResult[TData, TError]] = js.native
  def refetch[TPageData](options: RefetchOptions & RefetchQueryFilters[TPageData]): js.Promise[QueryObserverResult[TData, TError]] = js.native
  
  def remove(): Unit = js.native
  
  var status: QueryStatus = js.native
}
