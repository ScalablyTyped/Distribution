package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuery extends js.Object {
  var query: String
  var values: js.Array[_]
}

object AnonQuery {
  @scala.inline
  def apply(query: String, values: js.Array[_]): AnonQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQuery]
  }
}

