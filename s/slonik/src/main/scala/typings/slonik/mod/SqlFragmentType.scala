package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlFragmentType extends js.Object {
  var parameters: js.Array[PrimitiveValueExpressionType] = js.native
  var sql: String = js.native
}

object SqlFragmentType {
  @scala.inline
  def apply(parameters: js.Array[PrimitiveValueExpressionType], sql: String): SqlFragmentType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlFragmentType]
  }
  @scala.inline
  implicit class SqlFragmentTypeOps[Self <: SqlFragmentType] (val x: Self) extends AnyVal {
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
    def setParametersVarargs(value: PrimitiveValueExpressionType*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: js.Array[PrimitiveValueExpressionType]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setSql(value: String): Self = this.set("sql", value.asInstanceOf[js.Any])
  }
  
}

