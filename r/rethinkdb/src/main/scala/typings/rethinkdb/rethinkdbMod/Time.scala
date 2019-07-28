package typings.rethinkdb.rethinkdbMod

import typings.rethinkdb.rethinkdbStrings.TIME
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends ReqlType {
  @JSName("$reql_type$")
  var $reql_type$_Time: TIME
  var epoch_time: Double
  var timezone: String
}

object Time {
  @scala.inline
  def apply($reql_type$: TIME, epoch_time: Double, timezone: String): Time = {
    val __obj = js.Dynamic.literal($reql_type$ = $reql_type$, epoch_time = epoch_time, timezone = timezone)
  
    __obj.asInstanceOf[Time]
  }
}

