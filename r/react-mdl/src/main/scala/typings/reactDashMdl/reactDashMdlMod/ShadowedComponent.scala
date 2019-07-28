package typings.reactDashMdl.reactDashMdlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowedComponent extends js.Object {
  var shadow: js.UndefOr[Double] = js.undefined
}

object ShadowedComponent {
  @scala.inline
  def apply(shadow: Int | Double = null): ShadowedComponent = {
    val __obj = js.Dynamic.literal()
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowedComponent]
  }
}

