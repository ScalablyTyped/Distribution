package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderButton extends js.Object {
  var command: js.UndefOr[String] = js.undefined
  var cssClass: js.UndefOr[String] = js.undefined
  var handler: js.UndefOr[js.Function] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var showOnHover: js.UndefOr[Boolean] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
}

object HeaderButton {
  @scala.inline
  def apply(
    command: String = null,
    cssClass: String = null,
    handler: js.Function = null,
    image: String = null,
    showOnHover: js.UndefOr[Boolean] = js.undefined,
    tooltip: String = null
  ): HeaderButton = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (image != null) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(showOnHover)) __obj.updateDynamic("showOnHover")(showOnHover)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[HeaderButton]
  }
}

