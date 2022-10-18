package typings.reactQuery.typesCoreTypesMod

import typings.reactQuery.reactQueryBooleans.`false`
import typings.reactQuery.reactQueryBooleans.`true`
import typings.reactQuery.reactQueryStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryObserverRefetchErrorResult[TData, TError]
  extends StObject
     with QueryObserverBaseResult[TData, TError]
     with QueryObserverResult[TData, TError] {
  
  @JSName("data")
  var data_QueryObserverRefetchErrorResult: TData = js.native
  
  @JSName("error")
  var error_QueryObserverRefetchErrorResult: TError = js.native
  
  @JSName("isError")
  var isError_QueryObserverRefetchErrorResult: `true` = js.native
  
  @JSName("isIdle")
  var isIdle_QueryObserverRefetchErrorResult: `false` = js.native
  
  @JSName("isLoadingError")
  var isLoadingError_QueryObserverRefetchErrorResult: `false` = js.native
  
  @JSName("isLoading")
  var isLoading_QueryObserverRefetchErrorResult: `false` = js.native
  
  @JSName("isRefetchError")
  var isRefetchError_QueryObserverRefetchErrorResult: `true` = js.native
  
  @JSName("isSuccess")
  var isSuccess_QueryObserverRefetchErrorResult: `false` = js.native
  
  @JSName("status")
  var status_QueryObserverRefetchErrorResult: error = js.native
}
