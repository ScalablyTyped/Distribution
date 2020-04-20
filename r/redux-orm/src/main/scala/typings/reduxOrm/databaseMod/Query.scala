package typings.reduxOrm.databaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var clauses: js.Array[QueryClause[js.Object]]
  var table: String
}

object Query {
  @scala.inline
  def apply(clauses: js.Array[QueryClause[js.Object]], table: String): Query = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

