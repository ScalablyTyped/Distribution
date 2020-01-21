package typings.std

import typings.std.stdStrings.byob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonByob extends js.Object {
  var mode: byob
}

object AnonByob {
  @scala.inline
  def apply(mode: byob): AnonByob = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonByob]
  }
}

