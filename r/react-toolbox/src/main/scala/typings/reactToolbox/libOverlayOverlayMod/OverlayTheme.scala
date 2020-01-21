package typings.reactToolbox.libOverlayOverlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayTheme extends js.Object {
  /**
    * Active class name.
    */
  var active: js.UndefOr[String] = js.undefined
  /**
    * Backdrop class name.
    */
  var backdrop: js.UndefOr[String] = js.undefined
  /**
    * Invisible class name.
    */
  var invisible: js.UndefOr[String] = js.undefined
  /**
    * Overlay class name.
    */
  var overlay: js.UndefOr[String] = js.undefined
}

object OverlayTheme {
  @scala.inline
  def apply(active: String = null, backdrop: String = null, invisible: String = null, overlay: String = null): OverlayTheme = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (invisible != null) __obj.updateDynamic("invisible")(invisible.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayTheme]
  }
}

