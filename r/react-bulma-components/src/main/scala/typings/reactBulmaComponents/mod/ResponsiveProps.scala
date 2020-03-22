package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.AnonDesktop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveProps extends js.Object {
  var responsive: js.UndefOr[AnonDesktop] = js.undefined
}

object ResponsiveProps {
  @scala.inline
  def apply(responsive: AnonDesktop = null): ResponsiveProps = {
    val __obj = js.Dynamic.literal()
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveProps]
  }
}

