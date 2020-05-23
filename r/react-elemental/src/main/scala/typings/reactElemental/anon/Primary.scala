package typings.reactElemental.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Primary extends js.Object {
  val primary: js.UndefOr[Bold] = js.undefined
  val secondary: js.UndefOr[Bold] = js.undefined
}

object Primary {
  @scala.inline
  def apply(primary: Bold = null, secondary: Bold = null): Primary = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Primary]
  }
}

