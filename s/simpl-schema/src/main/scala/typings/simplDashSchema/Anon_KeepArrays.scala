package typings.simplDashSchema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeepArrays extends js.Object {
  var keepArrays: js.UndefOr[Boolean] = js.undefined
}

object Anon_KeepArrays {
  @scala.inline
  def apply(keepArrays: js.UndefOr[Boolean] = js.undefined): Anon_KeepArrays = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepArrays)) __obj.updateDynamic("keepArrays")(keepArrays.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeepArrays]
  }
}

