package typings.primereact

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var id: String
  var name: String
  var value: Date | js.Array[Date]
}

object AnonName {
  @scala.inline
  def apply(id: String, name: String, value: Date | js.Array[Date]): AnonName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

