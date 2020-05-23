package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorConfig extends js.Object {
  val maxRows: js.UndefOr[Double] = js.undefined
  val minRows: js.UndefOr[Double] = js.undefined
}

object EditorConfig {
  @scala.inline
  def apply(maxRows: js.UndefOr[Double] = js.undefined, minRows: js.UndefOr[Double] = js.undefined): EditorConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxRows)) __obj.updateDynamic("maxRows")(maxRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minRows)) __obj.updateDynamic("minRows")(minRows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorConfig]
  }
}

