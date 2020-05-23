package typings.reduxDuck.anon

import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type[T /* <: String with (/* import warning: importer.ImportType#apply Failed type conversion: AppAction['type'] */ js.Any) */, AppAction /* <: Action[_] */] extends js.Object {
  var `type`: T
}

object Type {
  @scala.inline
  def apply[T, AppAction](`type`: T): Type[T, AppAction] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[T, AppAction]]
  }
}

