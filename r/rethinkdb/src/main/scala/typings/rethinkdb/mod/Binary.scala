package typings.rethinkdb.mod

import typings.rethinkdb.rethinkdbStrings.BINARY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binary extends ReqlType {
  @JSName("$reql_type$")
  var Dollarreql_typeDollar_Binary: BINARY
  var data: String
}

object Binary {
  @scala.inline
  def apply(Dollarreql_typeDollar: BINARY, data: String): Binary = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("$reql_type$")(Dollarreql_typeDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
}

