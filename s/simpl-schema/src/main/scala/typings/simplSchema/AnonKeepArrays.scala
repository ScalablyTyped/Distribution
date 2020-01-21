package typings.simplSchema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeepArrays extends js.Object {
  var keepArrays: js.UndefOr[Boolean] = js.undefined
}

object AnonKeepArrays {
  @scala.inline
  def apply(keepArrays: js.UndefOr[Boolean] = js.undefined): AnonKeepArrays = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepArrays)) __obj.updateDynamic("keepArrays")(keepArrays.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeepArrays]
  }
}

