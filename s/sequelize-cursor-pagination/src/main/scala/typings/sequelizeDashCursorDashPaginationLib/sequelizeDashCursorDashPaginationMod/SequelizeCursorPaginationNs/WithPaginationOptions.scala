package typings
package sequelizeDashCursorDashPaginationLib.sequelizeDashCursorDashPaginationMod.SequelizeCursorPaginationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithPaginationOptions[MethodName /* <: java.lang.String */] extends js.Object {
  var methodName: js.UndefOr[MethodName] = js.undefined
   // [default: 'paginate']
  var primaryKeyField: js.UndefOr[java.lang.String] = js.undefined
}

object WithPaginationOptions {
  @scala.inline
  def apply[MethodName /* <: java.lang.String */](methodName: MethodName = null, primaryKeyField: java.lang.String = null): WithPaginationOptions[MethodName] = {
    val __obj = js.Dynamic.literal()
    if (methodName != null) __obj.updateDynamic("methodName")(methodName.asInstanceOf[js.Any])
    if (primaryKeyField != null) __obj.updateDynamic("primaryKeyField")(primaryKeyField)
    __obj.asInstanceOf[WithPaginationOptions[MethodName]]
  }
}

