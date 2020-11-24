package typings.reduxSagaTester.mod

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Reducer
import typings.redux.mod.ReducersMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SagaTesterOptions[StateType] extends js.Object {
  
  var combineReducers: js.UndefOr[
    js.Function1[/* map */ ReducersMapObject[_, Action[_]], Reducer[StateType, AnyAction]]
  ] = js.native
  
  var ignoreReduxActions: js.UndefOr[Boolean] = js.native
  
  var initialState: js.UndefOr[StateType] = js.native
  
  var middlewares: js.UndefOr[js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]] = js.native
  
  var options: js.UndefOr[js.Object] = js.native
  
  var reducers: js.UndefOr[(ReducersMapObject[_, Action[_]]) | (Reducer[StateType, AnyAction])] = js.native
}
object SagaTesterOptions {
  
  @scala.inline
  def apply[StateType](): SagaTesterOptions[StateType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SagaTesterOptions[StateType]]
  }
  
  @scala.inline
  implicit class SagaTesterOptionsOps[Self <: SagaTesterOptions[_], StateType] (val x: Self with SagaTesterOptions[StateType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCombineReducers(value: /* map */ ReducersMapObject[_, Action[_]] => Reducer[StateType, AnyAction]): Self = this.set("combineReducers", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCombineReducers: Self = this.set("combineReducers", js.undefined)
    
    @scala.inline
    def setIgnoreReduxActions(value: Boolean): Self = this.set("ignoreReduxActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreReduxActions: Self = this.set("ignoreReduxActions", js.undefined)
    
    @scala.inline
    def setInitialState(value: StateType): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    
    @scala.inline
    def setMiddlewaresVarargs(value: (Middleware[js.Object, js.Any, Dispatch[AnyAction]])*): Self = this.set("middlewares", js.Array(value :_*))
    
    @scala.inline
    def setMiddlewares(value: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]): Self = this.set("middlewares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddlewares: Self = this.set("middlewares", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setReducersFunction2(value: (/* state */ js.UndefOr[StateType], AnyAction) => StateType): Self = this.set("reducers", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReducers(value: (ReducersMapObject[_, Action[_]]) | (Reducer[StateType, AnyAction])): Self = this.set("reducers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReducers: Self = this.set("reducers", js.undefined)
  }
}
