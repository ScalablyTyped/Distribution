package typings.react

import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRefExclude extends js.Object {
  var ref: js.UndefOr[Exclude[_, String]] = js.undefined
}

object AnonRefExclude {
  @scala.inline
  def apply(ref: Exclude[_, String] = null): AnonRefExclude = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRefExclude]
  }
}

