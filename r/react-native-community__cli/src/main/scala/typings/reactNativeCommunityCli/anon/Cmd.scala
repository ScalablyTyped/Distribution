package typings.reactNativeCommunityCli.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cmd extends js.Object {
  var cmd: String
  var desc: String
}

object Cmd {
  @scala.inline
  def apply(cmd: String, desc: String): Cmd = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cmd]
  }
}

