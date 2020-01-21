package typings.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParsed extends js.Object {
  var parsed: js.UndefOr[js.Any] = js.undefined
  var raw: String
}

object AnonParsed {
  @scala.inline
  def apply(raw: String, parsed: js.Any = null): AnonParsed = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    if (parsed != null) __obj.updateDynamic("parsed")(parsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParsed]
  }
}

