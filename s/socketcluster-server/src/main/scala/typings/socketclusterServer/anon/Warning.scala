package typings.socketclusterServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Warning extends js.Object {
  var warning: typings.std.Error
}

object Warning {
  @scala.inline
  def apply(warning: typings.std.Error): Warning = {
    val __obj = js.Dynamic.literal(warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
}

