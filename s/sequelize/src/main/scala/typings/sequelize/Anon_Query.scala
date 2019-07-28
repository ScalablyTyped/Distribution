package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Query extends js.Object {
  var query: String
  var values: js.Array[_]
}

object Anon_Query {
  @scala.inline
  def apply(query: String, values: js.Array[_]): Anon_Query = {
    val __obj = js.Dynamic.literal(query = query, values = values)
  
    __obj.asInstanceOf[Anon_Query]
  }
}

