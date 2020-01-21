package typings.react

import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRefAny extends js.Object {
  var ref: js.UndefOr[Exclude[_, String]] = js.undefined
}

object AnonRefAny {
  @scala.inline
  def apply(ref: Exclude[_, String] = null): AnonRefAny = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRefAny]
  }
}

