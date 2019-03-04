package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attribute extends js.Object {
  var attribute: java.lang.String
  var collate: java.lang.String
  var length: scala.Double
  var order: java.lang.String
}

object Anon_Attribute {
  @scala.inline
  def apply(
    attribute: java.lang.String,
    collate: java.lang.String,
    length: scala.Double,
    order: java.lang.String
  ): Anon_Attribute = {
    val __obj = js.Dynamic.literal(attribute = attribute, collate = collate, length = length, order = order)
  
    __obj.asInstanceOf[Anon_Attribute]
  }
}

