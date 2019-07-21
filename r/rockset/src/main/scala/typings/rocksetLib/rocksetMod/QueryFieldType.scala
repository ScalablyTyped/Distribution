package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryFieldType extends js.Object {
  // name of the field
  var name: java.lang.String
  // data type of the field
  var `type`: java.lang.String
}

object QueryFieldType {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String): QueryFieldType = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[QueryFieldType]
  }
}

