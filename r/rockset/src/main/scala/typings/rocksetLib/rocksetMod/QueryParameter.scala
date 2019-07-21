package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameter extends js.Object {
  // name of the field
  var name: java.lang.String
  // data type of the field
  var `type`: java.lang.String
  // literal value of the field
  var value: java.lang.String
}

object QueryParameter {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String, value: java.lang.String): QueryParameter = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[QueryParameter]
  }
}

