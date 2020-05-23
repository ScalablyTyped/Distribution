package typings.sipJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parsed extends js.Object {
  var parsed: js.UndefOr[js.Any] = js.undefined
  var raw: String
}

object Parsed {
  @scala.inline
  def apply(raw: String, parsed: js.Any = null): Parsed = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    if (parsed != null) __obj.updateDynamic("parsed")(parsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parsed]
  }
}

