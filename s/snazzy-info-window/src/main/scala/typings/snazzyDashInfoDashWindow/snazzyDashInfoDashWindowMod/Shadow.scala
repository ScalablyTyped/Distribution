package typings.snazzyDashInfoDashWindow.snazzyDashInfoDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shadow extends js.Object {
  var blur: js.UndefOr[String] = js.undefined
  var color: String
  var h: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[String] = js.undefined
  var spread: js.UndefOr[String] = js.undefined
  var v: js.UndefOr[String] = js.undefined
}

object Shadow {
  @scala.inline
  def apply(
    color: String,
    blur: String = null,
    h: String = null,
    opacity: String = null,
    spread: String = null,
    v: String = null
  ): Shadow = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (spread != null) __obj.updateDynamic("spread")(spread.asInstanceOf[js.Any])
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shadow]
  }
}

