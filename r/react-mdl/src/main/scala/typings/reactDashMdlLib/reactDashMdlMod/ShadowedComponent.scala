package typings
package reactDashMdlLib.reactDashMdlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowedComponent extends js.Object {
  var shadow: js.UndefOr[scala.Double] = js.undefined
}

object ShadowedComponent {
  @scala.inline
  def apply(shadow: scala.Int | scala.Double = null): ShadowedComponent = {
    val __obj = js.Dynamic.literal()
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowedComponent]
  }
}

