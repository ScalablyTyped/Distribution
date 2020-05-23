package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReqlType extends js.Object {
  @JSName("$reql_type$")
  var Dollarreql_typeDollar: String
}

object ReqlType {
  @scala.inline
  def apply(Dollarreql_typeDollar: String): ReqlType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$reql_type$")(Dollarreql_typeDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqlType]
  }
}

