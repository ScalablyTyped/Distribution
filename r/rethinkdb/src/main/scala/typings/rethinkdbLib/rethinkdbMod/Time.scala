package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends ReqlType {
  @JSName("$reql_type$")
  var $reql_type$_Time: rethinkdbLib.rethinkdbLibStrings.TIME
  var epoch_time: scala.Double
  var timezone: java.lang.String
}

object Time {
  @scala.inline
  def apply(
    $reql_type$: rethinkdbLib.rethinkdbLibStrings.TIME,
    epoch_time: scala.Double,
    timezone: java.lang.String
  ): Time = {
    val __obj = js.Dynamic.literal($reql_type$ = $reql_type$, epoch_time = epoch_time, timezone = timezone)
  
    __obj.asInstanceOf[Time]
  }
}

