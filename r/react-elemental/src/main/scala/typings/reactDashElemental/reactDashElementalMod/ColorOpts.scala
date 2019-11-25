package typings.reactDashElemental.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorOpts extends js.Object {
  var primary: js.UndefOr[String] = js.undefined
  var primaryDark: js.UndefOr[String] = js.undefined
  var primaryLight: js.UndefOr[String] = js.undefined
}

object ColorOpts {
  @scala.inline
  def apply(primary: String = null, primaryDark: String = null, primaryLight: String = null): ColorOpts = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (primaryDark != null) __obj.updateDynamic("primaryDark")(primaryDark.asInstanceOf[js.Any])
    if (primaryLight != null) __obj.updateDynamic("primaryLight")(primaryLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorOpts]
  }
}

