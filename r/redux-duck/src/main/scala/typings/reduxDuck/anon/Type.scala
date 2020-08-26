package typings.reduxDuck.anon

import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type[T /* <: String with (/* import warning: importer.ImportType#apply Failed type conversion: AppAction['type'] */ js.Any) */, AppAction /* <: Action[_] */] extends js.Object {
  var `type`: T = js.native
}

object Type {
  @scala.inline
  def apply[/* <: java.lang.String with (/ * import warning: importer.ImportType#apply Failed type conversion: AppAction['type'] * / js.Any) */ T, /* <: typings.redux.mod.Action[_] */ AppAction](`type`: T): Type[T, AppAction] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[T, AppAction]]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type[_, _], /* <: java.lang.String with (/ * import warning: importer.ImportType#apply Failed type conversion: AppAction['type'] * / js.Any) */ T, /* <: typings.redux.mod.Action[_] */ AppAction] (val x: Self with (Type[T, AppAction])) extends AnyVal {
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
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

