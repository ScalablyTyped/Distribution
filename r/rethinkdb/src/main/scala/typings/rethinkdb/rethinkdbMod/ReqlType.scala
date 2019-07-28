package typings.rethinkdb.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReqlType extends js.Object {
  @JSName("$reql_type$")
  var $reql_type$: String
}

object ReqlType {
  @scala.inline
  def apply($reql_type$: String): ReqlType = {
    val __obj = js.Dynamic.literal($reql_type$ = $reql_type$)
  
    __obj.asInstanceOf[ReqlType]
  }
}

