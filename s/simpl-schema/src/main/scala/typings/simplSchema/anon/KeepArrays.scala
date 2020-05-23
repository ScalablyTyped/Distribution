package typings.simplSchema.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeepArrays extends js.Object {
  var keepArrays: js.UndefOr[Boolean] = js.undefined
}

object KeepArrays {
  @scala.inline
  def apply(keepArrays: js.UndefOr[Boolean] = js.undefined): KeepArrays = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepArrays)) __obj.updateDynamic("keepArrays")(keepArrays.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepArrays]
  }
}

