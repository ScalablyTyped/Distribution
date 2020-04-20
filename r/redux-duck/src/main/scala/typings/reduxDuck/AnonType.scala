package typings.reduxDuck

import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType[T /* <: String with (/* import warning: importer.ImportType#apply Failed type conversion: AppAction['type'] */ js.Any) */, AppAction /* <: Action[_] */] extends js.Object {
  var `type`: T
}

object AnonType {
  @scala.inline
  def apply[T /* <: String with (/* import warning: importer.ImportType#apply Failed type conversion: AppAction['type'] */ js.Any) */, AppAction /* <: Action[_] */](`type`: T): AnonType[T, AppAction] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType[T, AppAction]]
  }
}

