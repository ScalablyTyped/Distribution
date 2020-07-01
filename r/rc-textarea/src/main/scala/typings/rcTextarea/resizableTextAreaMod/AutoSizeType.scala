package typings.rcTextarea.resizableTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSizeType extends js.Object {
  var maxRows: js.UndefOr[Double] = js.undefined
  var minRows: js.UndefOr[Double] = js.undefined
}

object AutoSizeType {
  @scala.inline
  def apply(maxRows: js.UndefOr[Double] = js.undefined, minRows: js.UndefOr[Double] = js.undefined): AutoSizeType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxRows)) __obj.updateDynamic("maxRows")(maxRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minRows)) __obj.updateDynamic("minRows")(minRows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoSizeType]
  }
}

