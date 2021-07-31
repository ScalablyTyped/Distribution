package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Router[TState] extends StObject {
  
  def getActionForPathAndParams(path: String): Nullable[js.Object]
  
  def getPathAndParamsForState(state: TState): typings.reduxFirstRouter.anon.Params
  
  def getStateForAction(action: js.Object, state: Nullable[TState]): Nullable[TState]
  
  def getStateForActionOriginal(action: js.Object, state: Nullable[TState]): Nullable[TState]
}
object Router {
  
  @scala.inline
  def apply[TState](
    getActionForPathAndParams: String => Nullable[js.Object],
    getPathAndParamsForState: TState => typings.reduxFirstRouter.anon.Params,
    getStateForAction: (js.Object, Nullable[TState]) => Nullable[TState],
    getStateForActionOriginal: (js.Object, Nullable[TState]) => Nullable[TState]
  ): Router[TState] = {
    val __obj = js.Dynamic.literal(getActionForPathAndParams = js.Any.fromFunction1(getActionForPathAndParams), getPathAndParamsForState = js.Any.fromFunction1(getPathAndParamsForState), getStateForAction = js.Any.fromFunction2(getStateForAction), getStateForActionOriginal = js.Any.fromFunction2(getStateForActionOriginal))
    __obj.asInstanceOf[Router[TState]]
  }
  
  @scala.inline
  implicit class RouterMutableBuilder[Self <: Router[?], TState] (val x: Self & Router[TState]) extends AnyVal {
    
    @scala.inline
    def setGetActionForPathAndParams(value: String => Nullable[js.Object]): Self = StObject.set(x, "getActionForPathAndParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPathAndParamsForState(value: TState => typings.reduxFirstRouter.anon.Params): Self = StObject.set(x, "getPathAndParamsForState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStateForAction(value: (js.Object, Nullable[TState]) => Nullable[TState]): Self = StObject.set(x, "getStateForAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetStateForActionOriginal(value: (js.Object, Nullable[TState]) => Nullable[TState]): Self = StObject.set(x, "getStateForActionOriginal", js.Any.fromFunction2(value))
  }
}
