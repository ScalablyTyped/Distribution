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
    val __obj = js.Dynamic.literal(attribute = attribute, collate = collate, length = length, order = order)
  
    __obj.asInstanceOf[Anon_Attribute]
  }
}

