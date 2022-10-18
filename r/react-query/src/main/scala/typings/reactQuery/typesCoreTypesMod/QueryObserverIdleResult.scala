package typings.reactQuery.typesCoreTypesMod

import typings.reactQuery.reactQueryBooleans.`false`
import typings.reactQuery.reactQueryBooleans.`true`
import typings.reactQuery.reactQueryStrings.idle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryObserverIdleResult[TData, TError]
  extends StObject
     with QueryObserverBaseResult[TData, TError]
     with QueryObserverResult[TData, TError] {
  
  @JSName("data")
  var data_QueryObserverIdleResult: Unit = js.native
  
  @JSName("error")
  var error_QueryObserverIdleResult: Null = js.native
  
  @JSName("isError")
  var isError_QueryObserverIdleResult: `false` = js.native
  
  @JSName("isIdle")
  var isIdle_QueryObserverIdleResult: `true` = js.native
  
  @JSName("isLoadingError")
  var isLoadingError_QueryObserverIdleResult: `false` = js.native
  
  @JSName("isLoading")
  var isLoading_QueryObserverIdleResult: `false` = js.native
  
  @JSName("isRefetchError")
  var isRefetchError_QueryObserverIdleResult: `false` = js.native
  
  @JSName("isSuccess")
  var isSuccess_QueryObserverIdleResult: `false` = js.native
  
  @JSName("status")
  var status_QueryObserverIdleResult: idle = js.native
}
