package typings.staticmaps.anon

import typings.staticmaps.mod.ZoomLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Max extends js.Object {
  var max: js.UndefOr[ZoomLevel] = js.undefined
  var min: js.UndefOr[ZoomLevel] = js.undefined
}

object Max {
  @scala.inline
  def apply(max: ZoomLevel = null, min: ZoomLevel = null): Max = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
}

