package typings.reactQuery.typesCoreTypesMod

import typings.reactQuery.reactQueryBooleans.`false`
import typings.reactQuery.reactQueryBooleans.`true`
import typings.reactQuery.reactQueryStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfiniteQueryObserverLoadingErrorResult[TData, TError]
  extends StObject
     with InfiniteQueryObserverBaseResult[TData, TError]
     with InfiniteQueryObserverResult[TData, TError] {
  
  @JSName("data")
  var data_InfiniteQueryObserverLoadingErrorResult: Unit = js.native
  
  @JSName("error")
  var error_InfiniteQueryObserverLoadingErrorResult: TError = js.native
  
  @JSName("isError")
  var isError_InfiniteQueryObserverLoadingErrorResult: `true` = js.native
  
  @JSName("isIdle")
  var isIdle_InfiniteQueryObserverLoadingErrorResult: `false` = js.native
  
  @JSName("isLoadingError")
  var isLoadingError_InfiniteQueryObserverLoadingErrorResult: `true` = js.native
  
  @JSName("isLoading")
  var isLoading_InfiniteQueryObserverLoadingErrorResult: `false` = js.native
  
  @JSName("isRefetchError")
  var isRefetchError_InfiniteQueryObserverLoadingErrorResult: `false` = js.native
  
  @JSName("isSuccess")
  var isSuccess_InfiniteQueryObserverLoadingErrorResult: `false` = js.native
  
  @JSName("status")
  var status_InfiniteQueryObserverLoadingErrorResult: error = js.native
}
