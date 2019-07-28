package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryFieldType extends js.Object {
  // name of the field
  var name: String
  // data type of the field
  var `type`: String
}

object QueryFieldType {
  @scala.inline
  def apply(name: String, `type`: String): QueryFieldType = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[QueryFieldType]
  }
}

