package typings.reactColor.anon

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<reactcss.reactcss.Classes<any>> */
trait PartialClassesany extends js.Object {
  var default: js.UndefOr[Partial[_]] = js.undefined
}

object PartialClassesany {
  @scala.inline
  def apply(default: Partial[_] = null): PartialClassesany = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassesany]
  }
}

