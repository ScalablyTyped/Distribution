package typings.atStorybookUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: String
  var isSelected: js.UndefOr[Boolean] = js.undefined
}

object Anon_ClassName {
  @scala.inline
  def apply(className: String, isSelected: js.UndefOr[Boolean] = js.undefined): Anon_ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassName]
  }
}

