package typings.revalidate.revalidateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Multiple extends js.Object {
  var multiple: js.UndefOr[Boolean] = js.undefined
}

object Multiple {
  @scala.inline
  def apply(multiple: js.UndefOr[Boolean] = js.undefined): Multiple = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multiple]
  }
}

