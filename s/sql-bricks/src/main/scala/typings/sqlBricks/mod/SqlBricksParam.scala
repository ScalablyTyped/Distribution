package typings.sqlBricks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlBricksParam extends js.Object {
  var text: String = js.native
  var values: js.Array[_] = js.native
}

object SqlBricksParam {
  @scala.inline
  def apply(text: String, values: js.Array[_]): SqlBricksParam = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlBricksParam]
  }
  @scala.inline
  implicit class SqlBricksParamOps[Self <: SqlBricksParam] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

