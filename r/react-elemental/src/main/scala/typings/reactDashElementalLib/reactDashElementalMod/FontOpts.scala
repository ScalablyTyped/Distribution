package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontOpts extends js.Object {
  var primary: js.UndefOr[reactDashElementalLib.Anon_BoldRegular] = js.undefined
  var secondary: js.UndefOr[reactDashElementalLib.Anon_BoldRegular] = js.undefined
}

object FontOpts {
  @scala.inline
  def apply(
    primary: reactDashElementalLib.Anon_BoldRegular = null,
    secondary: reactDashElementalLib.Anon_BoldRegular = null
  ): FontOpts = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary)
    if (secondary != null) __obj.updateDynamic("secondary")(secondary)
    __obj.asInstanceOf[FontOpts]
  }
}

