package typings.primereact.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var id: String
  var name: String
  var value: Date | js.Array[Date]
}

object Name {
  @scala.inline
  def apply(id: String, name: String, value: Date | js.Array[Date]): Name = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

