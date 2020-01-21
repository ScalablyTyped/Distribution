package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Features extends js.Object {
  val imageEditor: js.UndefOr[Boolean] = js.undefined
  val preview: js.UndefOr[Boolean] = js.undefined
  val undoRedo: js.UndefOr[Boolean] = js.undefined
}

object Features {
  @scala.inline
  def apply(
    imageEditor: js.UndefOr[Boolean] = js.undefined,
    preview: js.UndefOr[Boolean] = js.undefined,
    undoRedo: js.UndefOr[Boolean] = js.undefined
  ): Features = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(imageEditor)) __obj.updateDynamic("imageEditor")(imageEditor.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (!js.isUndefined(undoRedo)) __obj.updateDynamic("undoRedo")(undoRedo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
}

