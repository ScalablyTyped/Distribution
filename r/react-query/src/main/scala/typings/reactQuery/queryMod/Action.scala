package typings.reactQuery.queryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactQuery.queryMod.ContinueAction
  - typings.reactQuery.queryMod.ErrorAction[TError]
  - typings.reactQuery.queryMod.FailedAction
  - typings.reactQuery.queryMod.FetchAction
  - typings.reactQuery.queryMod.InvalidateAction
  - typings.reactQuery.queryMod.PauseAction
  - typings.reactQuery.queryMod.SetStateAction[TData, TError]
  - typings.reactQuery.queryMod.SuccessAction[TData]
*/
trait Action[TData, TError] extends StObject
object Action {
  
  inline def ContinueAction(): typings.reactQuery.queryMod.ContinueAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("continue")
    __obj.asInstanceOf[typings.reactQuery.queryMod.ContinueAction]
  }
  
  inline def ErrorAction[TError](error: TError): typings.reactQuery.queryMod.ErrorAction[TError] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[typings.reactQuery.queryMod.ErrorAction[TError]]
  }
  
  inline def FailedAction(): typings.reactQuery.queryMod.FailedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("failed")
    __obj.asInstanceOf[typings.reactQuery.queryMod.FailedAction]
  }
  
  inline def FetchAction(): typings.reactQuery.queryMod.FetchAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("fetch")
    __obj.asInstanceOf[typings.reactQuery.queryMod.FetchAction]
  }
  
  inline def InvalidateAction(): typings.reactQuery.queryMod.InvalidateAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("invalidate")
    __obj.asInstanceOf[typings.reactQuery.queryMod.InvalidateAction]
  }
  
  inline def PauseAction(): typings.reactQuery.queryMod.PauseAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("pause")
    __obj.asInstanceOf[typings.reactQuery.queryMod.PauseAction]
  }
  
  inline def SetStateAction[TData, TError](state: QueryState[TData, TError]): typings.reactQuery.queryMod.SetStateAction[TData, TError] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setState")
    __obj.asInstanceOf[typings.reactQuery.queryMod.SetStateAction[TData, TError]]
  }
  
  inline def SuccessAction[TData](): typings.reactQuery.queryMod.SuccessAction[TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("success")
    __obj.asInstanceOf[typings.reactQuery.queryMod.SuccessAction[TData]]
  }
}
