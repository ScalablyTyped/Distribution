package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binary extends ReqlType {
  @JSName("$reql_type$")
  var $reql_type$_Binary: rethinkdbLib.rethinkdbLibStrings.BINARY
  var data: java.lang.String
}

object Binary {
  @scala.inline
  def apply($reql_type$: rethinkdbLib.rethinkdbLibStrings.BINARY, data: java.lang.String): Binary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$reql_type$")($reql_type$)
    __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[Binary]
  }
}

