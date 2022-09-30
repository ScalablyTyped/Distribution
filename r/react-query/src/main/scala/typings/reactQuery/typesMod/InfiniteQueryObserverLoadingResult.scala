package typings.reactQuery.typesMod

import typings.reactQuery.reactQueryBooleans.`false`
import typings.reactQuery.reactQueryBooleans.`true`
import typings.reactQuery.reactQueryStrings.loading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfiniteQueryObserverLoadingResult[TData, TError]
  extends StObject
     with InfiniteQueryObserverBaseResult[TData, TError]
     with InfiniteQueryObserverResult[TData, TError] {
  
  @JSName("data")
  var data_InfiniteQueryObserverLoadingResult: Unit = js.native
  
  @JSName("error")
  var error_InfiniteQueryObserverLoadingResult: Null = js.native
  
  @JSName("isError")
  var isError_InfiniteQueryObserverLoadingResult: `false` = js.native
  
  @JSName("isIdle")
  var isIdle_InfiniteQueryObserverLoadingResult: `false` = js.native
  
  @JSName("isLoadingError")
  var isLoadingError_InfiniteQueryObserverLoadingResult: `false` = js.native
  
  @JSName("isLoading")
  var isLoading_InfiniteQueryObserverLoadingResult: `true` = js.native
  
  @JSName("isRefetchError")
  var isRefetchError_InfiniteQueryObserverLoadingResult: `false` = js.native
  
  @JSName("isSuccess")
  var isSuccess_InfiniteQueryObserverLoadingResult: `false` = js.native
  
  @JSName("status")
  var status_InfiniteQueryObserverLoadingResult: loading = js.native
}
