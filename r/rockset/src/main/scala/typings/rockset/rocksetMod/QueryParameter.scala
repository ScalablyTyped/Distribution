package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameter extends js.Object {
  // name of the field
  var name: String
  // data type of the field
  var `type`: String
  // literal value of the field
  var value: String
}

object QueryParameter {
  @scala.inline
  def apply(name: String, `type`: String, value: String): QueryParameter = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[QueryParameter]
  }
}

