package typings.reduxDuck.mod

import typings.redux.mod.Action
import typings.redux.mod.Reducer
import typings.reduxDuck.anon.Type
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuckBuilder[AppAction /* <: Action[_] */] extends js.Object {
  def createAction[T /* <: String with (/* import warning: importer.ImportType#apply Failed type conversion: AppAction['type'] */ js.Any) */](a: T): ActionCreator[Extract[AppAction, Type[T, AppAction]]]
  def createReducer[S](a: ActionHandlers[S, AppAction], b: S): Reducer[S, AppAction]
  def defineType(a: ActionName): ActionType
}

object DuckBuilder {
  @scala.inline
  def apply[AppAction](
    createAction: js.Any => ActionCreator[Extract[AppAction, Type[js.Any, AppAction]]],
    createReducer: (ActionHandlers[js.Any, AppAction], js.Any) => Reducer[js.Any, AppAction],
    defineType: ActionName => ActionType
  ): DuckBuilder[AppAction] = {
    val __obj = js.Dynamic.literal(createAction = js.Any.fromFunction1(createAction), createReducer = js.Any.fromFunction2(createReducer), defineType = js.Any.fromFunction1(defineType))
    __obj.asInstanceOf[DuckBuilder[AppAction]]
  }
}

