package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderButton extends js.Object {
  var command: js.UndefOr[java.lang.String] = js.undefined
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  var handler: js.UndefOr[js.Function] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var showOnHover: js.UndefOr[scala.Boolean] = js.undefined
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object HeaderButton {
  @scala.inline
  def apply(
    command: java.lang.String = null,
    cssClass: java.lang.String = null,
    handler: js.Function = null,
    image: java.lang.String = null,
    showOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    tooltip: java.lang.String = null
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

