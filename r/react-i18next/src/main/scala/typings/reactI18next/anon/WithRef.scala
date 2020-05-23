package typings.reactI18next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithRef extends js.Object {
  var withRef: js.UndefOr[Boolean] = js.undefined
}

object WithRef {
  @scala.inline
  def apply(withRef: js.UndefOr[Boolean] = js.undefined): WithRef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithRef]
  }
}

