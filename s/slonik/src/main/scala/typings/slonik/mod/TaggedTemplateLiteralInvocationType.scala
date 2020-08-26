package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedTemplateLiteralInvocationType[Result] extends js.Object {
  var sql: String = js.native
  var `type`: js.Symbol = js.native
  var values: js.Array[ValueExpressionType] = js.native
}

object TaggedTemplateLiteralInvocationType {
  @scala.inline
  def apply[Result](sql: String, `type`: js.Symbol, values: js.Array[ValueExpressionType]): TaggedTemplateLiteralInvocationType[Result] = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaggedTemplateLiteralInvocationType[Result]]
  }
  @scala.inline
  implicit class TaggedTemplateLiteralInvocationTypeOps[Self <: TaggedTemplateLiteralInvocationType[_], Result] (val x: Self with TaggedTemplateLiteralInvocationType[Result]) extends AnyVal {
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
    def setSql(value: String): Self = this.set("sql", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Symbol): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: ValueExpressionType*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[ValueExpressionType]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

