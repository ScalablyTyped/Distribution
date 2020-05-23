package typings.reactElemental.mod

import typings.reactElemental.anon.Regular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontOpts extends js.Object {
  var primary: js.UndefOr[Regular] = js.undefined
  var secondary: js.UndefOr[Regular] = js.undefined
}

object FontOpts {
  @scala.inline
  def apply(primary: Regular = null, secondary: Regular = null): FontOpts = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontOpts]
  }
}

