package typings.reactMdl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowedComponent extends js.Object {
  var shadow: js.UndefOr[Double] = js.undefined
}

object ShadowedComponent {
  @scala.inline
  def apply(shadow: js.UndefOr[Double] = js.undefined): ShadowedComponent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowedComponent]
  }
}

