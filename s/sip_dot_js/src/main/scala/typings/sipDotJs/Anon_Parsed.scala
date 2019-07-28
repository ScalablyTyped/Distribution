package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Parsed extends js.Object {
  var parsed: js.UndefOr[js.Any] = js.undefined
  var raw: String
}

object Anon_Parsed {
  @scala.inline
  def apply(raw: String, parsed: js.Any = null): Anon_Parsed = {
    val __obj = js.Dynamic.literal(raw = raw)
    if (parsed != null) __obj.updateDynamic("parsed")(parsed)
    __obj.asInstanceOf[Anon_Parsed]
  }
}

