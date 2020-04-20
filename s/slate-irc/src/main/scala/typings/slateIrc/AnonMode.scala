package typings.slateIrc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMode extends js.Object {
  var mode: String
  var name: String
}

object AnonMode {
  @scala.inline
  def apply(mode: String, name: String): AnonMode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMode]
  }
}

