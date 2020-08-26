package typings.rethinkdb.mod

import typings.rethinkdb.rethinkdbStrings.BINARY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Binary extends ReqlType {
  @JSName("$reql_type$")
  var Dollarreql_typeDollar_Binary: BINARY = js.native
  var data: String = js.native
}

object Binary {
  @scala.inline
  def apply(Dollarreql_typeDollar: BINARY, data: String): Binary = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("$reql_type$")(Dollarreql_typeDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
  @scala.inline
  implicit class BinaryOps[Self <: Binary] (val x: Self) extends AnyVal {
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
    def setDollarreql_typeDollar(value: BINARY): Self = this.set("$reql_type$", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

