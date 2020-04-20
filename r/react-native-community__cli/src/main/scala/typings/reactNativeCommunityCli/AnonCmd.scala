package typings.reactNativeCommunityCli

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCmd extends js.Object {
  var cmd: String
  var desc: String
}

object AnonCmd {
  @scala.inline
  def apply(cmd: String, desc: String): AnonCmd = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCmd]
  }
}

