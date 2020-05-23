package typings.squareConnect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait In extends js.Object {
  var in: String
  var name: String
  var `type`: String
}

object In {
  @scala.inline
  def apply(in: String, name: String, `type`: String): In = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[In]
  }
}

