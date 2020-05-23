package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  var attribute: String
  var collate: String
  var length: Double
  var order: String
}

object Attribute {
  @scala.inline
  def apply(attribute: String, collate: String, length: Double, order: String): Attribute = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], collate = collate.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

