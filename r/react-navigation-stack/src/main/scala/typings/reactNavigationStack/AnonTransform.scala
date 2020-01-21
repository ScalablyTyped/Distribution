package typings.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTransform extends js.Object {
  var transform: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonTransform {
  @scala.inline
  def apply(transform: js.UndefOr[scala.Nothing] = js.undefined): AnonTransform = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(transform)) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTransform]
  }
}

