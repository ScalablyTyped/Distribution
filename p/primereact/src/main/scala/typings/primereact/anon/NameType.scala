package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameType extends js.Object {
  var id: String
  var name: String
  var `type`: String
  var value: Boolean
}

object NameType {
  @scala.inline
  def apply(id: String, name: String, `type`: String, value: Boolean): NameType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameType]
  }
}

