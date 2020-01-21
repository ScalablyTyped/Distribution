package typings.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn extends js.Object {
  var column: String
  var condition: String
  var relation: String
}

object AnonColumn {
  @scala.inline
  def apply(column: String, condition: String, relation: String): AnonColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumn]
  }
}

