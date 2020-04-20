package typings.primereact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var name: String
  var value: js.Any
}

object AnonId {
  @scala.inline
  def apply(id: String, name: String, value: js.Any): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

