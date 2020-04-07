package typings.storybookUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName extends js.Object {
  var className: String
  var isSelected: js.UndefOr[Boolean] = js.undefined
}

object AnonClassName {
  @scala.inline
  def apply(className: String, isSelected: js.UndefOr[Boolean] = js.undefined): AnonClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassName]
  }
}

