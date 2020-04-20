package typings.std

import typings.std.stdStrings.byob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMode extends js.Object {
  var mode: byob
}

object AnonMode {
  @scala.inline
  def apply(mode: byob): AnonMode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMode]
  }
}

