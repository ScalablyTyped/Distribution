package typings.rethinkdb.rethinkdbMod

import typings.rethinkdb.rethinkdbStrings.BINARY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binary extends ReqlType {
  @JSName("$reql_type$")
  var $reql_type$_Binary: BINARY
  var data: String
}

object Binary {
  @scala.inline
  def apply($reql_type$: BINARY, data: String): Binary = {
    val __obj = js.Dynamic.literal($reql_type$ = $reql_type$, data = data)
  
    __obj.asInstanceOf[Binary]
  }
}

