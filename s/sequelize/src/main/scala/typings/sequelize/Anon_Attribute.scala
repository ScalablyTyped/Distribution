package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attribute extends js.Object {
  var attribute: String
  var collate: String
  var length: Double
  var order: String
}

object Anon_Attribute {
  @scala.inline
  def apply(attribute: String, collate: String, length: Double, order: String): Anon_Attribute = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], collate = collate.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Attribute]
  }
}

