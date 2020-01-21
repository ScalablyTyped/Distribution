package typings.sequelizeCursorPagination.mod.SequelizeCursorPagination

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithPaginationOptions[MethodName /* <: String */] extends js.Object {
  var methodName: js.UndefOr[MethodName] = js.undefined
   // [default: 'paginate']
  var primaryKeyField: js.UndefOr[String] = js.undefined
}

object WithPaginationOptions {
  @scala.inline
  def apply[MethodName /* <: String */](methodName: MethodName = null, primaryKeyField: String = null): WithPaginationOptions[MethodName] = {
    val __obj = js.Dynamic.literal()
    if (methodName != null) __obj.updateDynamic("methodName")(methodName.asInstanceOf[js.Any])
    if (primaryKeyField != null) __obj.updateDynamic("primaryKeyField")(primaryKeyField.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithPaginationOptions[MethodName]]
  }
}

