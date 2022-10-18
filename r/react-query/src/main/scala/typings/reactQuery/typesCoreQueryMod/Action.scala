package typings.reactQuery.typesCoreQueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactQuery.typesCoreQueryMod.ContinueAction
  - typings.reactQuery.typesCoreQueryMod.ErrorAction[TError]
  - typings.reactQuery.typesCoreQueryMod.FailedAction
  - typings.reactQuery.typesCoreQueryMod.FetchAction
  - typings.reactQuery.typesCoreQueryMod.InvalidateAction
  - typings.reactQuery.typesCoreQueryMod.PauseAction
  - typings.reactQuery.typesCoreQueryMod.SetStateAction[TData, TError]
  - typings.reactQuery.typesCoreQueryMod.SuccessAction[TData]
*/
trait Action[TData, TError] extends StObject
object Action {
  
  inline def ContinueAction(): typings.reactQuery.typesCoreQueryMod.ContinueAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("continue")
    __obj.asInstanceOf[typings.reactQuery.typesCoreQueryMod.ContinueAction]
  }
  
  inline def ErrorAction[TError](error: TError): typings.reactQuery.typesCoreQueryMod.ErrorAction[TError] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[typings.reactQuery.typesCoreQueryMod.ErrorAction[TError]]
  }
  
  inline def FailedAction(): typings.reactQuery.typesCoreQueryMod.FailedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("failed")
    __obj.asInstanceOf[typings.reactQuery.typesCoreQueryMod.FailedAction]
  }
  
  inline def FetchAction(): typings.reactQuery.typesCoreQueryMod.FetchAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("fetch")
    __obj.asInstanceOf[typings.reactQuery.typesCoreQueryMod.FetchAction]
  }
  
  inline def InvalidateAction(): typings.reactQuery.typesCoreQueryMod.InvalidateAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("invalidate")
    __obj.asInstanceOf[typings.reactQuery.typesCoreQueryMod.InvalidateAction]
  }
  
  inline def PauseAction(): typings.reactQuery.typesCoreQueryMod.PauseAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("pause")
    __obj.asInstanceOf[typings.reactQuery.typesCoreQueryMod.PauseAction]
  }
  
  inline def SetStateAction[TData, TError](state: QueryState[TData, TError]): typings.reactQuery.typesCoreQueryMod.SetStateAction[TData, TError] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setState")
    __obj.asInstanceOf[typings.reactQuery.typesCoreQueryMod.SetStateAction[TData, TError]]
  }
  
  inline def SuccessAction[TData](): typings.reactQuery.typesCoreQueryMod.SuccessAction[TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("success")
    __obj.asInstanceOf[typings.reactQuery.typesCoreQueryMod.SuccessAction[TData]]
  }
}
