package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRequestSql extends js.Object {
  // list of named parameters
  var parameters: js.UndefOr[js.Array[QueryParameter]] = js.undefined
  // SQL query as a string
  var query: String
}

object QueryRequestSql {
  @scala.inline
  def apply(query: String, parameters: js.Array[QueryParameter] = null): QueryRequestSql = {
    val __obj = js.Dynamic.literal(query = query)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[QueryRequestSql]
  }
}

