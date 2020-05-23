package typings.rethinkdb.mod

import typings.rethinkdb.rethinkdbStrings.TIME
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends ReqlType {
  @JSName("$reql_type$")
  var Dollarreql_typeDollar_Time: TIME
  var epoch_time: Double
  var timezone: String
}

object Time {
  @scala.inline
  def apply(Dollarreql_typeDollar: TIME, epoch_time: Double, timezone: String): Time = {
    val __obj = js.Dynamic.literal(epoch_time = epoch_time.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.updateDynamic("$reql_type$")(Dollarreql_typeDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
}

