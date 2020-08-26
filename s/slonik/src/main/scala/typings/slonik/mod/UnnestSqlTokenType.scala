package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnnestSqlTokenType extends _SqlTokenType {
  var columnTypes: js.Array[String] = js.native
  var tuples: js.Array[js.Array[ValueExpressionType]] = js.native
  var `type`: js.Symbol = js.native
}

object UnnestSqlTokenType {
  @scala.inline
  def apply(columnTypes: js.Array[String], tuples: js.Array[js.Array[ValueExpressionType]], `type`: js.Symbol): UnnestSqlTokenType = {
    val __obj = js.Dynamic.literal(columnTypes = columnTypes.asInstanceOf[js.Any], tuples = tuples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnnestSqlTokenType]
  }
  @scala.inline
  implicit class UnnestSqlTokenTypeOps[Self <: UnnestSqlTokenType] (val x: Self) extends AnyVal {
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
    def setColumnTypesVarargs(value: String*): Self = this.set("columnTypes", js.Array(value :_*))
    @scala.inline
    def setColumnTypes(value: js.Array[String]): Self = this.set("columnTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTuplesVarargs(value: js.Array[ValueExpressionType]*): Self = this.set("tuples", js.Array(value :_*))
    @scala.inline
    def setTuples(value: js.Array[js.Array[ValueExpressionType]]): Self = this.set("tuples", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Symbol): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

