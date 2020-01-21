package typings.sharp

import typings.sharp.mod.Raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRaw extends js.Object {
  var raw: Raw
}

object AnonRaw {
  @scala.inline
  def apply(raw: Raw): AnonRaw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRaw]
  }
}

