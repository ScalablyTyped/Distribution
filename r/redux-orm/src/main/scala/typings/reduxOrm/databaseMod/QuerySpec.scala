package typings.reduxOrm.databaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuerySpec extends js.Object {
  var query: Query
}

object QuerySpec {
  @scala.inline
  def apply(query: Query): QuerySpec = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySpec]
  }
}

