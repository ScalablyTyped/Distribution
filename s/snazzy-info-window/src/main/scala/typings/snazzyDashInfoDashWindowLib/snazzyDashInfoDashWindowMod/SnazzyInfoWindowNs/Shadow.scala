package typings
package snazzyDashInfoDashWindowLib.snazzyDashInfoDashWindowMod.SnazzyInfoWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shadow extends js.Object {
  var blur: js.UndefOr[java.lang.String] = js.undefined
  var color: java.lang.String
  var h: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[java.lang.String] = js.undefined
  var spread: js.UndefOr[java.lang.String] = js.undefined
  var v: js.UndefOr[java.lang.String] = js.undefined
}

object Shadow {
  @scala.inline
  def apply(
    color: java.lang.String,
    blur: java.lang.String = null,
    h: java.lang.String = null,
    opacity: java.lang.String = null,
    spread: java.lang.String = null,
    v: java.lang.String = null
  ): Shadow = {
    val __obj = js.Dynamic.literal(color = color)
    if (blur != null) __obj.updateDynamic("blur")(blur)
    if (h != null) __obj.updateDynamic("h")(h)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    if (spread != null) __obj.updateDynamic("spread")(spread)
    if (v != null) __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[Shadow]
  }
}

