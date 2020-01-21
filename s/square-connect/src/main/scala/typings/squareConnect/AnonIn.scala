package typings.squareConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIn extends js.Object {
  var in: String
  var name: String
  var `type`: String
}

object AnonIn {
  @scala.inline
  def apply(in: String, name: String, `type`: String): AnonIn = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIn]
  }
}

