package typings.reduxOrm.databaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  var clauses: js.Array[QueryClause[js.Object]] = js.native
  var table: String = js.native
}

object Query {
  @scala.inline
  def apply(clauses: js.Array[QueryClause[js.Object]], table: String): Query = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
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
    def setClausesVarargs(value: QueryClause[js.Object]*): Self = this.set("clauses", js.Array(value :_*))
    @scala.inline
    def setClauses(value: js.Array[QueryClause[js.Object]]): Self = this.set("clauses", value.asInstanceOf[js.Any])
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
  }
  
}

