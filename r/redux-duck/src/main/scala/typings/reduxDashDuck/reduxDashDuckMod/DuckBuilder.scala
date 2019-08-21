package typings.reduxDashDuck.reduxDashDuckMod

import typings.redux.reduxMod.Action
import typings.redux.reduxMod.Reducer
import typings.reduxDashDuck.Anon_Type
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuckBuilder[AppAction /* <: Action[_] */] extends js.Object {
  def createAction[T /* <: String with (/* import warning: ImportType.apply Failed type conversion: AppAction['type'] */ js.Any) */](a: T): ActionCreator[Extract[AppAction, Anon_Type[T]]]
  def createReducer[S](a: ActionHandlers[S, AppAction], b: S): Reducer[S, AppAction]
  def defineType(a: ActionName): ActionType
}

object DuckBuilder {
  @scala.inline
  def apply[AppAction /* <: Action[_] */](
    createAction: js.Any => ActionCreator[Extract[AppAction, Anon_Type[js.Any]]],
    createReducer: (ActionHandlers[js.Any, AppAction], js.Any) => Reducer[js.Any, AppAction],
    defineType: ActionName => ActionType
  ): DuckBuilder[AppAction] = {
    val __obj = js.Dynamic.literal(createAction = js.Any.fromFunction1(createAction), createReducer = js.Any.fromFunction2(createReducer), defineType = js.Any.fromFunction1(defineType))
  
    __obj.asInstanceOf[DuckBuilder[AppAction]]
  }
}

