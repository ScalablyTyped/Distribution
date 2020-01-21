package typings.reactI18next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWithRef extends js.Object {
  var withRef: js.UndefOr[Boolean] = js.undefined
}

object AnonWithRef {
  @scala.inline
  def apply(withRef: js.UndefOr[Boolean] = js.undefined): AnonWithRef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWithRef]
  }
}

