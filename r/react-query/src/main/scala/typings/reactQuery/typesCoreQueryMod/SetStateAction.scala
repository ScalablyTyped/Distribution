package typings.reactQuery.typesCoreQueryMod

import typings.reactQuery.reactQueryStrings.setState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetStateAction[TData, TError]
  extends StObject
     with Action[TData, TError] {
  
  var setStateOptions: js.UndefOr[SetStateOptions] = js.undefined
  
  var state: QueryState[TData, TError]
  
  var `type`: setState
}
object SetStateAction {
  
  inline def apply[TData, TError](state: QueryState[TData, TError]): SetStateAction[TData, TError] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setState")
    __obj.asInstanceOf[SetStateAction[TData, TError]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetStateAction[?, ?], TData, TError] (val x: Self & (SetStateAction[TData, TError])) extends AnyVal {
    
    inline def setSetStateOptions(value: SetStateOptions): Self = StObject.set(x, "setStateOptions", value.asInstanceOf[js.Any])
    
    inline def setSetStateOptionsUndefined: Self = StObject.set(x, "setStateOptions", js.undefined)
    
    inline def setState(value: QueryState[TData, TError]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setType(value: setState): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
