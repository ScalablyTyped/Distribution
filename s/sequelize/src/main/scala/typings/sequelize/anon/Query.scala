package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var query: String
  var values: js.Array[_]
}

object Query {
  @scala.inline
  def apply(query: String, values: js.Array[_]): Query = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

