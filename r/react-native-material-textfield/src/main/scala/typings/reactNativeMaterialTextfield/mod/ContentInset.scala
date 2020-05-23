package typings.reactNativeMaterialTextfield.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentInset extends js.Object {
  var input: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object ContentInset {
  @scala.inline
  def apply(
    input: js.UndefOr[Double] = js.undefined,
    label: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): ContentInset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input.get.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentInset]
  }
}

