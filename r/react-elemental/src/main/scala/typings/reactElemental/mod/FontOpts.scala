package typings.reactElemental.mod

import typings.reactElemental.AnonBoldRegular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontOpts extends js.Object {
  var primary: js.UndefOr[AnonBoldRegular] = js.undefined
  var secondary: js.UndefOr[AnonBoldRegular] = js.undefined
}

object FontOpts {
  @scala.inline
  def apply(primary: AnonBoldRegular = null, secondary: AnonBoldRegular = null): FontOpts = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontOpts]
  }
}

