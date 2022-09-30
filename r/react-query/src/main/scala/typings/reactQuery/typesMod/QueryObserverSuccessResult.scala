package typings.reactQuery.typesMod

import typings.reactQuery.reactQueryBooleans.`false`
import typings.reactQuery.reactQueryBooleans.`true`
import typings.reactQuery.reactQueryStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryObserverSuccessResult[TData, TError]
  extends StObject
     with QueryObserverBaseResult[TData, TError]
     with QueryObserverResult[TData, TError] {
  
  @JSName("data")
  var data_QueryObserverSuccessResult: TData = js.native
  
  @JSName("error")
  var error_QueryObserverSuccessResult: Null = js.native
  
  @JSName("isError")
  var isError_QueryObserverSuccessResult: `false` = js.native
  
  @JSName("isIdle")
  var isIdle_QueryObserverSuccessResult: `false` = js.native
  
  @JSName("isLoadingError")
  var isLoadingError_QueryObserverSuccessResult: `false` = js.native
  
  @JSName("isLoading")
  var isLoading_QueryObserverSuccessResult: `false` = js.native
  
  @JSName("isRefetchError")
  var isRefetchError_QueryObserverSuccessResult: `false` = js.native
  
  @JSName("isSuccess")
  var isSuccess_QueryObserverSuccessResult: `true` = js.native
  
  @JSName("status")
  var status_QueryObserverSuccessResult: success = js.native
}
