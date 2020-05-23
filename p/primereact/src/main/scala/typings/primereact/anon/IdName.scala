package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdName extends js.Object {
  var id: String
  var name: String
  var value: Boolean
}

object IdName {
  @scala.inline
  def apply(id: String, name: String, value: Boolean): IdName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdName]
  }
}

