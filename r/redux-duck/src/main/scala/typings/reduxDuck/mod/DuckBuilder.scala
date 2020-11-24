package typings.reduxDuck.mod

import typings.redux.mod.Action
import typings.redux.mod.Reducer
import typings.reduxDuck.anon.Type
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DuckBuilder[AppAction /* <: Action[_] */] extends js.Object {
  
  def createAction[T /* <: String with (/* import warning: importer.ImportType#apply Failed type conversion: AppAction['type'] */ js.Any) */](a: T): ActionCreator[Extract[AppAction, Type[T, AppAction]]] = js.native
  
  def createReducer[S](a: ActionHandlers[S, AppAction], b: S): Reducer[S, AppAction] = js.native
  
  def defineType(a: ActionName): ActionType = js.native
}
object DuckBuilder {
  
  @scala.inline
  def apply[AppAction /* <: Action[_] */](
    createAction: js.Any => ActionCreator[Extract[AppAction, Type[js.Any, AppAction]]],
    createReducer: (ActionHandlers[js.Any, AppAction], js.Any) => Reducer[js.Any, AppAction],
    defineType: ActionName => ActionType
  ): DuckBuilder[AppAction] = {
    val __obj = js.Dynamic.literal(createAction = js.Any.fromFunction1(createAction), createReducer = js.Any.fromFunction2(createReducer), defineType = js.Any.fromFunction1(defineType))
    __obj.asInstanceOf[DuckBuilder[AppAction]]
  }
  
  @scala.inline
  implicit class DuckBuilderOps[Self <: DuckBuilder[_], AppAction /* <: Action[_] */] (val x: Self with DuckBuilder[AppAction]) extends AnyVal {
    
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
    def setCreateAction(value: js.Any => ActionCreator[Extract[AppAction, Type[js.Any, AppAction]]]): Self = this.set("createAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateReducer(value: (ActionHandlers[js.Any, AppAction], js.Any) => Reducer[js.Any, AppAction]): Self = this.set("createReducer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDefineType(value: ActionName => ActionType): Self = this.set("defineType", js.Any.fromFunction1(value))
  }
}
