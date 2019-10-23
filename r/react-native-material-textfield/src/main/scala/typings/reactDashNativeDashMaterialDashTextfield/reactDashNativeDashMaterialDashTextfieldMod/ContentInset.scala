package typings.reactDashNativeDashMaterialDashTextfield.reactDashNativeDashMaterialDashTextfieldMod

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
  def apply(input: Int | Double = null, label: Int | Double = null, top: Int | Double = null): ContentInset = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentInset]
  }
}

