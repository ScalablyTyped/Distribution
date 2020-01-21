package typings.reactElemental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrimary extends js.Object {
  val primary: js.UndefOr[AnonBold] = js.undefined
  val secondary: js.UndefOr[AnonBold] = js.undefined
}

object AnonPrimary {
  @scala.inline
  def apply(primary: AnonBold = null, secondary: AnonBold = null): AnonPrimary = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrimary]
  }
}

