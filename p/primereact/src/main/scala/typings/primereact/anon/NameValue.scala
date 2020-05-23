package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameValue extends js.Object {
  var id: String
  var name: String
  var value: Double
}

object NameValue {
  @scala.inline
  def apply(id: String, name: String, value: Double): NameValue = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameValue]
  }
}

