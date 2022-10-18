package typings.reactQuery.typesCoreTypesMod

import typings.reactQuery.reactQueryBooleans.`false`
import typings.reactQuery.reactQueryBooleans.`true`
import typings.reactQuery.reactQueryStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfiniteQueryObserverSuccessResult[TData, TError]
  extends StObject
     with InfiniteQueryObserverBaseResult[TData, TError]
     with InfiniteQueryObserverResult[TData, TError] {
  
  @JSName("data")
  var data_InfiniteQueryObserverSuccessResult: InfiniteData[TData] = js.native
  
  @JSName("error")
  var error_InfiniteQueryObserverSuccessResult: Null = js.native
  
  @JSName("isError")
  var isError_InfiniteQueryObserverSuccessResult: `false` = js.native
  
  @JSName("isIdle")
  var isIdle_InfiniteQueryObserverSuccessResult: `false` = js.native
  
  @JSName("isLoadingError")
  var isLoadingError_InfiniteQueryObserverSuccessResult: `false` = js.native
  
  @JSName("isLoading")
  var isLoading_InfiniteQueryObserverSuccessResult: `false` = js.native
  
  @JSName("isRefetchError")
  var isRefetchError_InfiniteQueryObserverSuccessResult: `false` = js.native
  
  @JSName("isSuccess")
  var isSuccess_InfiniteQueryObserverSuccessResult: `true` = js.native
  
  @JSName("status")
  var status_InfiniteQueryObserverSuccessResult: success = js.native
}
