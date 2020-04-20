package typings.socketclusterServer

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWarning extends js.Object {
  var warning: Error
}

object AnonWarning {
  @scala.inline
  def apply(warning: Error): AnonWarning = {
    val __obj = js.Dynamic.literal(warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWarning]
  }
}

