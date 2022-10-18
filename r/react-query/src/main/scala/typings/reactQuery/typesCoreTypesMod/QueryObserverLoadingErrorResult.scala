package typings.reactQuery.typesCoreTypesMod

import typings.reactQuery.reactQueryBooleans.`false`
import typings.reactQuery.reactQueryBooleans.`true`
import typings.reactQuery.reactQueryStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryObserverLoadingErrorResult[TData, TError]
  extends StObject
     with QueryObserverBaseResult[TData, TError]
     with QueryObserverResult[TData, TError] {
  
  @JSName("data")
  var data_QueryObserverLoadingErrorResult: Unit = js.native
  
  @JSName("error")
  var error_QueryObserverLoadingErrorResult: TError = js.native
  
  @JSName("isError")
  var isError_QueryObserverLoadingErrorResult: `true` = js.native
  
  @JSName("isIdle")
  var isIdle_QueryObserverLoadingErrorResult: `false` = js.native
  
  @JSName("isLoadingError")
  var isLoadingError_QueryObserverLoadingErrorResult: `true` = js.native
  
  @JSName("isLoading")
  var isLoading_QueryObserverLoadingErrorResult: `false` = js.native
  
  @JSName("isRefetchError")
  var isRefetchError_QueryObserverLoadingErrorResult: `false` = js.native
  
  @JSName("isSuccess")
  var isSuccess_QueryObserverLoadingErrorResult: `false` = js.native
  
  @JSName("status")
  var status_QueryObserverLoadingErrorResult: error = js.native
}
