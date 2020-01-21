package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldType extends js.Object {
  var dataTypeId: Double
  var name: String
}

object FieldType {
  @scala.inline
  def apply(dataTypeId: Double, name: String): FieldType = {
    val __obj = js.Dynamic.literal(dataTypeId = dataTypeId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldType]
  }
}

