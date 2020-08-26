package typings.shopifyPrime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends js.Object {
  var column: String = js.native
  var condition: String = js.native
  var relation: String = js.native
}

object Column {
  @scala.inline
  def apply(column: String, condition: String, relation: String): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
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
    def setColumn(value: String): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelation(value: String): Self = this.set("relation", value.asInstanceOf[js.Any])
  }
  
}

